package com.sekolahqa.Runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features={"src/test/resources/features"},
        glue={"Runner", "StepDefinitions"},
        plugin = {"pretty","html:target/report/cucumber-report.html","json:target/report/cucumber-report.json"}
)
public class Runner {
}
