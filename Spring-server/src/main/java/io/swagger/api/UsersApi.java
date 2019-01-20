package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Creates a new user.", nickname = "addUser", notes = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created") })
    @RequestMapping(value = "/users",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<User> addUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body);
}
