package com.itworx.api.tests.activity_endpoint;

import com.itworx.api.design.ActivityAPI;
import com.itworx.api.tests.BaseAPI;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class ActivityStepDefs extends BaseAPI {
    ActivityAPI activityAPI = new ActivityAPI();

    @Then("validate that random activity suggestion with endpoint {string} and status code {string} return schema as expected")
    public void validateThatRandomActivitySuggestionSchemaAreReturnAsExpected(String endPoint,String statusCode) throws IOException {
        activityAPI.checkActivitySchema(endPoint,statusCode);
    }

}
