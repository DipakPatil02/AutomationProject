package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TCAResumeLoginPage extends WebHandler {
	private static Logger log = LogManager.getLogger(TCAResumeLoginPage.class.getName());
	public static By ResumeLogin= By.xpath("(//*[@routerlinkactive='active'])[3]");
	public static By ExamineesNumberSearch= By.xpath("//input[contains(@class,'text-muted d-inline-block')]");
	public static By ExamineesNumberInputField= By.xpath("//input[contains(@class,'edu-input form-control')]");
	public static By ExamineesNumberSearchButton= By.xpath("//*[@class='fas fa-search edu-search']");
	public static By RadioButton = By.xpath("//input[@type='radio']");
	public static By ChoiceButton= By.xpath("(//button[contains(@class,'btn btn-edulabs')])[2]");
	public static By ConfirmResumeExam=By.xpath("//button[contains(@class,'btn btn-edulabs')]");
	public static By ResetExamYes=By.xpath("//button[@class='btn btn-success']");
	public static By ErrorMessage=By.xpath("//div[@class='t-select__btn']/following-sibling::div[1]");
	public static By ResumeExam=By.xpath("//span[@class='button__text d-inline-flex']");
	public static By TimerMinutes= By.xpath("//input[contains(@class,'adjust_remaining_time mr-4')]");
	public static By TimerSeconds= By.xpath("(//input[contains(@class,'adjust_remaining_time mr-4')])[2]");
	
	
	public static void ResumeLoginClick() throws Exception {
		ElementActions.waitForElementVisibilty(ResumeLogin);
		ElementActions.click(ResumeLogin);
		log.info("Click On Resume Login");
	}
	public static void ExamineesNumberSearch() throws Exception {
		ElementActions.waitForElementVisibilty(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearch);
		log.info("Click on Examinees Number Search Field");
		
	}
	public static void ExamineesInputField() throws Exception {
        WebElement Ele= WebHandler.driver.findElement(ExamineesNumberInputField);
        Thread.sleep(5000);
        Ele.sendKeys("dm0445");
        Thread.sleep(5000);
        log.info("Enter Examinees Number In Input Field");
	}
	public static void ExamineesInputField1() throws Exception {
        WebElement Ele= WebHandler.driver.findElement(ExamineesNumberInputField);
        Thread.sleep(5000);
        Ele.sendKeys("dm0451");
        Thread.sleep(5000);
        log.info("Enter Examinees Number In Input Field");
	}
	public static void ExamineesInputField2() throws Exception {
        WebElement Ele= WebHandler.driver.findElement(ExamineesNumberInputField);
        Thread.sleep(5000);
        Ele.sendKeys("dm0449");
        Thread.sleep(5000);
        log.info("Enter Examinees Number In Input Field");
	}
	
	public static void TimerSecondsInput() throws Exception {
		WebElement Sec= WebHandler.driver.findElement(TimerSeconds);
		Thread.sleep(5000);
		Sec.sendKeys("20");
		Thread.sleep(5000);
	}
	public static void ExamineesSearchButton() throws Exception {
		ElementActions.webDriverWait(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearchButton);
		log.info("Click On Search Button");		
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
	public static void ClickOnConfirmResumeExam() throws Exception {
		ElementActions.waitForElementVisibilty(ConfirmResumeExam);
		ElementActions.click(ConfirmResumeExam);
		log.info("Click On Resume Exam");
	}
	public static void ResetExamYes() throws Exception {
		ElementActions.waitForElementVisibilty(ResetExamYes);
		ElementActions.click(ResetExamYes);
		log.info("Click On Yes In Popup");
	}
	public static void ValidateErrorMessage() throws Exception {
		if(ElementActions.isDisplayed(ErrorMessage)) {
			WebHandler.driver.switchTo().newWindow(WindowType.TAB).get("https://gastrodoctor-stage.edulabcbt.com/#/auth/login");
			
		}
	}
	public static void ResumeExam() throws Exception {
		ElementActions.waitForElementVisibilty(ResumeExam);
		ElementActions.click(ResumeExam);
		log.info("Click On Resume Exam");
	}
	public static void TimerMinutesInput() throws Exception {
		WebElement Min= WebHandler.driver.findElement(TimerMinutes);
		Thread.sleep(5000);
		Min.sendKeys("00");
		Thread.sleep(5000);
	}
	public static void ClickOnTimerSecondsInput() throws Exception {
		ElementActions.waitForElementVisibilty(TimerSeconds);
		ElementActions.click(TimerSeconds);
		WebElement Sec= WebHandler.driver.findElement(TimerSeconds);
		Sec.clear();
	}
	public static void ClickOnTimerMinutesInputField() throws Exception {
		ElementActions.waitForElementVisibilty(TimerMinutes);
		ElementActions.click(TimerMinutes);
			WebElement Time= WebHandler.driver.findElement(TimerMinutes);
			Time.clear();
	}
		
		
	}
	
	


