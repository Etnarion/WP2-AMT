/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.4-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Event;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "Creates a new event.", nickname = "addEvent", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created") })
    @RequestMapping(value = "/events",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addEvent(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Event body);


    @ApiOperation(value = "Returns an event by ID.", nickname = "findEvent", notes = "", response = Event.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Event.class) })
    @RequestMapping(value = "/events/{eventId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Event> findEvent(@ApiParam(value = "",required=true) @PathVariable("eventId") Integer eventId);


    @ApiOperation(value = "Returns an array of all events", nickname = "getEvents", notes = "", response = Event.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Event.class, responseContainer = "List") })
    @RequestMapping(value = "/events",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Event>> getEvents();


    @ApiOperation(value = "Returns all events of a user.", nickname = "getUserEvents", notes = "", response = Event.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Event.class, responseContainer = "List") })
    @RequestMapping(value = "/events/user/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Event>> getUserEvents(@ApiParam(value = "",required=true) @PathVariable("userId") Integer userId);

}