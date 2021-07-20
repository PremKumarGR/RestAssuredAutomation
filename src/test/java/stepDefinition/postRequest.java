package stepDefinition;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import utilities.RestAssuredExtensions;

import java.util.HashMap;
import java.util.List;

public class postRequest {
    private static ResponseOptions<Response> response;
    ObjectMapper mapper = new ObjectMapper();
    private static final Logger logger = LogManager.getLogger(postRequest.class);

    @Given("^Make a post request to the endpoint$")
    public void makeAPostRequestToTheEndpoint(DataTable table) {
        HashMap<String, String> bodyParam = new HashMap<>();
        List<List<String>> data = table.raw();
        bodyParam.put("name", data.get(1).get(0));
        bodyParam.put("job", data.get(1).get(1));
        String jsonBody = null;
        try {
            jsonBody = mapper.writeValueAsString(bodyParam);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        response = RestAssuredExtensions.postOpsWithPathparam(jsonBody);
    }

    @Then("^Validate the post api status should be of '(\\d+)'$")
    public void validateThePostApiStatusShouldBeOf(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());

    }

    @Then("^Validate the ID is generated properly \"([^\"]*)\"$")
    public void validateTheIDIsGeneratedProperly(String expextedString) {
        Assert.assertTrue(response.getBody().asString().contains(expextedString));
    }

    @Then("^validate the Response json scheme \"([^\"]*)\"$")
    public void validateTheResponseJsonScheme(String expectedString)  {
        Assert.assertTrue(response.getBody().asString().contains(expectedString));
    }
}
