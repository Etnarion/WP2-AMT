package io.swagger.api;

import io.swagger.model.Badge;

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
public class BadgesApiControllerIntegrationTest {

    @Autowired
    private BadgesApi api;

    @Test
    public void addBadgeTest() throws Exception {
        Badge body = new Badge();
        ResponseEntity<Void> responseEntity = api.addBadge(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void findBadgeTest() throws Exception {
        Integer badgeId = 56;
        ResponseEntity<Badge> responseEntity = api.findBadge(badgeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getBadgesTest() throws Exception {
        ResponseEntity<List<Badge>> responseEntity = api.getBadges();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateBadgeTest() throws Exception {
        Badge body = new Badge();
        ResponseEntity<Void> responseEntity = api.updateBadge(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
