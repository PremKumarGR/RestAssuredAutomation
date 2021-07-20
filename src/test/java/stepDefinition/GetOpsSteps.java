package stepDefinition;
import gherkin.deps.com.google.gson.JsonElement;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.junit.Assert;
import utilities.JsonParserHelper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;

public class GetOpsSteps {
    static Logger LOG = Logger.getLogger(GetOpsSteps.class);


    public static void verifyResultWithCondition(Response response, String jsonPath, Function<List<LinkedHashMap>, Boolean> conditionValidator) {
        //TO convert response to jsonelement
        JsonElement jsonElement = JsonParserHelper.getResponseFromAPI(response);
        JsonObject rootObject = new JsonObject();
        if(jsonElement.isJsonArray()) {
            rootObject.add("root", jsonElement.getAsJsonArray());
            jsonPath = "root[*]."+ jsonPath;
        } else {
            rootObject.add("root", jsonElement.getAsJsonObject());
            jsonPath = "root."+ jsonPath;
        }
        //to extract value from a given jsonpath
        ArrayList<LinkedHashMap> values = JsonParserHelper.getValueFromJson(rootObject.toString(), jsonPath);

        //to aapply the condition using the validator
        Assert.assertTrue("The list doesn't satisfy the expected conditionValidator", conditionValidator.apply(values));

    }
}
