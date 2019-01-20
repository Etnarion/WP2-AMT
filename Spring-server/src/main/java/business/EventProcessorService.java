package business;

import io.swagger.model.Event;
import io.swagger.model.Rule;

import java.util.List;

public interface EventProcessorService {
    void processEvent(Event event, List<Rule> rules, String token);
}
