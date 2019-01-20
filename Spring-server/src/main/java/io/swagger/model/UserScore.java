package io.swagger.model;

import javax.persistence.*;

@Entity
@Table(name = "User_scores")
public class UserScore {
    private long id;
    private User user;
    private PointScale pointScale;

    // additional fields
    private int score;

    @Id
    @GeneratedValue
    @Column(name = "user_score_id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pointscale_id")
    public PointScale getPointScale() {
        return pointScale;
    }

    public void setPointScale(PointScale pointScale) {
        this.pointScale = pointScale;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
