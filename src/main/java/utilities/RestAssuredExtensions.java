package utilities;

import constants.GobalVariables;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class RestAssuredExtensions {

    public static RequestSpecification Request;
    private static final Logger logger = LogManager.getLogger(RestAssuredExtensions.class);

    public RestAssuredExtensions() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri(GobalVariables.baseUrl);
        RequestSpecification requestSpec = builder.build();
        Request = RestAssured.given().spec(requestSpec);
    }

    public static ResponseOptions<Response> getOpsWithQueryparam() {
        Request.queryParam("page", "2");
        logger.info("Get call to user endpoint");
        Response response = Request.get();
        return response;
    }

    public static ResponseOptions<Response> postOpsWithPathparam(String bodyParams) {
        Request.body(bodyParams);
        logger.info("Post call to user endpoint");
        Response response = Request.post();
        return response;
    }
}
