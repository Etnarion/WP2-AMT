Feature: Creation of users

  Background:
    Given there is a Users server

  Scenario: create a user without token
    Given I have a user payload
    When I POST it to the /users endpoint without token
    Then I receive a 403 status code for user creation

  Scenario: create a user with token
    Given I have a user payload
    When I POST it to the /users endpoint with token
    Then I receive a 201 status code for user creation