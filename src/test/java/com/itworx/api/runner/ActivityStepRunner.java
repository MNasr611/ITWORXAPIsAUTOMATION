package com.itworx.api.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/itworx/api/tests/activity_endpoint",
        glue = {"com.itworx.api.tests"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true
)
public class ActivityStepRunner extends AbstractTestNGCucumberTests {


}
