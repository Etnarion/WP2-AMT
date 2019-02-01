Feature: Processing of events

  Background:
    Given there is a Events server
    Given there is an application in database
    Given there are two badges in database
    Given there are two pointScales in database
    Given there is a user in database
    Given there is two rule in database

  Scenario: Create an event
    Given I have an event payload
    When I POST it to the /events endpoint with token
    Then I receive a 201 status code for event creation

