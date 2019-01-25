package io.wp2.gamification.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.User;
import io.wp2.gamification.api.spec.helpers.Environment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Authors: Samuel Mayor, Alexandra Korukova, Arnold Von Bauer Gauss, Pierre-Samuel Rochat
 */
public class UserCrudSteps {

    private Environment environment;
    private DefaultApi api;

    private User user;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;
    private String token;

    public UserCrudSteps(Environment environment) throws ApiException {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a Users server$")
    public void there_is_an_Users_server() throws Throwable {
        assertNotNull(api);
        this.token = environment.getApplicationToken();
        assertNotNull(token);
    }

    @Given("^I have a user payload$")
    public void i_have_a_user_payload() throws Throwable {
        user = new User();
    }

    @When("^I POST it to the /users endpoint without token$")
    public void i_POST_it_to_the_users_endpoint() throws Throwable {
        try {
            api.getApiClient().addDefaultHeader("Authorization", "");
            lastApiResponse = api.addUserWithHttpInfo(user);
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

    @When("^I POST it to the /users endpoint with token$")
    public void i_POST_it_to_the_users_endpoint_with_token() throws Throwable {
        try {
            api.getApiClient().addDefaultHeader("Authorization", token);
            lastApiResponse = api.addUserWithHttpInfo(user);
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

    @Then("^I receive a (\\d+) status code for user creation$")
    public void i_receive_a_status_code_for_user_creation(int arg1) throws Throwable {
        assertEquals(arg1, lastStatusCode);
    }
}
