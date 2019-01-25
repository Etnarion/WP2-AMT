Feature: Crud of pointscales

  Background:
    Given there is a PointScales server

  Scenario: create a pointscale with token
    Given I have a pointscale payload
    When I POST it to the /pointscales endpoint with token
    Then I receive a 201 status code for pointscale creation

  Scenario: get a pointscale by its id
    When I GET a pointscale by its id
    Then I receive a 200 status code and a pointscales payload

  Scenario: get a list of an application pointscales
    When I GET pointscales
    Then I receive a 200 status code and a pointscales payload