package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Deepak\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\features\\LoginFuctionality.feature",
		glue="StepDefinations/LoginFunctionality",
		monochrome=true,
		plugin = {"pretty","junit:target/JUnitReports/report.xml",
				"json:target/JSONReport/report.json",
				"html:target/HTMLReports"
				},
		tags="@regression"
	)

public class TestRunner extends AbstractTestNGCucumberTests {

}
