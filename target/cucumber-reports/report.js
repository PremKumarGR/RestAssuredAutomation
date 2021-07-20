$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestGetRequest.feature");
formatter.feature({
  "line": 1,
  "name": "Test Get Request",
  "description": "",
  "id": "test-get-request",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6543521323,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate the get request is working properly",
  "description": "",
  "id": "test-get-request;validate-the-get-request-is-working-properly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Make a get request to the endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Validate the status should be of \u0027200\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Validate the first_Name string equals to \"Byron\"",
  "keyword": "Then "
});
formatter.match({
  "location": "getRequest.makeAGetRequestToTheEndpoint()"
});
formatter.result({
  "duration": 8183117328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 34
    }
  ],
  "location": "getRequest.validateTheStatusShouldBeOf(int)"
});
formatter.result({
  "duration": 28640112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Byron",
      "offset": 42
    }
  ],
  "location": "getRequest.validateTheFirst_NameStringEqualsTo(String)"
});
formatter.result({
  "duration": 3867965870,
  "status": "passed"
});
formatter.uri("TestPostRequest.feature");
formatter.feature({
  "line": 1,
  "name": "Test post Request",
  "description": "",
  "id": "test-post-request",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19763819,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate the post request is working properly",
  "description": "",
  "id": "test-post-request;validate-the-post-request-is-working-properly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Make a post request to the endpoint",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ],
      "line": 5
    },
    {
      "cells": [
        "Bryat",
        "BA"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Validate the post api status should be of \u0027201\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate the ID is generated properly \"id\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate the Response json scheme \"createdAt\"",
  "keyword": "Then "
});
formatter.match({
  "location": "postRequest.makeAPostRequestToTheEndpoint(DataTable)"
});
formatter.result({
  "duration": 1292044359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 43
    }
  ],
  "location": "postRequest.validateThePostApiStatusShouldBeOf(int)"
});
formatter.result({
  "duration": 358782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "id",
      "offset": 39
    }
  ],
  "location": "postRequest.validateTheIDIsGeneratedProperly(String)"
});
formatter.result({
  "duration": 993345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "createdAt",
      "offset": 35
    }
  ],
  "location": "postRequest.validateTheResponseJsonScheme(String)"
});
formatter.result({
  "duration": 770668,
  "status": "passed"
});
});