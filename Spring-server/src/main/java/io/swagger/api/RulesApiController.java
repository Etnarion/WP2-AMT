package io.swagger.api;

import com.google.common.collect.Lists;
import io.swagger.model.Application;
import io.swagger.model.Error;
import io.swagger.model.Rule;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repositories.ApplicationRepository;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Controller
public class RulesApiController implements RulesApi {

    private static final Logger log = LoggerFactory.getLogger(RulesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private RuleRepository ruleRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public RulesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addRule(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Rule body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            body.setApplication(applications.get(0));
            ruleRepository.save(body);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Void> deleteRule(@ApiParam(value = "ID of rule to delete",required=true) @PathVariable("ruleId") Integer ruleId) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        Rule rule = ruleRepository.findOne(ruleId);
        if (rule != null && rule.getApplication().getToken().equals(token)) {
            ruleRepository.delete(rule);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Rule> findRule(@ApiParam(value = "",required=true) @PathVariable("ruleId") Integer ruleId) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        Rule rule = ruleRepository.findOne(ruleId);
        if (rule != null && rule.getApplication().getToken().equals(token)) {
            return new ResponseEntity<Rule>(rule, HttpStatus.OK);
        } else {
            return new ResponseEntity<Rule>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Rule>> getRules() {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            ArrayList<Rule> rules = Lists.newArrayList(ruleRepository.findByApplication(applications.get(0)));
            if (rules != null) {
                return new ResponseEntity<List<Rule>>(rules, HttpStatus.OK);
            } else {
                return new ResponseEntity<List<Rule>>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<List<Rule>>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Void> updateRule(@ApiParam(value = ""  )  @Valid @RequestBody Rule body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        if (body.getApplication().getToken().equals(token)) {
            ruleRepository.save(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

}
