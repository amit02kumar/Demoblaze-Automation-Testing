package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\INDIA\\eclipse-workspace\\project\\src\\test\\java\\features", 
glue={"stepDefinitions"},
monochrome=true,
dryRun = true,
plugin= {"pretty",
		"html:target/CucumberReport.html",
		"json:target/CucumberReport.json",
		"junit:target/CucumberReport.junit"
		})

public class TestRunner {

}