package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TCAClearLoginPage extends WebHandler{
	private static Logger log = LogManager.getLogger(TCAClearLoginPage.class.getName());
	public static By ClearLogin= By.xpath("html[1]/body[1]/app-root[1]/app-test-center-admin[1]/body[1]/div[2]/div[1]/div[1]/app-test-center-side-menu[1]/div[1]/ul[1]/li[5]");
	public static By ExamineesNumberSearch= By.xpath("//input[contains(@class,'text-muted d-inline-block')]");
	public static By ExamineesNumberInputField= By.xpath("//input[contains(@class,'edu-input form-control')]");
	public static By ExamineesNumberSearchButton= By.xpath("//*[@class='fas fa-search edu-search']");
	public static By RadioButton = By.xpath("//input[@type='radio']");
	public static By ChoiceButton= By.xpath("(//button[contains(@class,'btn btn-edulabs')])[2]");
	public static By ResetExam=By.xpath("//button[contains(@class,'btn btn-edulabs')]");
	public static By ResetExamYes=By.xpath("//button[@class='btn btn-success']");
	public static By ResumeMessage= By.xpath("//div[contains(text(),'中止された試験を再開します。')]");
	
	public static void ClearLoginClick() throws Exception {
		ElementActions.waitForElementVisibilty(ClearLogin);
		ElementActions.click(ClearLogin);
		log.info("Click On Clear Login Button");
	}
	public static void ExamineesNumberSearch() throws Exception {
		ElementActions.waitForElementVisibilty(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearch);
		log.info("Click On ExamineesNumberSearch Input Field");
	}
	public static void ExamineesInputField() throws Exception {
//		ElementActions.waitForElementVisibilty(ExamineesNumberInputField);
//		ElementActions.SendKeys(ExamineesNumberInputField,"gt0103");
        WebElement Ele= WebHandler.driver.findElement(ExamineesNumberInputField);
        Thread.sleep(5000);
        Ele.sendKeys("gt0102");
        Thread.sleep(5000);
        log.info("Enter  Examinees Number In Input Field");
	}
	public static void ExamineesSearchButton() throws Exception {
//		Thread.sleep(2000);
		ElementActions.webDriverWait(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearchButton);
//		Thread.sleep(2000);
		log.info("Click On Search Button");
//		
	}
	public static void RadioButton() throws Exception {
		ElementActions.waitForElementVisibilty(RadioButton);
		ElementActions.click(RadioButton);
		log.info("Click On Radio Button");
	}
	public static void ChoiceButton() throws Exception {
		ElementActions.waitForElementVisibilty(ChoiceButton);
		ElementActions.click(ChoiceButton);
		log.info("Click On Choice Button");
	}
	public static void ResetExam() throws Exception {
		ElementActions.waitForElementVisibilty(ResetExam);
		ElementActions.click(ResetExam);
		log.info("Click On Reset Exam Button");
	}
	public static void ResetExamYes() throws Exception {
		ElementActions.waitForElementVisibilty(ResetExamYes);
		ElementActions.click(ResetExamYes);
		log.info("Click On Yes In Popup");
		
	}
	public static void CheckResumMessage() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(ResumeMessage);
		ElementActions.isElementPresent(ResumeMessage);
	}
}


