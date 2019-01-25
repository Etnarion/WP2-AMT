package io.wp2.gamification.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.Badge;
import io.swagger.client.model.PointScale;
import io.swagger.client.model.Rule;
import io.swagger.client.model.User;
import io.wp2.gamification.api.spec.helpers.Environment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class EventProcessingSteps {
    private Environment environment;
    private DefaultApi api;

    private Badge badge1;
    private Badge badge2;
    private PointScale pointScale1;
    private PointScale pointScale2;

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
        assertEquals(201, api.addBadgeWithHttpInfo(badge1).getStatusCode());
        assertEquals(201, api.addBadgeWithHttpInfo(badge2).getStatusCode());
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
    }

    @Given("^there is a user in database$")
    public void there_is_a_user_in_database() throws ApiException {
        api.getApiClient().addDefaultHeader("Authorization", token);
        User user = new User();
        assertEquals(201, api.addUserWithHttpInfo(user).getStatusCode());
    }

    @Given("^there is two rule in database$")
    public void there_is_two_rule_in_database() {
        api.getApiClient().addDefaultHeader("Authorization", token);
        Rule rule1 = new Rule();
        Rule rule2 = new Rule();
        rule1.setName("rule");
        rule1.setReward(badge1);
        rule1.setPointScale(pointScale1);
        //assertEquals(201, api.addUserWithHttpInfo(user).getStatusCode());
    }
}