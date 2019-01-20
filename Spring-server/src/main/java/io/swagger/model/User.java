package io.swagger.model;

/**
 * @document User
 * @date 28.10.2018
 * @author Samuel Mayor, Alexandra Korukova, Pierre-Samuel Rochat and Arnold von Bauer Gauss
 * @Goal Model for user table
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.*;

/**
 * Application
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")
@Entity
public class User {
    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idUser = null;

    @OneToMany(targetEntity = UserScore.class, mappedBy = "user", fetch = FetchType.EAGER)
    private Set<UserScore> userScores = new HashSet<>();

    @OneToMany(targetEntity = UserBadge.class, mappedBy = "user", fetch = FetchType.EAGER)
    private Set<UserBadge> userBadges = new HashSet<>();

    public User id(Integer id) {
        this.idUser = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(required = false, value = "")
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Set<UserScore> getUserScores() {
        return userScores;
    }

    public void addUserScore(UserScore userScore) {
        this.userScores.add(userScore);
    }

    public void updateUserScore(Integer increment, PointScale pointScale) {
        for (UserScore score : this.getUserScores()) {
            if (score.getPointScale() == pointScale) {
                score.setScore(score.getScore() + increment);
            }
        }
    }

    public Set<UserBadge> getUserBadges() {
        return userBadges;
    }

    public void addUserBadge(UserBadge userBadge) {
        this.userBadges.add(userBadge);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.idUser, user.idUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Application {\n");

        sb.append("    id: ").append(toIndentedString(idUser)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}