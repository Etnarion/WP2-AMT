package io.swagger.api;

import io.swagger.model.PointScale;
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
public class PointScalesApiController implements PointScalesApi {

    private static final Logger log = LoggerFactory.getLogger(PointScalesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PointScalesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPointScale(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PointScale body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PointScale> findPointScale(@ApiParam(value = "",required=true) @PathVariable("pointScaleId") Integer pointScaleId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<PointScale>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PointScale>> getPointScales() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<PointScale>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePointScale(@ApiParam(value = ""  )  @Valid @RequestBody PointScale body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
