package webHandler;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebHandler {
	public static WebDriver driver; 
	public static int instanceCount = 0;
	public static void openBrowser( ) {
		if (driver == null) {
			String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			ChromeOptions chromeoptions = new ChromeOptions();			
			chromeoptions.addArguments("--remote-allow-origins=*");		
			driver = new ChromeDriver(chromeoptions);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}	 
	public static WebDriverWait getExplicitWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
	}
	public static void closeBrowser() {
		if (instanceCount > 1 && driver != null && !(driver instanceof ChromeDriver)) {
			driver.close();
			try {
				driver.quit();
			} catch (Exception e) {
			}
			driver = null;
			instanceCount--;
		}
	}
}
