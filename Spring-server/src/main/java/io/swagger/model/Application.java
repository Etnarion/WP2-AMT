package io.swagger.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Application
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")
@Entity
public class Application {
    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idApplication = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("token")
    private String token = null;

    public Application id(Integer id) {
        this.idApplication = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(required = false, value = "")
    public Integer getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(Integer idApplication) {
        this.idApplication = idApplication;
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
     * Get token
     * @return token
     **/
    @ApiModelProperty(required = true, value = "")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Application application = (Application) o;
        return Objects.equals(this.idApplication, application.idApplication) &&
                Objects.equals(this.name, application.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idApplication, name, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Application {\n");

        sb.append("    id: ").append(toIndentedString(idApplication)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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