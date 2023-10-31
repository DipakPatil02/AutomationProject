package scorepointPages;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import shinsaiten.utils.ThreadUtils;
/*public class General {
	static WebDriver driver;
	static WebDriver driver1;
	public static Properties prop = PropertiesHelper.envProperties;
	public static final String APP_URL = prop.getProperty("APP_URL");
	public static final String BRAND_NAME = prop.getProperty("BRAND6_NAME");
	public static final String PROJECT_NAME = prop.getProperty("PROJECT6_NAME");
	public static final String TESTSET_NAME = prop.getProperty("TESTSET1_NAME");
	public static final String DownloadPath =System.getProperty("user.home")+File.separator+"Downloads"+File.separator;
	static  long diff_Days = 0;
	static  long diff_Hours = 3;
	static  long diff_Minutes = 30;
	static  long diff_Seconds = 0;
	//Constructor to set Webdriver object
	/*public General(WebDriver driverObj)
	{
		driver = driverObj;
	}
	/*public General()
	{
	}
	/*
	 * Login method to allow user login
	 */
/*	public void login(String userName, String password)
	{
		driver = ShinSaitenApp.driver;
		Action.send(driver,By.id("loginform-username"),userName);
		Action.send(driver,By.id("loginform-password"),password);
		Action.click(driver,By.id("login-button"));
		if(Action.waitForElementVisibilty(driver, By.xpath("//h1[text()='You are logged in to another active session.']"))) {
			Action.click(driver,By.xpath("//a[@href='#']"));//To terminate session click on 'Here'
			Action.send(driver,By.xpath("//input[@id='loginform-username']"),userName);
			Action.send(driver,By.xpath("//input[@id='loginform-password']"),password,Keys.ENTER);
		}
	}
	/*
	 * Logout method
	 */
	/*public void logout()
	{
		Action.click(driver,By.xpath("//button[@class='btn btn-link logout']"));
	}
	public void driverclose() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-link logout']"))).click();
		driver.close();
		driver.quit();
	}
	public void login_to_admin(String USERNAME_ADMIN, String PASSWORD_ADMIN) {
		login(USERNAME_ADMIN, PASSWORD_ADMIN);
		try {
		}catch(Exception e) {
		}
		Action.click(driver, CommonPageElement.adminLink);
	}
	public void login_to_manager(String USERNAME_MANAGER, String PASSWORD_MANAGER) {
		login(USERNAME_MANAGER, PASSWORD_MANAGER);
		try {
		}catch(Exception e) {
		}
		Action.click(driver,By.xpath("//a[contains(text(),'Manager')]"));
	}
	public void login_to_rater(String USERNAME_RATER, String PASSWORD_RATER) {
		login(USERNAME_RATER, PASSWORD_RATER);
		try {
		}catch(Exception e) {
		}
		driver.findElement(CommonPageElement.raterPartialLink).click();
	}
	public WebDriver openApp_admin(boolean multiDriverMode,String USERNAME_ADMIN, String PASSWORD_ADMIN) {
		if(multiDriverMode) {
			driver = ShinSaitenApp.launchApp();
			driver.get(prop.getProperty("APP_URL"));
			Action.click(driver,By.partialLinkText("Login"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			login_to_admin(USERNAME_ADMIN,PASSWORD_ADMIN);
		}else {
			if(driver ==null) {
				driver = ShinSaitenApp.launchApp();
				driver.get(prop.getProperty("APP_URL"));
				Action.click(driver,By.partialLinkText("Login"));
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				login_to_admin(USERNAME_ADMIN,PASSWORD_ADMIN);
			}
		}
		return driver;
	}
	public WebDriver openApp_manager(boolean multiDriverMode,String USERNAME_MANAGER, String PASSWORD_MANAGER) {
		if(multiDriverMode) {
			driver = ShinSaitenApp.launchApp();
			driver.get(prop.getProperty("APP_URL"));
			driver.findElement(By.partialLinkText("Login")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			login_to_manager(USERNAME_MANAGER,PASSWORD_MANAGER);
		}else {
			if(driver ==null) {
				driver = ShinSaitenApp.launchApp();
				driver.get(prop.getProperty("APP_URL"));
				driver.findElement(By.partialLinkText("Login")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				login_to_manager(USERNAME_MANAGER,PASSWORD_MANAGER);
			}
		}
		return driver;
	}
	public WebDriver openApp_rater(boolean multiDriverMode,String USERNAME_RATER, String PASSWORD_RATER) {
		if(multiDriverMode) {
			driver = ShinSaitenApp.launchApp();
			driver.get(prop.getProperty("APP_URL"));
			driver.findElement(By.partialLinkText("Login")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			login_to_rater(USERNAME_RATER,PASSWORD_RATER);
		}else {
			if(driver ==null) {
				driver = ShinSaitenApp.launchApp();
				driver.get(prop.getProperty("APP_URL"));
				driver.findElement(By.partialLinkText("Login")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				login_to_rater(USERNAME_RATER,PASSWORD_RATER);
			}
		}
		return driver;
	}
	/*
	 * To retrieve and return rows from csv file for the given screen
	 * Parameters: csvFile (csvFile name, screenName: Name of the screen)
	 */
	/*public List<String> getCsvRow(String csvFile, String screenName) throws IOException
	{
		csvFile = "src/test/resources/" + csvFile;
		try (
				BufferedReader reader = new BufferedReader(new FileReader(csvFile));
				)
		{
			List<String> lines = new ArrayList<>();
			String line = null;
			String screen = null;
			while ((line = reader.readLine()) != null) {
				//LoggerUtils.info(line);
				screen = line.substring(0, line.indexOf(","));
				if(screenName.equals(screen)) {
					lines.add(line);
				}
			}
			return lines;
		}
	}
	/*
	 * To check if given label exists on page
	 * Parameters: csvFile (csvFile name, screenName: Name of the screen)
	 */
	/*public void validateLabels(String csvFile, String screenName) throws IOException
	{
		List<String> csvRow = getCsvRow(csvFile, screenName);
		for(int i=0; i < csvRow.size(); i++) {
			String[] arrSplit = csvRow.get(i).split(",");
			driver.get(APP_URL+ arrSplit[1]);
			HomePage currentPage = new HomePage(driver);
			if(screenName=="Results Package") {
				Action.waitForElementVisibilty(driver, By.id("brandKey"));
				Select DropDown=new Select(driver.findElement(By.id("brandKey")));
				Action.waitForElementTextToBePresent(driver, By.id("brandKey"), "JMIN-Brand");
				DropDown.selectByVisibleText("JMIN-Brand");
				DropDown=new Select(driver.findElement(By.id("projectID")));
				Action.waitForElementTextToBePresent(driver, By.id("projectID"), "JMIN-Project");
				DropDown.selectByVisibleText("JMIN-Project");
				driver.findElement(CommonPageElement.primaryBtnObject).click();
			}
			for(int column=3; column < arrSplit.length; column++) {
				LoggerUtils.info(arrSplit[column]);
				boolean isDisplayed = currentPage.labelExist(arrSplit[column]);
				//assertTrue("\""+ arrSplit[column] + "\" label not found on screen \"" + screenName + "\"", isDisplayed);
				Assert.assertTrue("\""+ arrSplit[column] + "\" label not found on screen \"" + screenName + "\" " + arrSplit[2] + "  "+ arrSplit[1] , isDisplayed);
			}
		}
	}
	/*
	 * To retrieve and return header row from csv file
	 * Parameters: csvFile (csvFile name)
	 */
	/*public String getCsvHeaders(String csvFile) throws IOException
	{
		//csvFile = Settings.DownloadPath + csvFile;
		try (
				BufferedReader reader = new BufferedReader(new FileReader(csvFile));
				)
		{
			String headerRow = reader.readLine();
			return headerRow;
		}
	}
	/*
	 * To retrieve and return column names used in table header
	 * Parameters: WebElement pointing to table
	 */
	/*public List<String> getCellsUnderHeader(WebElement table)
	{
		List<WebElement> thList = table.findElements(By.cssSelector("th"));
		List<String> headers = new ArrayList<>();
		thList.stream().forEach(th -> headers.add(th.getText()));
		return headers;
	}
	/*
	 * To retrieve latest filename from 'Downloads' matching the regular pattern
	 * Parameters: String-filePattern pattern to search for.
	 */
/*	public static String getFileUsingPattern(String filePattern)
	{
		String DownloadFileName = null;
		ThreadUtils.appWait(2000);
		File dir = new File(DownloadPath);
		LoggerUtils.info("File path: " + DownloadPath);
		LoggerUtils.info(filePattern);
		FileFilter fileFilter = new WildcardFileFilter(filePattern);
		File[] files = dir.listFiles(fileFilter);
		//If more than 1 file, sort those with latest
		if(files.length > 1) {
			Arrays.sort(files, new Comparator<File> () {
				@Override
				public int compare (File f1, File f2) {
					return Long.valueOf(f2.lastModified()).compareTo(f1.lastModified());
				}
			});
		}
		if(files.length >= 1) {
			DownloadFileName = files[0].toString();
		}
		LoggerUtils.info("File: "+ DownloadFileName);
		return DownloadFileName;
	}
	/**
	 * Takes a parent element and strips out the textContent of all child elements and returns textNode content only
	 *
	 * @param e: the parent element
	 * @return the text from the child textNodes
	 */
	/*public static String getTextNode(WebElement e)
	{
		String text = e.getText().trim();
		List<WebElement> children = e.findElements(By.xpath("./*"));
		for (WebElement child : children)
		{
			text = text.replaceFirst(child.getText(), "").trim();
		}
		return text;
	}
	/*
	 * This method inputs required data in form
	 */
/*	public void inputFilterData(int advanceToggle) {
		Select brandKey = new Select(driver.findElement(By.id("brandKey")));
		brandKey.selectByValue(BRAND_NAME);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select project = new Select(driver.findElement(By.id("projectID")));
		project.selectByVisibleText(PROJECT_NAME);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select testset = new Select(driver.findElement(By.id("rcID")));
		testset.selectByVisibleText(TESTSET_NAME);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		if(advanceToggle == 1) {
			driver.findElement(By.id("advSearchButton")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
	}
	public String arrayListContain(ArrayList<String> arrData, String strValue) {
		//Check if partial value exist
		if(!arrData.isEmpty()) {
			for(String value : arrData){
				if(value.contains(strValue)) {
					return value;
				}
			}
		}
		return "";
	}
	public void timezoneDiff(ArrayList<Date> updatedtime_timezone1, ArrayList<Date> updatedtime_timezone2)
	{
		for(int i=0;i<updatedtime_timezone1.size();i++)
		{
			long diff = updatedtime_timezone1.get(i).getTime() - updatedtime_timezone2.get(i).getTime();
			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);
			if(diff_Days != diffDays || diff_Hours != diffHours || diff_Minutes != diffMinutes || diff_Seconds!= diffSeconds )
			{
				throw new RuntimeException("Difference is not correct");
			}
		}
	}
	public void validateURLaccess(String csvFile, String screenName) throws IOException
	{
		List<String> csvRow = getCsvRow(csvFile, screenName);
		for(int i=0; i < csvRow.size(); i++) {
			String[] arrSplit = csvRow.get(i).split(",");
			driver.get(APP_URL+ arrSplit[1]);
			if(screenName=="Rater Logs")
			{
				String actMessage =  driver.findElement(By.id("w3-danger-0")).getText();
				actMessage = actMessage.substring(2);
				String expMessageforLogs ="URL is accessible to Manager. It should not accessible";
				Assert.assertTrue(expMessageforLogs, actMessage.equals(expMessageforLogs));
				//				if(!actMessage.equals(expMessageforLogs))
				//				{
				//					throw new RuntimeException("URL is accessible to Manager");
				//				}
			}
			else	{
				String actMessage =  driver.findElement(By.id("w3-danger-0")).getText();
				actMessage = actMessage.substring(2);
				String actpageDisplayed = driver.findElement(By.xpath("//div[@id ='main-right-div']/h1")).getText();
				String expMessage = "You don't have access to this page";
				String exppageDisplayed = "Rating Projects";

				Assert.assertFalse("URL is accessible to Manager. It should not accessible",
						(!actMessage.equals(expMessage) || !actpageDisplayed.equals(exppageDisplayed)));

				//				if(!actMessage.equals(expMessage) || !actpageDisplayed.equals(exppageDisplayed))
				//				{
				//					throw new RuntimeException("URL is accessible to Manager");
				//				}
			}
		}
	}
	public void validateURLaccessMainPage(String csvFile, String screenName) throws IOException
	{
		List<String> csvRow = getCsvRow(csvFile, screenName);
		for(int i=0; i < csvRow.size(); i++) {
			String[] arrSplit = csvRow.get(i).split(",");
			driver.get(APP_URL+ arrSplit[1]);
			if(screenName=="Rater Logs")
			{
				String actMessage =  driver.findElement(By.id("w2-danger-0")).getText();
				actMessage = actMessage.substring(2);
				String expMessageforLogs ="Sorry, you dont have access to this page.";
				Assert.assertTrue("URL is accessible to Manager. It should not accessible",(!actMessage.equals(expMessageforLogs)));
				//				{
				//					throw new RuntimeException("URL is accessible to Manager");
				//				}
			}
			else	{
				String actMessage =  driver.findElement(By.id("w2-danger-0")).getText();
				actMessage = actMessage.substring(2);
				String actpageDisplayed = driver.findElement(By.xpath("//div[@class='admin-default-index']/h1")).getText();
				String expMessage = "You don't have access to this page";
				String exppageDisplayed = "Manager Main Page";
				Assert.assertFalse("URL is accessible to Manager. It should not accessible",
						(!actMessage.equals(expMessage) || !actpageDisplayed.equals(exppageDisplayed)));
				//				{
				//					throw new RuntimeException("URL is accessible to Manager");
				//				}
			}
		}
	}
	public void validateURLaccesswithoutlogin(String csvFile, String screenName) throws IOException
	{
		List<String> csvRow = getCsvRow(csvFile, screenName);
		for(int i=0; i < csvRow.size(); i++) {
			String[] arrSplit = csvRow.get(i).split(",");
			driver.get(APP_URL+ arrSplit[1]);
			String actMessage =  driver.findElement(By.tagName("h1")).getText();
			LoggerUtils.info(actMessage);
			String expMessageforLogs ="Login";
			Assert.assertFalse("URL is accessible without Login. It should not accessible",
					(!actMessage.equals(expMessageforLogs)));
			//			{
			//				throw new RuntimeException("URL is accessible without Login");
			//			}
		}
	}
	public void validateEmptytable(String csvFile, String screenName) throws IOException
	{
		List<String> csvRow = getCsvRow(csvFile, screenName);
		for(int i=0; i < csvRow.size(); i++) {
			String[] arrSplit = csvRow.get(i).split(",");
			driver.get(APP_URL+ arrSplit[1]);
			List<WebElement>  tableData = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered']/tbody/tr/td"));
			if(screenName=="CT and QC")
			{
				Assert.assertFalse("URL is accessible to Manager. It should not accessible",
						tableData.size()>1);
				//				if(tableData.size()>1)
				//				{
				//					throw new RuntimeException("URL is accessible to Manager");
				//				}
			}
		}
	}
	/*
	 * To retrieve and return column from csv file
	 * Parameters: csvFile (csvFile name, column number)
	 */
/*	public List<String> getCsvColumn(String csvFile, int column) throws IOException
	{
		String screen = "";
		String line;
		List<String> arrColumn = new ArrayList<>();
		try (
				BufferedReader reader = new BufferedReader(new FileReader(csvFile));
				)
		{
			while ((line = reader.readLine()) != null) {
				String[] arrData = line.split(",");
				arrColumn.add(arrData[column]);
			}
			//LoggerUtils.info(arrColumn);
			return arrColumn;
		}
	}
	public List<String> getData(String csvFile, String screenName) throws IOException
	{
		List<String> csvRow = getCsvRow(csvFile, screenName);
		List<String> arrColumn = new ArrayList<>();
		for(int i=0; i < csvRow.size(); i++) {
			String[] arrSplit = csvRow.get(i).split(",");
			LoggerUtils.info(arrSplit[1]);
			arrColumn.add(arrSplit[1]);
		}
		return arrColumn;
	}
}
*/