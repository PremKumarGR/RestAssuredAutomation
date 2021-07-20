$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestGetRequest.feature");
formatter.feature({
  "line": 1,
  "name": "Test Get Request",
  "description": "",
  "id": "test-get-request",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13310211954,
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
  "duration": 13107134458,
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
  "duration": 18744592,
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
  "duration": 125424771,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat stepDefinition.getRequest.validateTheFirst_NameStringEqualsTo(getRequest.java:32)\r\n\tat ✽.Then Validate the first_Name string equals to \"Byron\"(TestGetRequest.feature:6)\r\n",
  "status": "failed"
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
  "duration": 10751421,
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
  "name": "validate the json Response contain \"Bryat\"",
  "keyword": "Then "
});
formatter.match({
  "location": "postRequest.makeAPostRequestToTheEndpoint(DataTable)"
});
formatter.result({
  "duration": 2873299410,
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
  "duration": 856793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bryat",
      "offset": 36
    }
  ],
  "location": "postRequest.validateTheJsonResponseContain(String)"
});
formatter.result({
  "duration": 950952,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat stepDefinition.postRequest.validateTheJsonResponseContain(postRequest.java:47)\r\n\tat ✽.Then validate the json Response contain \"Bryat\"(TestPostRequest.feature:8)\r\n",
  "status": "failed"
});
});