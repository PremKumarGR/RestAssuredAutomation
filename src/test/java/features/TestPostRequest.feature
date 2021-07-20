Feature: Test post Request

  Scenario: Validate the post request is working properly
    Given Make a post request to the endpoint
      | name  | job |
      | Bryat | BA  |
    Then Validate the post api status should be of '201'
    Then Validate the ID is generated properly "id"
    Then validate the Response json scheme "createdAt"