package io.swagger.api;

import io.swagger.model.Application;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repositories.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Controller
public class ApplicationsApiController implements ApplicationsApi {

    private static final Logger log = LoggerFactory.getLogger(ApplicationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private ApplicationRepository applicationRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public ApplicationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Application> addApplication(@ApiParam(value = "", required = true) @Valid @RequestBody Application body) {
        String accept = request.getHeader("Accept");
        body.setToken(UUID.randomUUID().toString());
        applicationRepository.save(body);
        return new ResponseEntity<Application>(body, HttpStatus.CREATED);
    }
}
