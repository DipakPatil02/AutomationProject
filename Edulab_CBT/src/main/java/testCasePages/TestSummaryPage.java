package testCasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TestSummaryPage extends WebHandler {
	public static By Answred= By.xpath("//span[contains(text(),'解答済み')]");
	public static By UnAnswred=By.xpath("//span[contains(text(),'未解答')]");
	public static By ReviewForLater= By.xpath("//span[contains(text(),'後で見直す')]");
	public static By NotVisited= By.xpath("//span[contains(text(),'未着手')]");
	public static By ClickOnQue28 = By.xpath("/html/body/app-root/app-student/app-pre-submit-exam/div/div/div[2]/div/div/div[2]/div/div[27]/div/div/a");
	public static By ReturnedToExam=By.xpath("(//span[@class='button__text d-inline-flex'])[101]");
	public static By ExamEnd=By.xpath("(//span[@class='button__text d-inline-flex'])[102]");
	public static By Title=By.xpath("//div[@class='ex-test__script-title']");
	
	
	public static void ClickonQue17() throws Exception {
		Thread.sleep(2000);
		ElementActions.click(ClickOnQue28);
	}
	
	public static void ReturnToExamClick() throws Exception {
		ElementActions.waitForElementVisibilty(ReturnedToExam);
		ElementActions.click(ReturnedToExam);
	}
	public static void EndExamClick() throws Exception {
		ElementActions.waitForElementVisibilty(ExamEnd);
		ElementActions.click(ExamEnd);
	}
	
	public static void VerifyReturnToExamIsDisplayed() throws Exception {
		ElementActions.waitForElementVisibilty(ReturnedToExam);
		ElementActions.isElementPresent(ReturnedToExam);
		Thread.sleep(2000);
	}
	
	public static void VerifyEndExamIsDisplayed() throws Exception {
		ElementActions.waitForElementVisibilty(ExamEnd);
		ElementActions.isElementPresent(ExamEnd);
		Thread.sleep(2000);
	}
	public static void VerifyTestSummaryPageTitle() {
		 WebElement Title=WebHandler.driver.findElement(By.xpath("//div[@class='ex-test__script-title']"));
		 Assert.assertEquals("解答一覧",Title.getText());
		
		
	}
	public static void AnsweredQues() {
		ElementActions.waitForElementVisibilty(Answred);
		if(ElementActions.isElementPresent(Answred)) {
			System.out.println("Answered Question status is visible");
		}	
		else {
			System.out.println("Answered status is not present");
		}
	}
	public static void UnAnsweredQes() {
		ElementActions.waitForElementVisibilty(UnAnswred);
		if(ElementActions.isElementPresent(UnAnswred)) {
			System.out.println("Unanswered question status is present");
		}else {
			System.out.println("Unanswered question status is not present");
		}
	}
	public static void ReviewLaterStatus() {
		ElementActions.waitForElementVisibilty(ReviewForLater);
		if(ElementActions.isElementPresent(ReviewForLater)) {
			System.out.println("Review later status is present");
		}else {
			System.out.println("Review later staus is not present");
		}
	}
	public static void NotVisitedQue() {
		ElementActions.waitForElementVisibilty(NotVisited);
		if(ElementActions.isElementPresent(UnAnswred)) {
			System.out.println("Not visited status is present");
		}else {
			System.out.println("Not visited status is not present");
		}
	}
}
	


