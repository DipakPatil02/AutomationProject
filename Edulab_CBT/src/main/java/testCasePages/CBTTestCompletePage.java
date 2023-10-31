package testCasePages;

import org.openqa.selenium.By;

import elementActions.ElementActions;

public class CBTTestCompletePage {
	public static By EndTest =By.xpath("(//button[@class='button button--bg-blue button--radius-small button--size-long'])[1]");
	public static By AnswerSent= By.xpath("//div[@class='submit-finish__mess-text mt-5 mb-5']");
	public static By SubmitMsg= By.xpath("//body//app-root//p[1]");
	public static By SubmitCheck=By.xpath("//div[@class='submit-finish__mess-icon']");
	public static By ConfirmYes= By.cssSelector(".button.button--bg-blue.button--radius-small.button--bg-white.button--size-medium");
	public static void ClickOnEndTest() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(EndTest);
		ElementActions.click(EndTest);
	}
	public static void ClickOnYes() throws Exception {
		Thread.sleep(4000);
		ElementActions.waitForElementVisibilty(ConfirmYes);
		ElementActions.click(ConfirmYes);
	}
	public static void CheckAnswerSentMsg() {
		ElementActions.waitForElementVisibilty(AnswerSent);
		if(ElementActions.isElementPresent(AnswerSent)) {
			System.out.println("Your answer has been sent.");
		}
		else {
			System.out.println("Your answer has not been sent.");
		}
	}
	public static void CheckSubmitMsg() {
		ElementActions.waitForElementVisibilty(SubmitMsg);
		if(ElementActions.isElementPresent(SubmitMsg)) {
			System.out.println("Thank you for your hard work,The exam is now over.Please notify the test proctor by raising your hand.");
		}
		else {
			System.out.println("Exam not submit");
		}
	}
	public static void CheckSubmitCheck() {
		ElementActions.waitForElementVisibilty(SubmitCheck);
		ElementActions.isElementPresent(SubmitCheck);
	}

}
