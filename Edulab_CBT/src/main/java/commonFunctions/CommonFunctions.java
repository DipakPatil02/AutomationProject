package commonFunctions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.excelUtils;
import Utils.scrollUtils;
import assertions.Assertions;
import elementActions.ElementActions;
import scorepointPages.Wait;
import shinsaiten.utils.ThreadUtils;
import testCasePages.Base;
import webHandler.*;

public class CommonFunctions {
	public static By dangerAlert =  By.xpath("//div[@class='alert-danger alert fade in']");
	public static By exit = By.xpath("(//a[@href='#'])[3]");
	public static By loader = By.id("overlayLoader");
	public static By radioButton = By.xpath("//input[@name='unit[context][0][rating]' and @value='1']");
	public static By successMsgDiv = By.xpath("//div[contains(@class,'alert-success alert')]");
	public static By warningMsgDiv = By.xpath("//div[contains(@class,'alert-warning')]");
	public static By searchedItemsTable = By.xpath("//*[@id=\"w0\"]");
	public static By alertDanger = By.xpath("//div[contains(@class,'alert-danger alert fade in')]");

	private static Logger log = LogManager.getLogger(CommonFunctions.class.getName());

	public static void createQuetionSetForInitialTraining (String Status,String questionSetName) throws Exception {		
		ElementActions.waitForElementToBeVisibleAndClick(scorepointPages.CommonPageElements.InitialTrainingLink);
		log.info("Clicked on Initial Training Link");
		ElementActions.click(scorepointPages.CommonPageElements.CreateQuetionSet);
		log.info("Clicked on Create Quetion Set");
		ElementActions.send(scorepointPages.CommonPageElements.questionName,questionSetName);
		log.info("Entered quetsion name:  "+questionSetName);
		Select status = new Select(WebHandler.driver.findElement(scorepointPages.CommonPageElements.questionStatus));
		status.selectByVisibleText(Status);
		log.info(" question set status: "+Status );
		ElementActions.click(scorepointPages.CommonPageElements.btnsuccess);
		ElementActions.waitForElementVisibilty(scorepointPages.CommonPageElements.successAlert);
		String message = ElementActions.getText(scorepointPages.CommonPageElements.successAlert);
		Assertions.assertStrings(message.substring(2), "Question Set created!");
		log.info("Quetion set for Initial Training added");		
	}
	public void accessingmodelanswers(String training) {
		ThreadUtils.appWait(2000);
		List<WebElement> rowsQuestionsets = WebHandler.driver.findElements(scorepointPages.CommonPageElements.object_2175);
		ThreadUtils.appWait(2000);
		log.info(rowsQuestionsets.get(0).getText());
		for(WebElement rowElement : rowsQuestionsets) 
		{
			List<WebElement> colElement = rowElement.findElements(scorepointPages.CommonPageElements.tadtd);
			ThreadUtils.appWait(2000);
			if(colElement.size()>0)
			{
				log.info(colElement.size());
				log.info(colElement.get(1).getText());
				if (colElement.get(1).getText().equals(training))
				{
					rowElement.findElement(scorepointPages.CommonPageElements.modelAnswers).click();
					ThreadUtils.appWait(2000);
					return;
				}
			}
		}
	}
	public static void addAnswerSheetwithModelRating(String projectName, String Training, int NoofAnsSheets ) throws Exception {
		ElementActions.waitForElementToBeVisibleAndClick(scorepointPages.CommonPageElements.InitialTrainingLink);;
		log.info("clicked on initial training link");
		ThreadUtils.appWait(2000);
		CommonFunctions ca = new CommonFunctions();
		ca.accessingmodelanswers(Training);
		for (int i = 1; i <= NoofAnsSheets; i++) {
			ElementActions.click(scorepointPages.CommonPageElements.cretaeModelAnswer);
			log.info("Clicked on Create Model Answer link");
			ThreadUtils.appWait(2000);
			ElementActions.click(scorepointPages.CommonPageElements.primaryBtnObject);
			log.info("Clicked on primary button");
			ThreadUtils.appWait(2000);
			ElementActions.click(scorepointPages.CommonPageElements.Universal_BackBtnLink);
			log.info("Clicked on back button");
			ThreadUtils.appWait(2000);
		}
		List<WebElement> modelanswer = WebHandler.driver.findElements(scorepointPages.CommonPageElements.ModelRatingNil);
		log.info("Total element is " + modelanswer.size());
		for (int j = 0; j < modelanswer.size(); j++) {
			int a = j + 1;
			ThreadUtils.appWait(5000);
			ElementActions.click(By.xpath("//tbody/tr[" + a + "]/td[8]/a[1]"));
			log.info(" click on model rating link" );
			ThreadUtils.appWait(2000);
			List<WebElement> options = WebHandler.driver.findElements(scorepointPages.CommonPageElements.RaterPage_EVCriteria1_1To5_Score2Link2);
			for (WebElement rowElement : options) {
				rowElement.click();
				ThreadUtils.appWait(3000);
			}
			ThreadUtils.appWait(1000);
			JavascriptExecutor js = (JavascriptExecutor) WebHandler.driver;
			js.executeScript("window.scrollBy(0,200)");			
			ElementActions.click( scorepointPages.CommonPageElements.cretaeRating);
			log.info("Click on create rating button");
			ThreadUtils.appWait(2000);
			String modalRatingActualMessage = WebHandler.driver.findElement(scorepointPages.CommonPageElements.Universal_SuccessFlashNotification2Link).getText().substring(2);
			String modalratingExpectedMessage = "Rating successfully saved.";
			Assertions.assertStrings(modalratingExpectedMessage, modalRatingActualMessage);
			ElementActions.click(scorepointPages.CommonPageElements.Universal_BackBtnLink);
			log.info("As a admin verify modal rating for IT is saved successfully");
			ThreadUtils.appWait(2000);
		}
		ElementActions.click(scorepointPages.CommonPageElements.Universal_BackBtnLink);
	}
	public static void manageCollections(int Collections, int NofAnswersheets) throws Exception {
		ElementActions.click(scorepointPages.CommonPageElements.QuestionSetPage_ManageCollectionsLink);
		ThreadUtils.appWait(2000);
		for(int i = 1; i <= Collections; i++){	
			Select it = new Select(WebHandler.driver.findElement(scorepointPages.CommonPageElements.ansId));
			for (int j = 1; j <= NofAnswersheets; j++) {
				ThreadUtils.appWait(2000);
				it.selectByIndex(j-1);
				ThreadUtils.appWait(2000);
			}
			ElementActions.click(scorepointPages.CommonPageElements.action);
			ThreadUtils.appWait(2000);
			String modalRatingActualMessage = WebHandler.driver.findElement(scorepointPages.CommonPageElements.Universal_SuccessFlashNotification2Link).getText().substring(2);
			String modalratingExpectedMessage = "Collection successfully saved.";
			Assertions.assertStrings(modalratingExpectedMessage, modalRatingActualMessage);	
		}
	}
	public static void manageOddAnswerSheetCollections(int Collections, int NofAnswerSheets) throws Exception {
		ElementActions.click(scorepointPages.CommonPageElements.QuestionSetPage_ManageCollectionsLink);
		log.info("Click on Manage Collections");
		ThreadUtils.appWait(2000);
		for (int i = 0; i < Collections; i++) {
			Select it = new Select(WebHandler.driver.findElement(scorepointPages.CommonPageElements.ansId));
			ThreadUtils.appWait(2000);
			for (int j = 1; j <= NofAnswerSheets; j++) {
				it.selectByIndex(j-1);
				ThreadUtils.appWait(2000);
			}
		}
		ElementActions.click(scorepointPages.CommonPageElements.action);
		ThreadUtils.appWait(2000);
		String modalRatingActualMessage = WebHandler.driver.findElement(scorepointPages.CommonPageElements.Universal_SuccessFlashNotification2Link).getText().substring(2);
		String modalratingExpectedMessage = "Collection successfully saved.";
		Assertions.assertStrings(modalratingExpectedMessage, modalRatingActualMessage);
		System.out.println("collection created");
	}
	public static void switchToChildWindow( int childWindowIndex) {
		Set<String> windowHandles = WebHandler.driver.getWindowHandles();
		String[] handles = windowHandles.toArray(new String[windowHandles.size()]);
		String childWindowHandle = handles[childWindowIndex];
		WebHandler.driver.switchTo().window(childWindowHandle);
	}
	public static String getCurrentDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime = now.format(formatter);
		return formattedDateTime;
	}

	public static void clickOnLink(String linkText, String testCaseId) {

		if (testCaseId == null) {
			ElementActions.waitForElementToBeVisibleAndClick(By.linkText(linkText));
			log.info("Clicked on link: "+linkText);
			if(linkText.equals("Clear Test In Process")) 
			{
				String alertText = ElementActions.alertText();
				log.info("Accepted alert: "+ alertText);
			}
		}
		else {
			Map<String, String> testData = excelUtils.getTestData(testCaseId);
			if(linkText.contains("PROJECTNAME")) {
				String projectName = testData.get(linkText);
				ElementActions.waitForElementToBeVisibleAndClick(By.linkText(projectName));
				log.info("Clicked on link: "+projectName);
			}
			if(linkText.contains("TESTSET"))
			{
				String testSet = testData.get(linkText);
				ElementActions.waitForElementToBeVisibleAndClick(By.linkText(testSet));
				log.info("Clicked on link: "+testSet);
			}
		}       
	}
	public static void verifymesage(String message, String attribute) {
		switch (attribute) {
		case ("Complete In Progress"):
		{
			ElementActions.waitForElementVisibilty(dangerAlert);
			String actual = ElementActions.getText(dangerAlert).substring(2);
			log.info("Expected message: "+message);
			log.info("Actual message: "+actual);
			Assertions.assertStrings(actual, message);	
		}break;
		}		
	}

	public static String getEnviornment() throws FileNotFoundException {
		String propertyFilePath = System.getProperty("user.dir") + "\\project\\common.properties";
		BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
		String enviornment = null;
		Properties properties = new Properties();
		try {
			properties.load(reader);
			enviornment = properties.getProperty("env");
			log.info("Selected environment as " + enviornment);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return enviornment;
	}

	public static void waitAndRefreshRating() {
		try {
			WebDriverWait wait = new WebDriverWait(WebHandler.driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.id("overlayLoader"))));
			log.info("waiting for loader to disappear");
		}
		catch (Exception e) {
			if (e instanceof org.openqa.selenium.TimeoutException) {
				log.info("Overlay is still visible after waiting. Refreshing the page.");
			} else {
				log.info("Exception occurred: " + e.getMessage());
			}
			WebHandler.driver.navigate().refresh();
			log.info("Refreshed browser");
			ThreadUtils.appWait(10000);
		}		
	}
	public static void verifySuccessMessage(String message) {
		String actual = WebHandler.driver.findElement(successMsgDiv).getText().substring(2);		
		log.info("Actual message: " + actual);
		log.info("Expected message: " + message);
		Assertions.assertStrings(actual, message);	
	}
	public static void verifyWarningMessage(String message) {	
		String warningMessage = null;
		if (message.equals("No tests available")) {
			By noTestAvailableDiv = By.xpath("//strong[text()='(No tests available)']");
			log.info("Expected message: " + message);
			Assertions.assertTrue("Warning message for no test available is displayed ", ElementActions.isDisplayed(noTestAvailableDiv));
		} else {
			Wait.Explicitwait(30, warningMsgDiv);
			warningMessage = WebHandler.driver.findElement(warningMsgDiv).getText().substring(2);
			log.info("Actual message: " + warningMessage);
			log.info("Expected message: " + message);
			Assertions.assertStrings(warningMessage, message);
		}	
	}
	public static void verifyAlertDangerMessage(String message) {
		String actual = WebHandler.driver.findElement(alertDanger).getText().substring(2);		
		log.info("Actual message: " + actual);
		log.info("Expected message: " + message);
		Assertions.assertStrings(actual, message);	
	}
	//This function cleans the values from globalvariables.
	public static void clearGlobalValues(String globalVariable) {
		if(globalVariable.equals("globalvalues2")) {
			Base.globalvalues2.clear();;
		}
		if(globalVariable.equals("globalvalues3")) {
			Base.globalvalues3.clear();
		}
		if(globalVariable.equals("globalvalues")) {
			Base.globalvalues.clear();
		}
		log.info("Values ("+ globalVariable+") from global variable are cleared");
	}
	//This function collects all the answersheets of the specific testset from the Registered Test screen.
	//This function is used in other function that is (create new RAB when answersheet Id is given.)

	public static void selectAndStoreAnswerSheets(String status,String globalvalueName) {
		clearGlobalValues(globalvalueName);
		log.info("Answer sheets stored in :"+globalvalueName);
		List<String> globalvalues = null;
		if(globalvalueName.equals("globalvalues2")) {
			globalvalues=Base.globalvalues2;
		}
		else if(globalvalueName.equals("globalvalues3")) {
			globalvalues=Base.globalvalues3;
		}
		else {
			globalvalues=Base.globalvalues;
		}
		scrollUtils.scrollDownByPixels(WebHandler.driver,500);
		WebElement table = WebHandler.driver.findElement(searchedItemsTable);
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));

		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.xpath(".//td"));

			if (columns.size() >= 11 && columns.get(7).getText().equals(status)) {
				String answerId = columns.get(1).getText();
				globalvalues.add(answerId);	                
			}
		}
		log.info("Answer sheet id : " + globalvalues.toString());	
	}	  
}