package io.swagger.api;

import io.swagger.model.Application;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Api(value = "applications", description = "the applications API")
public interface ApplicationsApi {

    @ApiOperation(value = "Creates a new application.", nickname = "addApplication", notes = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created", response = String.class) })
    @RequestMapping(value = "/applications",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<String> addApplication(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Application body);
}
