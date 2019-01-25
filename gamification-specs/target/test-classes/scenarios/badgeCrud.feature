Feature: Creation of badges

  Background:
    Given there is a Badges server

  Scenario: create a badge without token
    Given I have a badge payload
    When I POST it to the /badges endpoint without token
    Then I receive a 403 status code for badge creation

  Scenario: create a badge with token
    Given I have a badge payload
    When I POST it to the /badges endpoint with token
    Then I receive a 201 status code for badge creation

  Scenario: get a badge by its id
    When I GET a badge by its id
    Then I receive a 200 status code and a badge payload

  Scenario: get a list of an application badges
    When I GET badges
    Then I receive a 200 status code and a badges payload