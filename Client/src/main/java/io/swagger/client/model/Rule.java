/*
 * WP2-AMT
 * Work package 2 of the AMT course. Gamification API
 *
 * OpenAPI spec version: 0.1.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Badge;
import io.swagger.client.model.PointScale;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Rule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-20T21:00:28.938Z[GMT]")public class Rule {

  @SerializedName("name")
  private String name = null;

  @SerializedName("pointScale")
  private PointScale pointScale = null;

  @SerializedName("target")
  private Integer target = null;

  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("badge")
  private Badge badge = null;
  public Rule name(String name) {
    this.name = name;
    return this;
  }



  /**
  * Get name
  * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Rule pointScale(PointScale pointScale) {
    this.pointScale = pointScale;
    return this;
  }



  /**
  * Get pointScale
  * @return pointScale
  **/
  @Schema(required = true, description = "")
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
  @Schema(required = true, description = "")
  public Integer getTarget() {
    return target;
  }
  public void setTarget(Integer target) {
    this.target = target;
  }
  public Rule eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }



  /**
  * Get operator
  * @return operator
  **/
  @Schema(description = "")
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
  * Get reward
  * @return reward
  **/
  @Schema(required = true, description = "")
  public Badge getBadge() {
    return badge;
  }
  public void setBadge(Badge reward) {
    this.badge = reward;
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
    return Objects.equals(this.name, rule.name) &&
        Objects.equals(this.pointScale, rule.pointScale) &&
        Objects.equals(this.target, rule.target) &&
        Objects.equals(this.eventType, rule.eventType) &&
        Objects.equals(this.badge, rule.badge);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, pointScale, target, eventType, badge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");

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