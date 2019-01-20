package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.Application;
import io.swagger.model.User;
import io.swagger.repositories.ApplicationRepository;
import io.swagger.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Controller
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(ApplicationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> addUser(@ApiParam(value = "", required = true) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            body.setApplication(applications.get(0));
            userRepository.save(body);
            return new ResponseEntity<User>(body, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<User>(HttpStatus.FORBIDDEN);
        }


    }
}
