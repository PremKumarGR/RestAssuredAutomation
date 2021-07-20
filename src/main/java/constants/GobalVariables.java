package constants;

public class GobalVariables {

    public static String baseUrl;

    public GobalVariables(String baseUrl) {
        setBaseUrl(baseUrl);
    }

    public String getBaseURL() {
        return this.baseUrl;
    }

    public void setBaseUrl(String url) {
        this.baseUrl = url;
        System.out.println("I am baseURL - " + baseUrl);
    }
}
