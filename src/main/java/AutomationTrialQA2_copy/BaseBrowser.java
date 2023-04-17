package AutomationTrialQA2_copy;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseBrowser {
	public static WebDriverWait wait = null;
	public static WebDriver driver = null;
	public static void startBrowser() {
		
		String projectpath = System.getProperty("user.dir");
		
		//String driverPath = "C:\\Users\\Deepak\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Driver\\chromedriver.exe";
		  
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/Driver/chromedriver.exe");
		
		  
		  ChromeOptions op = new ChromeOptions();
		  op.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(op);

		//driver = new FirefoxDriver();
		   
		   //wait = new WebDriverWait(driver, 30);
	}
	
	//public boolean waitUntilTextNotFound(String expectedTitle) {
		//String driverPath = "C:\\Users\\Dell\\eclipse-workspace\\Test Automation Project\\JIEMTrainingProject\\drivers\\chrome\\chromedriver.exe";
		   //System.setProperty("webdriver.chrome.driver", driverPath);
		   //driver = new ChromeDriver();
		   
	//}
}
