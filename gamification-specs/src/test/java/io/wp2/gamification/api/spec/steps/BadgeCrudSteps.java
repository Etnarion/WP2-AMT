package io.wp2.gamification.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.Application;
import io.swagger.client.model.Badge;
import io.wp2.gamification.api.spec.helpers.Environment;

import java.util.UUID;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Authors: Samuel Mayor, Alexandra Korukova, Arnold Von Bauer Gauss, Pierre-Samuel Rochat
 */
public class BadgeCrudSteps {

    private Environment environment;
    private DefaultApi api;

    private Badge badge;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;
    private String token;
    private static Integer badgeId;

    public BadgeCrudSteps(Environment environment) throws ApiException {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a Badges server$")
    public void there_is_a_Badges_server_and_a_token() throws Throwable {
        assertNotNull(api);
        this.token = environment.getApplicationToken();
        assertNotNull(token);
    }

    @Given("^I have a badge payload$")
    public void i_have_a_badge_payload() throws Throwable {
        badge = new Badge();
        badge.setName("badge");
    }

    @When("^I POST it to the /badges endpoint without token$")
    public void i_POST_it_to_the_badges_endpoint() throws Throwable {
        try {
            api.getApiClient().addDefaultHeader("Authorization", "");
            lastApiResponse = api.addBadgeWithHttpInfo(badge);
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

    @When("^I POST it to the /badges endpoint with token$")
    public void i_POST_it_to_the_badges_endpoint_with_token() throws Throwable {
        try {
            api.getApiClient().addDefaultHeader("Authorization", token);
            lastApiResponse = api.addBadgeWithHttpInfo(badge);
            getIdFromLocation(lastApiResponse.getHeaders().get("Location").toString());
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

    @When("^I GET a badge by its id$")
    public void i_GET_a_badge_by_its_id() throws Throwable {
        try {
            api.getApiClient().addDefaultHeader("Authorization", token);
            lastApiResponse = api.findBadgeWithHttpInfo(badgeId);
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

    @When("^I GET badges$")
    public void I_GET_badges() {
        try {
            api.getApiClient().addDefaultHeader("Authorization", token);
            lastApiResponse = api.getBadgesWithHttpInfo();
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

    @Then("^I receive a (\\d+) status code for badge creation$")
    public void i_receive_a_status_code_for_badge_creation(int arg1) throws Throwable {
        assertEquals(arg1, lastStatusCode);
    }

    @Then("^I receive a (\\d+) status code and a badge payload$")
    public void i_receive_a_status_code_and_a_badge_payload(int arg1) throws Throwable {
        assertEquals(arg1, lastStatusCode);
        assertNotNull(lastApiResponse.getData());
    }

    @Then("^I receive a (\\d+) status code and a badges payload$")
    public void i_receive_a_status_code_and_a_badges_payload(int arg1) {
        assertEquals(arg1, lastStatusCode);
        assertNotNull(lastApiResponse.getData());
    }

    // Merci Guidoux
    private void getIdFromLocation(String location) {
        String[] segments = location.split("/");
        String almostIdStr = segments[segments.length - 1];
        String idStr = almostIdStr.substring(0, almostIdStr.length() - 1);
        badgeId = Integer.parseInt(idStr);
    }
}
