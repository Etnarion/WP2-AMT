package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Property;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")
@Entity
public class Event   {
  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Integer idEvent = null;

  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("properties")
  @Valid
  @OneToMany(targetEntity = Property.class, fetch = FetchType.EAGER, cascade=CascadeType.ALL)
  private List<Property> properties = new ArrayList<Property>();

  @JsonProperty("application")
  @JoinColumn(name="idx_application")
  @ManyToOne(targetEntity = Application.class)
  private Application application = null;

  public Event id(Integer id) {
    this.idEvent = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = false, value = "")


  public Integer getId() {
    return idEvent;
  }

  public void setId(Integer id) {
    this.idEvent = id;
  }

  public Event userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


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
  @ApiModelProperty(required = true, value = "")
  @NotNull


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
  @ApiModelProperty(required = true, value = "")
  @NotNull


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
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
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
    Event event = (Event) o;
    return Objects.equals(this.idEvent, event.idEvent) &&
        Objects.equals(this.userId, event.userId) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.timestamp, event.timestamp) &&
        Objects.equals(this.properties, event.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEvent, userId, eventType, timestamp, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(idEvent)).append("\n");
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

