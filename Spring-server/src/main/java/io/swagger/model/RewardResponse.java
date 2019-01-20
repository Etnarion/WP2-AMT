package io.swagger.model;

public class RewardResponse {
    private Integer score;
    private PointScale pointScale;
    private User user;
    private Badge badge;

    public RewardResponse() {

    }

    public RewardResponse(Integer score, PointScale pointScale, User user, Badge badge) {
        this.score = score;
        this.pointScale = pointScale;
        this.user = user;
        this.badge = badge;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public PointScale getPointScale() {
        return pointScale;
    }

    public void setPointScale(PointScale pointScale) {
        this.pointScale = pointScale;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

