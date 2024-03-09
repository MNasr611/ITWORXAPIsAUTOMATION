package com.itworx.api.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import com.itworx.api.schema.ActivitySchema;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.IOException;

public class GenerateSchema {

    public String generateSchema(Class<?> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema jsonSchema = schemaGen.generateSchema(clazz);

        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema);
    }

}
