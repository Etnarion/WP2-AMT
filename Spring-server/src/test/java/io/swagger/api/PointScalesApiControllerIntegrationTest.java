package io.swagger.api;

import io.swagger.model.PointScale;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PointScalesApiControllerIntegrationTest {

    @Autowired
    private PointScalesApi api;

    @Test
    public void addPointScaleTest() throws Exception {
        PointScale body = new PointScale();
        ResponseEntity<Void> responseEntity = api.addPointScale(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void findPointScaleTest() throws Exception {
        Integer pointScaleId = 56;
        ResponseEntity<PointScale> responseEntity = api.findPointScale(pointScaleId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getPointScalesTest() throws Exception {
        ResponseEntity<List<PointScale>> responseEntity = api.getPointScales();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updatePointScaleTest() throws Exception {
        PointScale body = new PointScale();
        ResponseEntity<Void> responseEntity = api.updatePointScale(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
