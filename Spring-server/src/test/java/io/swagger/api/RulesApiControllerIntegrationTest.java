package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Rule;

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
public class RulesApiControllerIntegrationTest {

    @Autowired
    private RulesApi api;

    @Test
    public void addRuleTest() throws Exception {
        Rule body = new Rule();
        ResponseEntity<Void> responseEntity = api.addRule(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteRuleTest() throws Exception {
        Integer ruleId = 56;
        ResponseEntity<Void> responseEntity = api.deleteRule(ruleId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void findRuleTest() throws Exception {
        Integer ruleId = 56;
        ResponseEntity<Rule> responseEntity = api.findRule(ruleId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getRulesTest() throws Exception {
        ResponseEntity<List<Rule>> responseEntity = api.getRules();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateRuleTest() throws Exception {
        Rule body = new Rule();
        ResponseEntity<Void> responseEntity = api.updateRule(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
