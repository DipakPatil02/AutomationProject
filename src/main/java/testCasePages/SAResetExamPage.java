package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class SAResetExamPage extends WebHandler {
	private static Logger log = LogManager.getLogger(SAResetExamPage.class.getName());
	public static By ExamReset= By.xpath("(//li[@routerlinkactive='active']/following-sibling::li)[3]");
	public static By ExamineesNumberSearch= By.xpath("//input[contains(@class,'text-muted d-inline-block')]");
	public static By ExamineesNumberInputField= By.xpath("//input[contains(@class,'edu-input form-control')]");
	public static By ExamineesNumberSearchButton= By.xpath("//*[@class='fas fa-search edu-search']");
	public static By RadioButton = By.xpath("//input[@type='radio']");
	public static By ChoiceButton= By.xpath("(//button[contains(@class,'btn btn-edulabs')])[2]");
	public static By ResetExam=By.xpath("//button[contains(@class,'btn btn-edulabs')]");
	public static By ResetExamYes=By.xpath("//button[@class='btn btn-success']");

	
	public static void ExamResetClick() throws Exception {
		ElementActions.waitForElementVisibilty(ExamReset);
		ElementActions.click(ExamReset);
		log.info("Click on Exam Reset");
	}
	public static void ExamineesNumberSearch() throws Exception {
		ElementActions.waitForElementVisibilty(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearch);
		log.info("Click on ExamNumber Search input Field");
	}
	public static void ExamineesInputField() throws Exception {
//		ElementActions.waitForElementVisibilty(ExamineesNumberInputField);
//		ElementActions.SendKeys(ExamineesNumberInputField,"dm0321");
        WebElement Ele= WebHandler.driver.findElement(ExamineesNumberInputField);
        Thread.sleep(10000);
        Ele.sendKeys("dm0445");
        Thread.sleep(10000);
        log.info("Enter Examiness Number in The Input Field");
	}
	public static void ExamineesSearchButton() throws Exception {
//		Thread.sleep(2000);
		ElementActions.webDriverWait(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearchButton);
//		Thread.sleep(2000);
		log.info("Examiness Number Search Button");
		
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
		Thread.sleep(4000);
		log.info("Click On Reset Exam Button");
	}
	public static void ResetExamYes() throws Exception {
		
		ElementActions.waitForElementVisibilty(ResetExamYes);
		ElementActions.click(ResetExamYes);
		log.info("Click On Yes In Confirmation Popup");
		
	}
	
}
