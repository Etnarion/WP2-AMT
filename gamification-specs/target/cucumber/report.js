$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("applicationCreation.feature");
formatter.feature({
  "line": 1,
  "name": "Creation of applications",
  "description": "",
  "id": "creation-of-applications",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is an Applications server",
  "keyword": "Given "
});
formatter.match({
  "location": "ApplicationCreationSteps.there_is_an_Applications_server()"
});
formatter.result({
  "duration": 319856637,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create an application",
  "description": "",
  "id": "creation-of-applications;create-an-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have an application payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /applications endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 201 status code and an application payload",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationCreationSteps.i_have_an_application_payload()"
});
formatter.result({
  "duration": 2038974,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationCreationSteps.i_POST_it_to_the_applications_endpoint()"
});
formatter.result({
  "duration": 438016161,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "ApplicationCreationSteps.i_receive_a_status_code_and_an_application_payload(int)"
});
formatter.result({
  "duration": 3270619,
  "status": "passed"
});
formatter.uri("badgeCrud.feature");
formatter.feature({
  "line": 1,
  "name": "Creation of badges",
  "description": "",
  "id": "creation-of-badges",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Badges server",
  "keyword": "Given "
});
formatter.match({
  "location": "BadgeCrudSteps.there_is_a_Badges_server_and_a_token()"
});
formatter.result({
  "duration": 29091389,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a badge without token",
  "description": "",
  "id": "creation-of-badges;create-a-badge-without-token",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a badge payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /badges endpoint without token",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 403 status code for badge creation",
  "keyword": "Then "
});
formatter.match({
  "location": "BadgeCrudSteps.i_have_a_badge_payload()"
});
formatter.result({
  "duration": 273677,
  "status": "passed"
});
formatter.match({
  "location": "BadgeCrudSteps.i_POST_it_to_the_badges_endpoint()"
});
formatter.result({
  "duration": 17991183,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "403",
      "offset": 12
    }
  ],
  "location": "BadgeCrudSteps.i_receive_a_status_code_for_badge_creation(int)"
});
formatter.result({
  "duration": 177455,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Badges server",
  "keyword": "Given "
});
formatter.match({
  "location": "BadgeCrudSteps.there_is_a_Badges_server_and_a_token()"
});
formatter.result({
  "duration": 43784922,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "create a badge with token",
  "description": "",
  "id": "creation-of-badges;create-a-badge-with-token",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I have a badge payload",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I POST it to the /badges endpoint with token",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I receive a 201 status code for badge creation",
  "keyword": "Then "
});
formatter.match({
  "location": "BadgeCrudSteps.i_have_a_badge_payload()"
});
formatter.result({
  "duration": 63469,
  "status": "passed"
});
formatter.match({
  "location": "BadgeCrudSteps.i_POST_it_to_the_badges_endpoint_with_token()"
});
formatter.result({
  "duration": 35369843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "BadgeCrudSteps.i_receive_a_status_code_for_badge_creation(int)"
});
formatter.result({
  "duration": 119458,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Badges server",
  "keyword": "Given "
});
formatter.match({
  "location": "BadgeCrudSteps.there_is_a_Badges_server_and_a_token()"
});
formatter.result({
  "duration": 34230388,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "get a badge by its id",
  "description": "",
  "id": "creation-of-badges;get-a-badge-by-its-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I GET a badge by its id",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I receive a 200 status code and a badge payload",
  "keyword": "Then "
});
formatter.match({
  "location": "BadgeCrudSteps.i_GET_a_badge_by_its_id()"
});
formatter.result({
  "duration": 17864912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 12
    }
  ],
  "location": "BadgeCrudSteps.i_receive_a_status_code_and_a_badge_payload(int)"
});
formatter.result({
  "duration": 192654,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Badges server",
  "keyword": "Given "
});
formatter.match({
  "location": "BadgeCrudSteps.there_is_a_Badges_server_and_a_token()"
});
formatter.result({
  "duration": 28511456,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "get a list of an application badges",
  "description": "",
  "id": "creation-of-badges;get-a-list-of-an-application-badges",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I GET badges",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I receive a 200 status code and a badges payload",
  "keyword": "Then "
});
formatter.match({
  "location": "BadgeCrudSteps.I_GET_badges()"
});
formatter.result({
  "duration": 21297343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 12
    }
  ],
  "location": "BadgeCrudSteps.i_receive_a_status_code_and_a_badges_payload(int)"
});
formatter.result({
  "duration": 194554,
  "status": "passed"
});
formatter.uri("eventProcessing.feature");
formatter.feature({
  "line": 1,
  "name": "Processing of events",
  "description": "",
  "id": "processing-of-events",
  "keyword": "Feature"
});
formatter.uri("pointScaleCrud.feature");
formatter.feature({
  "line": 1,
  "name": "Crud of pointscales",
  "description": "",
  "id": "crud-of-pointscales",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a PointScales server",
  "keyword": "Given "
});
formatter.match({
  "location": "PointScaleCrudSteps.there_is_a_PointScales_server_and_a_token()"
});
formatter.result({
  "duration": 23714380,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a pointscale with token",
  "description": "",
  "id": "crud-of-pointscales;create-a-pointscale-with-token",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a pointscale payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /pointscales endpoint with token",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 201 status code for pointscale creation",
  "keyword": "Then "
});
formatter.match({
  "location": "PointScaleCrudSteps.i_have_a_pointscale_payload()"
});
formatter.result({
  "duration": 353458,
  "status": "passed"
});
formatter.match({
  "location": "PointScaleCrudSteps.i_POST_it_to_the_pointscales_endpoint_with_token()"
});
formatter.result({
  "duration": 31128240,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "PointScaleCrudSteps.i_receive_a_status_code_for_pointscale_creation(int)"
});
formatter.result({
  "duration": 310577,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a PointScales server",
  "keyword": "Given "
});
formatter.match({
  "location": "PointScaleCrudSteps.there_is_a_PointScales_server_and_a_token()"
});
formatter.result({
  "duration": 31810449,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "get a pointscale by its id",
  "description": "",
  "id": "crud-of-pointscales;get-a-pointscale-by-its-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I GET a pointscale by its id",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I receive a 200 status code and a pointscales payload",
  "keyword": "Then "
});
formatter.match({
  "location": "PointScaleCrudSteps.i_GET_a_pointscale_by_its_id()"
});
formatter.result({
  "duration": 17756275,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 12
    }
  ],
  "location": "PointScaleCrudSteps.i_receive_a_status_code_and_a_pointscales_payload(int)"
});
formatter.result({
  "duration": 232214,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a PointScales server",
  "keyword": "Given "
});
formatter.match({
  "location": "PointScaleCrudSteps.there_is_a_PointScales_server_and_a_token()"
});
formatter.result({
  "duration": 19006428,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "get a list of an application pointscales",
  "description": "",
  "id": "crud-of-pointscales;get-a-list-of-an-application-pointscales",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I GET pointscales",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I receive a 200 status code and a pointscales payload",
  "keyword": "Then "
});
formatter.match({
  "location": "PointScaleCrudSteps.I_GET_pointscales()"
});
formatter.result({
  "duration": 14496706,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 12
    }
  ],
  "location": "PointScaleCrudSteps.i_receive_a_status_code_and_a_pointscales_payload(int)"
});
formatter.result({
  "duration": 164826,
  "status": "passed"
});
formatter.uri("userCrud.feature");
formatter.feature({
  "line": 1,
  "name": "Creation of users",
  "description": "",
  "id": "creation-of-users",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Users server",
  "keyword": "Given "
});
formatter.match({
  "location": "UserCrudSteps.there_is_an_Users_server()"
});
formatter.result({
  "duration": 16878082,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a user without token",
  "description": "",
  "id": "creation-of-users;create-a-user-without-token",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a user payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /users endpoint without token",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 403 status code for user creation",
  "keyword": "Then "
});
formatter.match({
  "location": "UserCrudSteps.i_have_a_user_payload()"
});
formatter.result({
  "duration": 491628,
  "status": "passed"
});
formatter.match({
  "location": "UserCrudSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 9839398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "403",
      "offset": 12
    }
  ],
  "location": "UserCrudSteps.i_receive_a_status_code_for_user_creation(int)"
});
formatter.result({
  "duration": 256807,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a Users server",
  "keyword": "Given "
});
formatter.match({
  "location": "UserCrudSteps.there_is_an_Users_server()"
});
formatter.result({
  "duration": 24743249,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "create a user with token",
  "description": "",
  "id": "creation-of-users;create-a-user-with-token",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I have a user payload",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I POST it to the /users endpoint with token",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I receive a 201 status code for user creation",
  "keyword": "Then "
});
formatter.match({
  "location": "UserCrudSteps.i_have_a_user_payload()"
});
formatter.result({
  "duration": 61517,
  "status": "passed"
});
formatter.match({
  "location": "UserCrudSteps.i_POST_it_to_the_users_endpoint_with_token()"
});
formatter.result({
  "duration": 30116940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "UserCrudSteps.i_receive_a_status_code_for_user_creation(int)"
});
formatter.result({
  "duration": 158186,
  "status": "passed"
});
});