package testCasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TCAClearLoginPage extends WebHandler{
	
	public static By ClearLogin= By.xpath("html[1]/body[1]/app-root[1]/app-test-center-admin[1]/body[1]/div[2]/div[1]/div[1]/app-test-center-side-menu[1]/div[1]/ul[1]/li[5]");
	public static By ExamineesNumberSearch= By.xpath("//input[contains(@class,'text-muted d-inline-block')]");
	public static By ExamineesNumberInputField= By.xpath("//input[contains(@class,'edu-input form-control')]");
	public static By ExamineesNumberSearchButton= By.xpath("//*[@class='fas fa-search edu-search']");
	public static By RadioButton = By.xpath("//input[@type='radio']");
	public static By ChoiceButton= By.xpath("(//button[contains(@class,'btn btn-edulabs')])[2]");
	public static By ResetExam=By.xpath("//button[contains(@class,'btn btn-edulabs')]");
	public static By ResetExamYes=By.xpath("//button[@class='btn btn-success']");

	
	public static void ClearLoginClick() throws Exception {
		ElementActions.waitForElementVisibilty(ClearLogin);
		ElementActions.click(ClearLogin);
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
	
}


