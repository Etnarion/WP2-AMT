package io.swagger.api;

import io.swagger.model.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Controller
public class EventsApiController implements EventsApi {

    private static final Logger log = LoggerFactory.getLogger(EventsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EventsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addEvent(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Event body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Event> findEvent(@ApiParam(value = "",required=true) @PathVariable("eventId") Integer eventId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Event>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Event>> getEvents() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<Event>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Event>> getUserEvents(@ApiParam(value = "",required=true) @PathVariable("userId") Integer userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<Event>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
