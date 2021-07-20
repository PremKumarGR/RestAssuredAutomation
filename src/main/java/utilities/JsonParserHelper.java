package utilities;

import gherkin.deps.com.google.gson.JsonElement;
import gherkin.deps.com.google.gson.JsonParser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import java.io.InputStreamReader;

public class JsonParserHelper {

    static Logger LOG = Logger.getLogger(JsonParserHelper.class);

    public static <T extends Object> T getResponseFromAPI(Response response) {
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader(response.getBody().asInputStream()));
        T t = null;
        if(root.isJsonObject()) {
            t = (T) root.getAsJsonObject();
            LOG.info("Return class is type of JsonObject.");
        } else if(root.isJsonArray()) {
            t = (T) root.getAsJsonArray();
            LOG.info("Return class is type of JsonArray.");
        } else if(root.isJsonPrimitive()) {
            if(root.getAsJsonPrimitive().isNumber()) {
                t = (T) (Integer)root.getAsInt();
                LOG.info("Return class is type of Integer.");
            } else if(root.getAsJsonPrimitive().isString()) {
                t = (T) (String)root.getAsString();
                LOG.info("Return class is type of Integer.");
            } else if(root.getAsJsonPrimitive().isBoolean()) {
                t = (T) (Boolean)root.getAsBoolean();
                LOG.info("Return class is type of Integer.");
            }
        } else {
            t = (T) root;
        }
        return t;

    }

    public static <T extends Object> T getValueFromJson(String jsonString, String path) {
        JsonPath jsonPath = new JsonPath(jsonString);
        return jsonPath.getJsonObject(path);
    }
}