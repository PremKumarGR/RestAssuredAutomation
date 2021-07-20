package stepDefinition;

import constants.GobalVariables;
import cucumber.api.java.Before;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utilities.RestAssuredExtensions;

public class TestSetUp {
    private Logger logger = LogManager.getLogger(TestSetUp.class);

    @Before
    public void init() {
        String baseURL = "https://reqres.in/api/users";
        GobalVariables gv = new GobalVariables(baseURL);
        RestAssuredExtensions ext = new RestAssuredExtensions();
    }

}
