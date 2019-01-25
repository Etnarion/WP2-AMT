package io.swagger.api;

import com.google.common.collect.Lists;
import io.swagger.model.Application;
import io.swagger.model.PointScale;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repositories.ApplicationRepository;
import io.swagger.repositories.PointScaleRepository;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-29T14:13:15.466Z[GMT]")

@Controller
public class PointScalesApiController implements PointScalesApi {

    private static final Logger log = LoggerFactory.getLogger(PointScalesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private PointScaleRepository pointScaleRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public PointScalesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPointScale(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PointScale body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            body.setApplication(applications.get(0));
            pointScaleRepository.save(body);
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest().path("/{id}")
                    .buildAndExpand(body.getId()).toUri();

            return ResponseEntity.created(location).build();
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<PointScale> findPointScale(@ApiParam(value = "",required=true) @PathVariable("pointScaleId") Integer pointScaleId) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        PointScale pointScale = pointScaleRepository.findOne(pointScaleId);
        if (pointScale != null && pointScale.getApplication().getToken().equals(token)) {
            return new ResponseEntity<PointScale>(pointScale, HttpStatus.OK);
        } else {
            return new ResponseEntity<PointScale>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<PointScale>> getPointScales() {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        List<Application> applications = applicationRepository.findByToken(token);
        if (applications.size() == 1) {
            ArrayList<PointScale> pointScales = Lists.newArrayList(pointScaleRepository.findByApplication(applications.get(0)));
            if (pointScales != null) {
                return new ResponseEntity<List<PointScale>>(pointScales, HttpStatus.OK);
            } else {
                return new ResponseEntity<List<PointScale>>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<List<PointScale>>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Void> updatePointScale(@ApiParam(value = ""  )  @Valid @RequestBody PointScale body) {
        String accept = request.getHeader("Accept");
        String token = request.getHeader("Authorization");
        if (body.getApplication().getToken().equals(token)) {
            pointScaleRepository.save(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

    }

}
