package io.wp2.gamification.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.*;
import io.wp2.gamification.api.spec.helpers.Environment;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class EventProcessingSteps {
    private Environment environment;
    private DefaultApi api;

    private Badge badge1;
    private Badge badge2;
    private PointScale pointScale1;
    private PointScale pointScale2;
    private Event event;
    private User user;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;
    private String token;
    private static Integer badgeId;

    public EventProcessingSteps(Environment environment) throws ApiException {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a Events server$")
    public void there_is_a_events_server() {
        assertNotNull(api);
    }

    @Given("^there is an application in database$")
    public void there_is_an_application_in_database() throws ApiException {
        token = environment.getApplicationToken();
        assertNotNull(token);
    }

    @Given("^there are two badges in database$")
    public void there_are_two_badges_in_database() throws ApiException {
        api.getApiClient().addDefaultHeader("Authorization", token);
        badge1 = new Badge();
        badge2 = new Badge();
        badge1.setName("badge1");
        badge2.setName("badge2");
        int status1 = api.addBadgeWithHttpInfo(badge1).getStatusCode();
        int status2 = api.addBadgeWithHttpInfo(badge2).getStatusCode();
        if (status1 == 201 && status2 == 201) {
            List<Badge> badges = api.getBadges();
            badge1 = badges.get(0);
            badge2 = badges.get(1);
        }
    }

    @Given("^there are two pointScales in database$")
    public void there_are_two_pointScales_in_database() throws ApiException {
        api.getApiClient().addDefaultHeader("Authorization", token);
        pointScale1 = new PointScale();
        pointScale2 = new PointScale();
        pointScale1.setName("ps1");
        pointScale2.setName("ps2");
        assertEquals(201, api.addPointScaleWithHttpInfo(pointScale1).getStatusCode());
        assertEquals(201, api.addPointScaleWithHttpInfo(pointScale2).getStatusCode());
        List<PointScale> pointScales = api.getPointScales();
        pointScale1 = pointScales.get(0);
        pointScale2 = pointScales.get(1);
    }

    public void there_is_a_user_in_database() throws ApiException {
        api.getApiClient().addDefaultHeader("Authorization", token);
        user = new User();
        user = api.addUserWithHttpInfo(user).getData();
    }

    @Given("^there is two rule in database$")
    public void there_is_two_rule_in_database() throws ApiException {
        api.getApiClient().addDefaultHeader("Authorization", token);
        Rule rule1 = new Rule();
        Rule rule2 = new Rule();
        rule1.setName("rule1");
        rule1.setBadge(badge1);
        rule1.setPointScale(pointScale1);
        rule1.setTarget(2);
        rule1.setEventType("eventType1");
        rule2.setName("rule2");
        rule2.setBadge(badge2);
        rule2.setPointScale(pointScale2);
        rule2.setTarget(3);
        rule2.setEventType("eventType2");
        assertEquals(201, api.addRuleWithHttpInfo(rule1).getStatusCode());
        assertEquals(201, api.addRuleWithHttpInfo(rule2).getStatusCode());
    }

    @Given("^I have an event payload$")
    public void i_have_an_event_payload() {
        event = new Event();
        event.setEventType("eventType1");
        event.setTimestamp("Now");
        event.setUserId(user.getId());
    }

    @When("^I POST it to the /events endpoint with token$")
    public void i_POST_it_to_the_events_endpoint_with_token() {
        try {
            api.getApiClient().addDefaultHeader("Authorization", token);
            lastApiResponse = api.addEventWithHttpInfo(event);
            lastApiCallThrewException = false;
            lastApiException = null;
            lastStatusCode = lastApiResponse.getStatusCode();
        } catch (ApiException e) {
            lastApiCallThrewException = true;
            lastApiResponse = null;
            lastApiException = e;
            lastStatusCode = lastApiException.getCode();
        }
    }

    @Then("^I receive a 201 status code for event creation$")
    public void i_receive_a_201_status_code_for_event_creation() {
        assertEquals(201, lastApiResponse.getStatusCode());
    }
}
