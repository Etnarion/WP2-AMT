package io.swagger.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PointScale
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")
@Entity
public class PointScale   {
  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name = "id")
  private Integer idPointScale = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("application")
  @JoinColumn(name="idx_application")
  @ManyToOne(targetEntity = Application.class)
  private Application application = null;

  @OneToMany(targetEntity = UserScore.class, mappedBy = "pointScale", fetch = FetchType.EAGER)
  private Set<UserScore> userScores = new HashSet<>();

  public PointScale id(Integer id) {
    this.idPointScale = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = false, value = "")


  public Integer getId() {
    return idPointScale;
  }

  public void setId(Integer id) {
    this.idPointScale = id;
  }

  public PointScale name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get application
   * @return application
   **/
  @ApiModelProperty(required = true, value = "")

  @Valid
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Set<UserScore> getUserScores() {
    return userScores;
  }

  public void setUserScores(Set<UserScore> scores) {
    this.userScores = scores;
  }

  public void addUserGroup(UserScore userScore) {
    this.userScores.add(userScore);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointScale pointScale = (PointScale) o;
    return Objects.equals(this.idPointScale, pointScale.idPointScale) &&
        Objects.equals(this.name, pointScale.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPointScale, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointScale {\n");
    
    sb.append("    id: ").append(toIndentedString(idPointScale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

