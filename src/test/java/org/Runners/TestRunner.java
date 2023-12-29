package org.Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resource/feature/EC2312.feature",
		glue = {"stepDefinations"},
		monochrome = true,
		dryRun= false,
//		tags = "@TC_ATSM_4 or @TC_ATSM_5"
//		tags= "@TC_SP_12",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class TestRunner {
	
    

}












//"html:target/Html_Reports/ReFresh.html"