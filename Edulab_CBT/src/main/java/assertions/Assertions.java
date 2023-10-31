package assertions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import shinsaiten.utils.ThreadUtils;
public class Assertions {
	private static Logger log = LogManager.getLogger(Assertions.class.getName());

	public static void assertTrue(String message, boolean condition) {
	    if (!condition) {
	        throw new AssertionError("Assertion True: " + message);
	    }
	}
	
	public static void assertFalse(String message, boolean condition) {
	    if (!condition) {
	        throw new AssertionError("Assertion False: " + message);
	    }
	}
	public static void assertStrings(String Expected , String Actual) {
		boolean result = false;
		if (Expected.equals(Actual)) {
			result = true;
		}
		Assert.assertTrue(result);
	}
	public static boolean isElementPresent(WebDriver driver, By by) {
		boolean isP = false;
		for(int i = 0 ; i < 10 ;i++) {
			try {
				driver.findElement(by);
				isP = true;
				break;
			}catch(Exception e) {
				log.info(e.getMessage());
			}
		}
		return isP;
	}
	public static void select(WebDriver driver,By select, String text) {
		try {
			boolean optionPresent = false;
			if(isElementPresent(driver, select)) {
				for(int i = 0 ; i < 10; i++) {
					WebElement elm = driver.findElement(select);
					Select sel = new Select(elm);
					for(WebElement option : sel.getOptions()) {
						if(option.getText().equalsIgnoreCase(text)) {
							optionPresent = true;
							break;
						}
					}
					if(optionPresent) {
						sel.selectByVisibleText(text);
						break;
					}
					System.out.println("wait for 1 sec");
					ThreadUtils.appWait(1000);
				}
			}
			if(!optionPresent) {
				throw new Exception();
			}
		}catch(Exception e) {
			log.info(e.getMessage());
		}
	}
}
