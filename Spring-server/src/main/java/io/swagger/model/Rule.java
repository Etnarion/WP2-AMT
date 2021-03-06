package io.swagger.model;

import java.util.Objects;

import business.EntityIdResolver;
import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Badge;
import io.swagger.model.PointScale;
import io.swagger.repositories.PointScaleRepository;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")
@Entity
public class Rule   {
  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Integer idRule = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pointScale")
  @JoinColumn(name="idx_point_scale", referencedColumnName = "id")
  @ManyToOne(targetEntity = PointScale.class)
  private PointScale pointScale = null;

  @JsonProperty("target")
  private Integer target = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("badge")
  @JoinColumn(name="idx_badge", referencedColumnName = "id")
  @ManyToOne(targetEntity = Badge.class)
  private Badge badge = null;

  @JsonProperty("application")
  @JoinColumn(name="idx_application")
  @ManyToOne(targetEntity = Application.class)
  private Application application = null;

  public Rule id(Integer id) {
    this.idRule = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = false, value = "")


  public Integer getId() {
    return idRule;
  }

  public void setId(Integer id) {
    this.idRule = id;
  }

  public Rule name(String name) {
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

  public Rule pointScale(Integer pointScaleId) {
    this.pointScale = pointScale;
    return this;
  }

  /**
   * Get pointScale
   * @return pointScale
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PointScale getPointScale() {
    return pointScale;
  }

  public void setPointScale(PointScale pointScale) {
    this.pointScale = pointScale;
  }

  public Rule target(Integer target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getTarget() {
    return target;
  }

  public void setTarget(Integer target) {
    this.target = target;
  }

  public Rule condition(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get event type
   * @return event type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Rule badge(Badge badge) {
    this.badge = badge;
    return this;
  }

  /**
   * Get badge
   * @return badge
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Badge getBadge() {
    return badge;
  }

  public void setBadge(Badge badge) {
    this.badge = badge;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.idRule, rule.idRule) &&
        Objects.equals(this.name, rule.name) &&
        Objects.equals(this.pointScale, rule.pointScale) &&
        Objects.equals(this.target, rule.target) &&
        Objects.equals(this.eventType, rule.eventType) &&
        Objects.equals(this.badge, rule.badge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRule, name, pointScale, target, eventType, badge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    id: ").append(toIndentedString(idRule)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pointScale: ").append(toIndentedString(pointScale)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    badge: ").append(toIndentedString(badge)).append("\n");
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

