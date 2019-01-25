package io.swagger.api;

import com.google.common.collect.Lists;
import io.swagger.model.Application;
import io.swagger.model.Badge;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repositories.ApplicationRepository;
import io.swagger.repositories.BadgeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Controller
public class BadgesApiController implements BadgesApi {

    private static final Logger log = LoggerFactory.getLogger(BadgesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public BadgesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addBadge(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Badge body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            Application application = applications.get(0);
            body.setApplication(application);
            badgeRepository.save(body);
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest().path("/{id}")
                    .buildAndExpand(body.getId()).toUri();

            return ResponseEntity.created(location).build();
        } else {
            return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);
        }

    }

    public ResponseEntity<Badge> findBadge(@ApiParam(value = "",required=true) @PathVariable("badgeId") Integer badgeId) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        Badge badge = badgeRepository.findOne(badgeId);
        if (badge != null) {
            return new ResponseEntity<Badge>(badge, HttpStatus.OK);
        } else {
            return new ResponseEntity<Badge>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Badge>> getBadges() {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            ArrayList<Badge> badges = Lists.newArrayList(badgeRepository.findByApplication(applications.get(0)));
            if (badges != null) {
                return new ResponseEntity<List<Badge>>(badges, HttpStatus.OK);
            } else {
                return new ResponseEntity<List<Badge>>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<List<Badge>>(HttpStatus.FORBIDDEN);
        }
    }

    public ResponseEntity<Void> updateBadge(@ApiParam(value = ""  )  @Valid @RequestBody Badge body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        if (body.getApplication().getToken().equals(token)) {
            badgeRepository.save(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

}
