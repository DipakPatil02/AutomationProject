package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TestSummaryPage extends WebHandler {
	private static Logger log = LogManager.getLogger(TestSummaryPage.class.getName());
	public static By Answred= By.xpath("//span[contains(text(),'解答済み')]");
	public static By UnAnswred=By.xpath("//span[contains(text(),'未解答')]");
	public static By ReviewForLater= By.xpath("//span[contains(text(),'後で見直す')]");
	public static By NotVisited= By.xpath("//span[contains(text(),'未着手')]");
	public static By ClickOnQue28 = By.xpath("/html/body/app-root/app-student/app-pre-submit-exam/div/div/div[2]/div/div/div[2]/div/div[27]/div/div/a");
	public static By ReturnedToExam=By.xpath("(//span[@class='button__text d-inline-flex'])[101]");
	public static By ExamEnd=By.xpath("(//button[@class='button button--bg-blue button--radius-small button--size-long'])[1]");
	public static By Title=By.xpath("//div[@class='ex-test__script-title']");
	public static By NoClick=By.xpath("//button[@class='button button--bg-grey button--radius-small button--bg-white button--size-medium']");
	public static By EscYes= By.xpath("//button[@class='button button--bg-grey button--radius-small button--bg-white button--size-medium']");
	public static By QuestionStatus= By.xpath("//div[@class='status-static']");
	public static By ClosePopUp = By.xpath("//span[@aria-hidden='true']");
	
	public static void ClickonQue17() throws Exception {
		Thread.sleep(2000);
		ElementActions.click(ClickOnQue28);
		log.info("Click On Any Question Number");
	}
	
	public static void ReturnToExamClick() throws Exception {
		ElementActions.waitForElementVisibilty(ReturnedToExam);
		ElementActions.click(ReturnedToExam);
		log.info("Click On Return To Exam Button");
	}
	public static void EndExamClick() throws Exception {
		Thread.sleep(4000);
		ElementActions.waitForElementVisibilty(ExamEnd);
		ElementActions.click(ExamEnd);
		Thread.sleep(2000);
		log.info("Click On Exam End Button");
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
	public static void ClickonNo() throws Exception {
		ElementActions.waitForElementVisibilty(NoClick);
		ElementActions.isElementPresent(NoClick);
		Thread.sleep(2000);
	}
	
	public static void VerifyTestSummaryPageTitle() {
		 WebElement Title=WebHandler.driver.findElement(By.xpath("//div[@class='ex-test__script-title']"));
		 Assert.assertEquals("解答一覧",Title.getText());
		 log.info("Verify Test Summary Page Title");
		
		
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
	public static void ClickOnEscYes() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(EscYes);
		ElementActions.click(EscYes);
	}
	public static void CheckQuestionStatus() {
		ElementActions.waitForElementVisibilty(QuestionStatus);
		ElementActions.isElementPresent(QuestionStatus);
	}
	public static void ClickOnClosePopUp() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(ClosePopUp);
		ElementActions.click(ClosePopUp);
	}
}
	


