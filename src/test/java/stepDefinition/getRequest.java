package stepDefinition;

import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import utilities.RestAssuredExtensions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;

public class getRequest {
    private static ResponseOptions<Response> response;
    private static final Logger logger = LogManager.getLogger(getRequest.class);
    ObjectMapper mapper = new ObjectMapper();

    @Given("^Make a get request to the endpoint$")
    public void makeAGetRequestToTheEndpoint() {
        response = RestAssuredExtensions.getOpsWithQueryparam();
    }

    @Then("^Validate the status should be of '(\\d+)'$")
    public void validateTheStatusShouldBeOf(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }

    @Then("^Validate the first_Name string equals to \"([^\"]*)\"$")
    public void validateTheFirst_NameStringEqualsTo(String TestData) {
        Assert.assertTrue(response.getBody().asString().contains(TestData));
        Function<List<LinkedHashMap>, Boolean> searchConditionValidator = l -> {
            return l.stream().anyMatch(e-> Integer.parseInt(e.get("id").toString())==10 && e.get("first_name").equals("Byron"));
        };
        GetOpsSteps.verifyResultWithCondition(response.thenReturn(), "data", searchConditionValidator);
    }


}
