package scorepointPages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
public class Action{	
	private static Logger log = LogManager.getLogger(Action.class.getName());
	WebDriver driver = null;
	public Action(WebDriver driver){
		this.driver = driver;
	}
	/**
	 * This method is for explicit wait to wait until the element is clickable, once element is clickable, it will click on element.
	 * @param driver
	 * @param byAttribute
	 */
	/*public static void waitForElementToBeClickableAndClick(WebDriver driver,By byAttribute) {
		try {
			WebElement element=null;
			WebDriverWait driverWait= shinsaiten.common.DriverUtils.getExplicitWait(driver);
			driverWait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(byAttribute));
			List<WebElement> allelements = driver.findElements(byAttribute);
			if(allelements.size() > 0) {
				element = allelements.get(0);
				click(element);
			}else {
				log.info("Element not found");
			}
		}catch(Exception e){
			log.info(e);
		}
	}*/
	/**
	 * This method is for explicit wait to wait until the element is visible, once element is visible, it will click on element.
	 * @param driver
	 * @param byAttribute
	 */
	/*public static void waitForElementToBeVisibleAndClick(WebDriver driver,By byAttribute) {
		try {
			WebElement element=null;
			WebDriverWait driverWait= shinsaiten.common.DriverUtils.getExplicitWait(driver);
			driverWait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(byAttribute));
			List<WebElement> allelements = driver.findElements(byAttribute);
			if(allelements.size() > 0) {
				element = allelements.get(0);
				click(element);
			}else {
				log.info("Element not found");
			}
		}catch(Exception e){
			log.info(e);
		}
	}*/
	/**
	 * This method is for explicit wait to wait until the textToBePresentInElementLocated is located .
	 * @param driver
	 * @param byAttribute
	 * @param str
	 * @return
	 */
	/*public static boolean waitForElementTextToBePresent(WebDriver driver,By byAttribute,String str ) {
		try {
			WebDriverWait driverWait= shinsaiten.common.DriverUtils.getExplicitWait(driver);
			driverWait.ignoring(StaleElementReferenceException.class)
			.until(ExpectedConditions.textToBePresentInElementLocated(byAttribute,  str));
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}*/
	/**
	 * This method will wait until the element is visible.
	 * @param driver
	 * @param byAttribute
	 * @return
	 */
	/*	public static boolean waitForElementVisibilty(WebDriver driver,By byAttribute) {
		try {
			WebDriverWait driverWait= shinsaiten.common.DriverUtils.getExplicitWait(driver);
			driverWait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(byAttribute));
			return true;
		} catch (Exception Ex) {
			return false;
		}
	}*/
	/**
	 *This method will click on element
	 * @param ele
	 * @param seq
	 * @return
	 */
	/*public static void click(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			if(e.getMessage().contains("Other element would receive the click")) {
				((JavascriptExecutor)General.driver).executeScript("arguments[0].click();",element);
			}else {
				log.info(e);
			}
		}
	}*/
	/**
	 *This method will clear the field, then sendkeys and then press Enter
	 * @param ele
	 * @param seq
	 * @return
	 */
	/*public static boolean type(WebElement ele, CharSequence...seq) {
		try {
			ele.clear();
			for(CharSequence seqValue : seq) {
				ele.sendKeys(seqValue);
			}
			ele.sendKeys(Keys.ENTER);
			LoggerUtils.info("successfully entered value");
			return true;
		}catch (Exception e) {
			LoggerUtils.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	/**
	 * This method will clear the field.
	 * @param ele
	 * @return
	 */
	/*	public static boolean clear(WebElement ele) {
		try {
			ele.clear();
			LoggerUtils.info("successfully entered value");
			return true;
		}catch (Exception e) {
			LoggerUtils.info("Failed to entered value");
			log.info(e);
			return false;
		}
	}
	/**
	 * This method will clear and then perform sendkeys.
	 * @param ele
	 * @return
	 */
	/*public static boolean data(WebElement ele, CharSequence...seq) {
		try {
			ele.clear();
			for(CharSequence seqValue : seq) {
				ele.sendKeys(seqValue);
			}
			LoggerUtils.info("successfully entered value");
			return true;
		}catch (Exception e) {
			LoggerUtils.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	/**
	 * This method will only perform sendkeys
	 * @param ele
	 * @return
	 */
	/*public static boolean send(WebElement ele, CharSequence...seq) {
		try {
			for(CharSequence seqValue : seq) {
				ele.sendKeys(seqValue);
			}
			LoggerUtils.info("successfully entered value");
			return true;
		}catch (Exception e) {
			LoggerUtils.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	public static boolean send(WebDriver driver , By by, CharSequence...seq) {
		try {
			if(isElementPresent(driver,by)) {
				WebElement ele = driver.findElement(by);
				for(CharSequence seqValue : seq) {
					ele.sendKeys(seqValue);
				}
				LoggerUtils.info("successfully entered value");
				return true;
			}else {
				throw new Exception("Element is not present");
			}
		}catch (Exception e) {
			LoggerUtils.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	public static void sendAjax(WebDriver driver , By by, String text) {
		int waitCounter = 0;
		while(waitCounter < 5) {
			try {
				if(isElementPresent(driver,by)) {
					WebElement ele = driver.findElement(by);
					ele.sendKeys(text);
					LoggerUtils.info("successfully entered value");
					WebElement ele1 = driver.findElement(by);
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
	public static boolean isElementPresent(WebDriver driver, By by) {
		boolean isP = false;
		for(int i = 0 ; i < 10 ;i++) {
			try {
				driver.findElement(by);
				isP = true;
				break;
			}catch(Exception e) {
				LoggerUtils.info(e.getMessage());
			}
		}
		return isP;
	}
	public static boolean cleanAndsend(WebDriver driver , By by, CharSequence...seq) {
		try {
			WebElement ele = driver.findElement(by);
			ele.clear();
			for(CharSequence seqValue : seq) {
				ele.sendKeys(seqValue);
			}
			LoggerUtils.info("successfully entered value");
			return true;
		}catch (Exception e) {
			LoggerUtils.info("Failed to enter values");
			log.info(e);
			return false;
		}
	}
	public String getText(By by) {
		try {
			String txt = driver.findElement(by).getText();
			return txt;
		}catch (Exception e) {
			LoggerUtils.info("failed to get text");
			log.info(e);
			return null;
		}
	}
	public static String getText(WebDriver driver , By by) {
		try {
			String txt = driver.findElement(by).getText();
			return txt;
		}catch (Exception e) {
			LoggerUtils.info("failed to get text");
			log.info(e);
			return null;
		}
	}
	public Boolean isSelected(By by) {
		try {
			boolean txt = driver.findElement(by).isSelected();
			return txt;
		}catch (Exception e) {
			LoggerUtils.info("failed to get text");
			log.info(e);
			return null;
		}
	}
	public void click(By by) {
		try {
			driver.findElement(by).click();
		}catch (Exception e) {
			LoggerUtils.info("failed to get text");
			log.info(e);
		}
	}

	/**
	 * This method will refresh the browser
	 * @param ele
	 * @return
	 */
	//public static void refreshPage(WebDriver driver) {
	//	driver.navigate().refresh();
}
/**
 * This method will refresh the browser
 *
 * @param ele
 * @return
 */
/*public static void refreshPage() {
		General.driver.navigate().refresh();
	}
	public static void alert(WebDriver driver) throws InterruptedException
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static String alertText(WebDriver driver) throws InterruptedException
	{
		Alert alert = driver.switchTo().alert();
		String popupText = alert.getText();
		alert.accept();
		return popupText;
	}
	//alertInputText(WebDriver driver, String txt) enters text in alert box if alertbox requires text as confirmation
	//This is version 1 - 16/01/2023
	public static void alertInputText(WebDriver driver, String txt) throws InterruptedException
	{
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(txt);
		alert.accept();
	}
	/**
 * This method returns webelement based on locatertype and locatervalue
 * @param locatorType
 * @param driver
 * @param locatorValue
 * @return
 */
/*public static WebElement getLocator(WebDriver driver , By by){
		return driver.findElement(by);
	}
	public static WebElement getLocator(String locatorType, WebDriver driver, String locatorValue ){
		WebElement element = null;
		switch(locatorType.toUpperCase()) {
		case "ID":
			element=driver.findElement(By.id(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		case "CSSSELECTOR":
			element=driver.findElement(By.cssSelector(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		case "XPATH":
			element=driver.findElement(By.xpath(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		case "NAME":
			element=driver.findElement(By.name(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		case "LINKTEXT":
			element=driver.findElement(By.linkText(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		case "PARTIALLINKTEXT":
			element=driver.findElement(By.partialLinkText(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		case "TAGNAME":
			element=driver.findElement(By.tagName(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		case "CLASSNAME":
			element=driver.findElement(By.className(locatorValue ));
			LoggerUtils.info("locatorType--->"+locatorType);
			return element;
		default:
			LoggerUtils.info("Incorrect locator or Type" +  locatorType);
		}
		return element;
	}
	/**
 * This method returns By based on locatertype and attributeValue
 * @param locatorType
 * @param attributeValue
 * @return
 */
/*public static By getAttribute(String locatorType,String attributeValue ){
		By by = null;
		switch(locatorType.toUpperCase()) {
		case "ID":
			by=By.id(attributeValue);
			LoggerUtils.info("getAttribute--->"+locatorType);
			return by;
		case "CSSSELECTOR":
			by=By.cssSelector(attributeValue);
			LoggerUtils.info("getAttribute --->"+locatorType);
			return by;
		case "XPATH":
			by=By.xpath(attributeValue);
			LoggerUtils.info("getAttribute --->"+locatorType);
			return by;
		case "NAME":
			by=By.name(attributeValue);
			LoggerUtils.info("getAttribute --->"+locatorType);
			return by;
		case "LINKTEXT":
			by=By.linkText(attributeValue);
			LoggerUtils.info("getAttribute --->"+locatorType);
			return by;
		case "PARTIALLINKTEXT":
			by=By.partialLinkText(attributeValue);
			LoggerUtils.info("getAttribute --->"+locatorType);
			return by;
		case "TAGNAME":
			by=By.tagName(attributeValue);
			LoggerUtils.info("getAttribute --->"+locatorType);
			return by;
		case "CLASSNAME":
			by=By.className(attributeValue);
			LoggerUtils.info("getAttribute --->"+locatorType);
			return by;
		default:
			LoggerUtils.info("Incorrect locator or Type" +  locatorType);
		}
		return by;
	}
	/*public static void click(WebDriver driver, By by) {
		try {
			//			waitForElementVisibilty(driver, by);
			WebDriverWait driverWait= shinsaiten.common.DriverUtils.getExplicitWait(driver);
			driverWait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(by));
			driver.findElement(by).click();
		}catch(Exception e) {
			log.info(e);
		}
	}*/
/*	public static void clickLink(WebDriver driver, String linkText) {
		try {
			driver.findElement(By.linkText(linkText)).click();
		}catch(Exception e) {
			log.info(e);
		}
	}
	public void clickLink(String linkText) {
		try {
			driver.findElement(By.linkText(linkText)).click();
		}catch(Exception e) {
			log.info(e);
		}
	}
	public static void clickPartialLink(WebDriver driver, String linkText) {
		try {
			driver.findElement(By.partialLinkText(linkText)).click();
		}catch(Exception e) {
			log.info(e);
		}
	}
	public void clickPartialLink(String linkText) {
		try {
			driver.findElement(By.partialLinkText(linkText)).click();
		}catch(Exception e) {
			log.info(e);
		}
	}
	public static List<WebElement> elements(WebDriver driver, By by){
		return driver.findElements(by);
	}
	public static List<WebElement> elements(WebElement driver, By by){

		try {
			return driver.findElements(by);
		}catch(Exception e) {
			log.info(e);
			return null;
		}
	}
	/*public static Alert getAlert(WebDriver driver) {
		try {
			return driver.switchTo().alert();
		}catch(Exception e) {
			log.info(e);
			return null;
		}
	}*/
/*	public static void waitForInputToEnterCode(WebDriver driver,By by, String seq) {
		try {
			int counter = 1;
			boolean isNotDone = true;
			while(counter <= 5 && isNotDone) {
				WebElement elm = driver.findElement(by);
				elm.sendKeys(seq);
				Thread.currentThread().sleep(1000);
				String h = driver.findElement(by).getAttribute("value");
				if(seq.equals(h)) {
					isNotDone = false;
				}
			}
		}catch(Exception e) {
			log.info(e);

		}
	}*/
/*public static void select(WebDriver driver,By select, String text) {
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
			log.info(e);
		}
	}
	public static void handleAlert(WebDriver driver) {
		try {
			driver.switchTo().alert().accept();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}*/
