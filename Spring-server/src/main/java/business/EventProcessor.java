package business;

import io.swagger.model.*;
import io.swagger.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventProcessor implements EventProcessorService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PointScaleRepository pointScaleRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private UserScoreRepository userScoreRepository;

    @Autowired
    private UserBadgeRepository userBadgeRepository;

    private EventProcessor() {}

    public void processEvent(Event event, List<Rule> rules, String token) {
        User user = userRepository.findOne(event.getUserId());
        if (user == null) {
            user = new User();
            List<Application> applications = applicationRepository.findByToken(token);
            if (applications.size() == 1) {
                for (PointScale pointScale : pointScaleRepository.findByApplication(applications.get(0))) {
                    UserScore userScore = new UserScore();
                    userScore.setPointScale(pointScale);
                    userScore.setUser(user);
                    userScore.setScore(0);
                    userScoreRepository.save(userScore);
                    user.addUserScore(userScore);
                }
            }
        }
        for (Rule rule : rules) {
            if (rule.getEventType().equals(event.getEventType())) {
                for (UserScore userScore : user.getUserScores()) {
                    if (userScore.getPointScale() == rule.getPointScale()) {
                        userScore.setScore(userScore.getScore() + 1);
                        if (userScore.getScore() == rule.getTarget()) {
                            UserBadge userBadge = new UserBadge();
                            userBadge.setBadge(rule.getReward());
                            userBadge.setUser(user);
                            user.addUserBadge(userBadge);
                            userBadgeRepository.save(userBadge);
                        }
                    }
                }
            }
        }
        userRepository.save(user);
    }
}
