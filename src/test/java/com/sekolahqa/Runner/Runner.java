package com.sekolahqa.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@TagTest",
        features={"src/test/resources/features"},
        glue={"com.sekolahqa.Runner", "StepDefinitions"},
        plugin = {"pretty","html:target/report/cucumber-report.html","json:target/report/cucumber-report.json"}
)
public class Runner {
}
