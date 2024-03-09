package com.itworx.api.design;

import com.itworx.api.schema.ActivitySchema;
import com.itworx.api.tests.BaseAPI;
import com.itworx.api.utility.GenerateSchema;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;


import java.io.IOException;

import io.restassured.module.jsv.JsonSchemaValidator;

public class ActivityAPI extends BaseAPI {

    GenerateSchema activitySchema = new GenerateSchema();
    private String getActivitySchema() throws IOException {
        return activitySchema.generateSchema(ActivitySchema.class);
    }
    public void checkActivitySchema(String endpoint , String responseCode) throws IOException {
        RestAssured.baseURI= BOARD_API_URL.concat(endpoint);
          RestAssured.given()
                 .filter(new AllureRestAssured())
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(Integer.parseInt(responseCode))
                .body(JsonSchemaValidator.matchesJsonSchema(getActivitySchema()));
    }
}
