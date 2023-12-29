package org.Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resource/feature/CBTTestTaker.feature",
		glue = {"stepDefinations"},
		monochrome = true,
		dryRun= false,
//		tags = "@TC_TT_003 or @TC_TT_004"
		tags= "@TC_TT_0018",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class CBTTestRunner {
	
    

}












//"html:target/Html_Reports/ReFresh.html"