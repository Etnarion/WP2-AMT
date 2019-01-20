package io.swagger.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User_scores")
public class UserScore implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "user_score_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pointscale_id")
    private PointScale pointScale;

    private int score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
