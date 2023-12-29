package testCasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TCAResumeLoginPage extends WebHandler {
	
	public static By ResumeLogin= By.xpath("(//*[@routerlinkactive='active'])[3]");
	public static By ExamineesNumberSearch= By.xpath("//input[contains(@class,'text-muted d-inline-block')]");
	public static By ExamineesNumberInputField= By.xpath("//input[contains(@class,'edu-input form-control')]");
	public static By ExamineesNumberSearchButton= By.xpath("//*[@class='fas fa-search edu-search']");
	public static By RadioButton = By.xpath("//input[@type='radio']");
	public static By ChoiceButton= By.xpath("(//button[contains(@class,'btn btn-edulabs')])[2]");
	public static By ResetExam=By.xpath("//button[contains(@class,'btn btn-edulabs')]");
	public static By ResetExamYes=By.xpath("//button[@class='btn btn-success']");
	public static By ErrorMessage=By.xpath("//div[@class='t-select__btn']/following-sibling::div[1]");
	public static By ResumeExam=By.xpath("//span[@class='button__text d-inline-flex']");
    
	
	public static void ResumeLoginClick() throws Exception {
		ElementActions.waitForElementVisibilty(ResumeLogin);
		ElementActions.click(ResumeLogin);
	}
	public static void ExamineesNumberSearch() throws Exception {
		ElementActions.waitForElementVisibilty(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearch);
	}
	public static void ExamineesInputField() throws Exception {
//		ElementActions.waitForElementVisibilty(ExamineesNumberInputField);
//		ElementActions.SendKeys(ExamineesNumberInputField,"gt0103");
        WebElement Ele= WebHandler.driver.findElement(ExamineesNumberInputField);
        Thread.sleep(5000);
        Ele.sendKeys("gt0102");
        Thread.sleep(5000);
	}
	public static void ExamineesSearchButton() throws Exception {
//		Thread.sleep(2000);
		ElementActions.webDriverWait(ExamineesNumberSearch);
		ElementActions.click(ExamineesNumberSearchButton);
//		Thread.sleep(2000);
		
//		
	}
	public static void RadioButton() throws Exception {
		ElementActions.waitForElementVisibilty(RadioButton);
		ElementActions.click(RadioButton);
	}
	public static void ChoiceButton() throws Exception {
		ElementActions.waitForElementVisibilty(ChoiceButton);
		ElementActions.click(ChoiceButton);
	}
	public static void ResetExam() throws Exception {
		ElementActions.waitForElementVisibilty(ResetExam);
		ElementActions.click(ResetExam);
	}
	public static void ResetExamYes() throws Exception {
		ElementActions.waitForElementVisibilty(ResetExamYes);
		ElementActions.click(ResetExamYes);
	}
	public static void ValidateErrorMessage() throws Exception {
		if(ElementActions.isDisplayed(ErrorMessage)) {
			WebHandler.driver.switchTo().newWindow(WindowType.TAB).get("https://gastrodoctor-stage.edulabcbt.com/#/auth/login");
			
		}
	}
	public static void ResumeExam() throws Exception {
		ElementActions.waitForElementVisibilty(ResumeExam);
		ElementActions.click(ResumeExam);
	}
   
		
		
	}
	
	


