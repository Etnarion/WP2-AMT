package io.swagger.api;

import io.swagger.model.Event;

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
public class EventsApiControllerIntegrationTest {

    @Autowired
    private EventsApi api;

    @Test
    public void addEventTest() throws Exception {
        Event body = new Event();
        ResponseEntity<Void> responseEntity = api.addEvent(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void findEventTest() throws Exception {
        Integer eventId = 56;
        ResponseEntity<Event> responseEntity = api.findEvent(eventId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getEventsTest() throws Exception {
        ResponseEntity<List<Event>> responseEntity = api.getEvents();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getUserEventsTest() throws Exception {
        Integer userId = 56;
        ResponseEntity<List<Event>> responseEntity = api.getUserEvents(userId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
