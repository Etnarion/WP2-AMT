package io.swagger.api;

import business.EventProcessorService;
import com.google.common.collect.Lists;
import io.swagger.model.Application;
import io.swagger.model.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repositories.ApplicationRepository;
import io.swagger.repositories.EventRepository;
import io.swagger.repositories.RuleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

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
    private EventProcessorService eventProcessor;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private RuleRepository ruleRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public EventsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addEvent(@RequestHeader(value = "Authorization") String headerStr, @ApiParam(value = "" ,required=true )  @Valid @RequestBody Event body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            body.setApplication(applications.get(0));
            eventRepository.save(body);
            eventProcessor.processEvent(body, ruleRepository.findByApplication(applications.get(0)), token);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Event> findEvent(@RequestHeader(value = "Authorization") String headerStr, @ApiParam(value = "",required=true) @PathVariable("eventId") Integer eventId) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        Event event = eventRepository.findOne(eventId);
        if (event != null && event.getApplication().getToken().equals(token)) {
            return new ResponseEntity<Event>(event, HttpStatus.OK);
        } else {
            return new ResponseEntity<Event>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Event>> getEvents(@RequestHeader(value = "Authorization") String headerStr) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            ArrayList<Event> events = Lists.newArrayList(eventRepository.findByApplication(applications.get(0)));
            if (events != null) {
                return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
            } else {
                return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Event>> getUserEvents(@RequestHeader(value = "Authorization") String headerStr, @ApiParam(value = "",required=true) @PathVariable("userId") Integer userId) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            ArrayList<Event> events = Lists.newArrayList(eventRepository.findByUserIdAndApplication(userId, applications.get(0)));
            if (events != null) {
                return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
            } else {
                return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<List<Event>>(HttpStatus.NOT_FOUND);
        }
    }

}
