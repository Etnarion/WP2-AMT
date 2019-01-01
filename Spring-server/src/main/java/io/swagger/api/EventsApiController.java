package io.swagger.api;

import com.google.common.collect.Lists;
import io.swagger.model.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repositories.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Controller
public class EventsApiController implements EventsApi {

    private static final Logger log = LoggerFactory.getLogger(EventsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private EventRepository eventRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public EventsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addEvent(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Event body) {
        String accept = request.getHeader("Accept");
        eventRepository.save(body);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    public ResponseEntity<Event> findEvent(@ApiParam(value = "",required=true) @PathVariable("eventId") Integer eventId) {
        String accept = request.getHeader("Accept");
        Event event = eventRepository.findOne(eventId);
        if (event != null) {
            return new ResponseEntity<Event>(event, HttpStatus.OK);
        } else {
            return new ResponseEntity<Event>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Event>> getEvents() {
        String accept = request.getHeader("Accept");
        ArrayList<Event> events = Lists.newArrayList(eventRepository.findAll());
        if (events != null) {
            return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Event>> getUserEvents(@ApiParam(value = "",required=true) @PathVariable("userId") Integer userId) {
        String accept = request.getHeader("Accept");
        ArrayList<Event> events = Lists.newArrayList(eventRepository.findByUserId(userId));
        if (events != null) {
            return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
        }
    }

}
