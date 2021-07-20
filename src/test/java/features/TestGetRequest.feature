Feature: Test Get Request

  Scenario: Validate the get request is working properly
    Given Make a get request to the endpoint
    Then Validate the status should be of '200'
    Then Validate the first_Name string equals to "Byron"
