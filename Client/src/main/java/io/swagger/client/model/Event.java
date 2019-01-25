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
import io.swagger.client.model.Property;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Event
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-20T21:00:28.938Z[GMT]")public class Event {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("properties")
  private List<Property> properties = new ArrayList<Property>();
  public Event id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Event userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * Get userId
  * @return userId
  **/
  @Schema(required = true, description = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public Event eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  

  /**
  * Get eventType
  * @return eventType
  **/
  @Schema(required = true, description = "")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }
  public Event timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  

  /**
  * Get timestamp
  * @return timestamp
  **/
  @Schema(required = true, description = "")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }
  public Event properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Event addPropertiesItem(Property propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

  /**
  * Get properties
  * @return properties
  **/
  @Schema(required = true, description = "")
  public List<Property> getProperties() {
    return properties;
  }
  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.userId, event.userId) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.timestamp, event.timestamp) &&
        Objects.equals(this.properties, event.properties);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, userId, eventType, timestamp, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
