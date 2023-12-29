
package stepDefinations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webHandler.WebHandler;
public class Hooks {	
	public static String enviornment ;
	@Before(order = 1)	
	public void beforehook() throws FileNotFoundException {
		String propertyFilePath = System.getProperty("user.dir") + "\\project\\common.properties";		
		BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
		Properties properties = new Properties();		
		try {
			properties.load(reader);
			enviornment = properties.getProperty("env");
		} catch (IOException e) {
			e.printStackTrace();
		}
		WebHandler.openBrowser();			
	}	
	@After	(order = 0)
	public void afterhook() {
		WebHandler.closeBrowser();
	}
	@After (order = 1)
	public void addScreenshot(Scenario scenario) throws IOException {		
		if(scenario.isFailed()) {
			String screenshotName = scenario.getId().replaceAll(" ", " ");
			byte[] sourcePath = ((TakesScreenshot)WebHandler.driver).getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
			scenario.attach(sourcePath,"image/png", screenshotName);
		}
	}	
}
