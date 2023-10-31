package scorepointPages;
import java.io.File;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*public class ShinSaitenApp {
	public static WebDriver driver = null;
	public static WebDriver driver1 = null;
	public static Properties prop = PropertiesHelper.envProperties;
	public static final String APP_URL = getURLValue("APP_URL");
	public static WebDriver launchApp(){
		driver = getDriver("chrome");
		return driver;
	}
	public static WebDriver launchApp1(){
		driver = getDriver("chrome");
		return driver;
	}
	public static WebDriver launchApp2(){
		driver1 = getDriver("chrome");
		return driver1;
	}
	public static WebDriver launchAppfirefox(){
		driver  = getDriver("firefox");
		return driver;
	}
	public static WebDriver launchAppedge(){
		driver =  getDriver("msedge");
		return driver;
	}
	public static WebDriver getDriver(String browser) {
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			if(PropertiesHelper.globalProperties.getProperty("driversource").toString().equals("webdrivermanager")) {
				WebDriverManager.chromedriver().setup();
			}else {
				String driverpath = Paths.get("src", "test", "resources","webdrivers","chromedriver.exe").toFile().getAbsolutePath();
				System.setProperty("webdriver.chrome.driver", driverpath);
			}
			driver = new ChromeDriver();
			driver.get(getURLValue("APP_URL"));
			driver.manage().window().maximize();
		}else if(browser.equals("firefox")) {
			if(PropertiesHelper.globalProperties.getProperty("driversource").toString().equals("webdrivermanager")) {
				WebDriverManager.firefoxdriver().setup();
			}else {
				String driverpath = Paths.get("src", "test", "resources","webdrivers","geckodriver.exe").toFile().getAbsolutePath();
				System.setProperty("webdriver.gecko.driver", driverpath);
			}
			driver = new FirefoxDriver();
			driver.get(getURLValue("APP_URL"));
			driver.manage().window().maximize();
		}else if(browser.equals("msedge")) {
			if(PropertiesHelper.globalProperties.getProperty("driversource").toString().equals("webdrivermanager")) {
				WebDriverManager.edgedriver().setup();
			}else {
				String driverpath = Paths.get("src", "test", "resources","webdrivers","msedgedriver.exe").toFile().getAbsolutePath();
				System.setProperty("webdriver.edge.driver", driverpath);
			}
			driver = new EdgeDriver();
			driver.get(getURLValue("APP_URL"));
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		AssertSetting.setDriver(driver);
		new File(System.getProperty("user.dir")+"/report_ss/").mkdirs();
		AssertSetting.setScreenshotPath("/report_ss/");
		AssertSetting.setStepScreenshot(false, true);
		return driver;
	}
	public static String getVariableValue(String key) {
		if(key.equals("APP_URL")) {
			return getURLValue("APP_URL");
		}else {
			TestDataGlobal global = GlobalData.getGlobalDataFromExcel(
					Integer.parseInt(PropertiesHelper.globalProperties.getProperty("projectID")),
					PropertiesHelper.globalProperties.getProperty("env").toUpperCase().toString(), key);
			return global.getVariableValue();
		}
	}
	public static String getURLValue(String key) {
		Application global = ApplicationData.getApplicationDataFromExcel(
				Integer.parseInt(PropertiesHelper.globalProperties.getProperty("projectID")),
				PropertiesHelper.globalProperties.getProperty("env").toUpperCase().toString(), key);
		return global.getAppURL();
	}

}*/
