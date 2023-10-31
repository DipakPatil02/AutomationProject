package elementActions;
import java.time.Duration;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import shinsaiten.utils.ThreadUtils;
import testCasePages.LoginPage;
//import testCasePages.BrandPage;
import webHandler.*;
public class ElementActions {
	private static Logger log = LogManager.getLogger(LoginPage.class.getName());	
	public static void click(By Webelemnt) throws Exception{
		WebHandler.driver.findElement(Webelemnt).click();
	}
	public static void click(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			if(e.getMessage().contains("Other element would receive the click")) {
				((JavascriptExecutor) WebHandler.driver).executeScript("arguments[0].click();",element);
			}else {
				log.info(e);
			}
		}
	}
	public static void alertInputText(String txt) throws InterruptedException
	{
		Alert alert = WebHandler.driver.switchTo().alert();
		alert.sendKeys(txt);
		alert.accept();
	}
	public static WebElement getLocator(By by){
		return WebHandler.driver.findElement(by);
	}
	public static boolean type(WebElement ele, CharSequence...seq) {
		try {
			ele.clear();
			for(CharSequence seqValue : seq) {
				ele.sendKeys(seqValue);
			}
			ele.sendKeys(Keys.ENTER);
			log.info("successfully entered value");
			return true;
		}catch (Exception e) {
			log.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	public static void select(By select, String text) {
		try {
			boolean optionPresent = false;
			if(isElementPresent(select)) {
				for(int i = 0 ; i < 10; i++) {
					WebElement elm =WebHandler.driver.findElement(select);
					Select sel = new Select(elm);
					for(WebElement option : sel.getOptions()) {
						if(option.getText().equals(text)) {
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
			log.info(e);
		}
	}
	public static boolean clear(WebElement ele) {
		try {
			ele.clear();
			log.info("Successfully cleared value");
			return true;
		}catch (Exception e) {
			log.info("Failed to clear value");
			log.info(e);
			return false;
		}
	}
	public static boolean cleanAndsend(By by, String text) {
		try {
			WebElement ele = WebHandler.driver.findElement(by);
			ele.clear();
			ele.sendKeys(text);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	public static void selectMatching(By select, String text) {
		try {
			WebElement dropdown = WebHandler.driver.findElement(select);
			dropdown.click();
			List<WebElement> options = dropdown.findElements(By.tagName("option"));
			for (WebElement option : options) {
				String optionText = option.getText();
				if (optionText.contains(text)) {
					option.click();
					break; 
				}
			}
		}
		catch(Exception e) {
			log.info(e);
		}	
	}		
	public static boolean waitForElementVisibilty(By byAttribute) {
		try {
			WebDriverWait driverWait= WebHandler.getExplicitWait(WebHandler.driver);
			driverWait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(byAttribute));
			return true;
		} catch (Exception Ex) {
			return false;
		}
	}
	public static boolean webDriverWait(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(WebHandler.driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;
		}
		catch (Exception Ex) {
			return false;
		}
	}
	public static void SendKeys(By Webelemnt,String value) {
		WebHandler.driver.findElement(Webelemnt).sendKeys(value);		
	}
	public static void ImplicitWait(Integer Time) {
		WebHandler.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));
	}
	public static boolean send(By by, CharSequence...seq) {
		try {
			if(isElementPresent(by)) {
				WebElement ele = WebHandler.driver.findElement(by);
				for(CharSequence seqValue : seq) {
					ele.sendKeys(seqValue);
				}
				log.info("successfully entered value");
				return true;
			}else {
				throw new Exception("Element is not present");
			}
		}catch (Exception e) {
			log.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	public static boolean isElementPresent( By by) {
		boolean isP = false;
		for(int i = 0 ; i < 10 ;i++) {
			try {
				WebHandler.driver.findElement(by);
				isP = true;
				break;
			}catch(Exception e) {
				log.info(e.getMessage());
			}
		}
		return isP;
	}
	public static boolean isDisplayed(By locator) {
		try {
			WebElement element = WebHandler.driver.findElement(locator);
			return element.isDisplayed();
		} catch (Exception e) {
			log.info("Element is not displayed");
			return false;
		}
	}
	public static void sendEnterKey(By Webelemnt) {
		WebHandler.driver.findElement(Webelemnt).sendKeys(Keys.ENTER);	
	}
	public static void sendTabKey(By Webelemnt) {
		WebHandler.driver.findElement(Webelemnt).sendKeys(Keys.TAB);	
	}
	public static void ClickByAction(String Class, By elemnt) throws Exception{
		WebElement Site=WebHandler.driver.findElement(By.className(Class)); 
		WebElement button=Site.findElement(elemnt);	
		button.click();
	}
	public static String getText(By by) {
		try {
			String txt = WebHandler.driver.findElement(by).getText();
			return txt;
		}catch (Exception e) {
			log.info("failed to get text");
			log.info(e);
			return null;
		}
	}
	public static void waitForElementToBeVisibleAndClick(By byAttribute) {
		try {
			WebElement element=null;
			WebDriverWait driverWait= WebHandler.getExplicitWait(WebHandler.driver);
			driverWait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(byAttribute));
			List<WebElement> allelements = WebHandler.driver.findElements(byAttribute);
			if(allelements.size() > 0) {
				element = allelements.get(0);
				click(element);
			}else {
				log.info("Element not found");
			}
		}catch(Exception e){
			log.info(e);
		}
	}

	public static void sendAjax( By by, String text) {
		int waitCounter = 0;
		while(waitCounter < 5) {
			try {
				if(isElementPresent(by)) {
					WebElement ele = WebHandler.driver.findElement(by);
					ele.sendKeys(text);
					log.info("successfully entered value");
					WebElement ele1 = WebHandler.driver.findElement(by);
					if(ele1.getAttribute("value").equals(text)) {
						break;
					}else {
						throw new Exception("Element not changed");
					}
				}else {
					throw new Exception("Element is not present");
				}

			}catch (Exception e) {
				log.info("Failed to enter values");
			}
			try{Thread.sleep(1000);}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void projectSearch(String projectName) {
		ElementActions.waitForElementToBeVisibleAndClick(scorepointPages.CommonPageElements.Admin);
		log.info("Clicked on admin link");
		ElementActions.waitForElementToBeVisibleAndClick(scorepointPages.CommonPageElements.projectLink);
		log.info("Clicked on admin projectLink");
		ElementActions.waitForElementVisibilty(scorepointPages.CommonPageElements.CreateProjectLink);// need to check
		log.info("Clicked on admin CreateProjectLink");
		ElementActions.waitForElementVisibilty(scorepointPages.CommonPageElements.Projects);
		WebElement filter = WebHandler.driver.findElement(scorepointPages.CommonPageElements.Projects);
		ElementActions.type(filter, projectName);
		log.info("Entered project name: "+projectName);
		ElementActions.waitForElementToBeVisibleAndClick(By.xpath("//a[contains(text(),'" + projectName + "')]"));
		log.info("Clicked on projectName: "+projectName);
	}
	public static String alertText()
	{
		Alert alert = WebHandler.driver.switchTo().alert();
		String popupText = alert.getText();
		alert.accept();
		log.info(popupText+" Alert accepted");
		return popupText;
	}
	public static boolean send(WebElement ele, CharSequence...seq) {
		try {
			for(CharSequence seqValue : seq) {
				ele.sendKeys(seqValue);
			}
			log.info("successfully entered value");
			return true;
		}catch (Exception e) {
			log.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	public static boolean isOptionPresent(By selectLocator, String optionText) {
		Select select = new Select(WebHandler.driver.findElement(selectLocator));
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(optionText)) {
				return true;
			}
		}
		return false;
	}
	public static WebElement findElement(By by) {
		WebHandler.driver.findElement(by);
		return null;
	}
	public static void selectByVisibleText(WebElement lowRatingDropdown, String lowRatingReason) {
		Select select = new Select(lowRatingDropdown);
	        select.selectByVisibleText(lowRatingReason);
		
	}
}
