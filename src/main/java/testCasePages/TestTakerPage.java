package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import elementActions.ElementActions;

public class TestTakerPage  {
	private static Logger log = LogManager.getLogger(TestTakerPage.class.getName());
	public static By OptionA = By.xpath("//span[@class='checkbox__checkmark']");
	public static By OptionB = By.xpath("(//input[@type='checkbox']/following-sibling::span)[3]");
	public static By OptionC = By.xpath("(//span[@class='checkbox__checkmark'])[3]");
	public static By OptionD = By.xpath("html[1]/body[1]/app-root[1]/app-student[1]/app-taking-test[1]/div[1]/div[1]/div[1]/div[2]/app-question-style-four[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/label[1]/div[1]/span[1]");
	public static By OptionE = By.xpath("html[1]/body[1]/app-root[1]/app-student[1]/app-taking-test[1]/div[1]/div[1]/div[1]/div[2]/app-question-style-four[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/label[1]/div[1]/span[1]");
	public static By NextButton = By.xpath("(//div[@class='panel-sidebar__btn']//button)[3]");
	public static By PreviousButton = By.xpath("(//div[@class='panel-sidebar__btn']//button)[2]");
	public static By ReviewLater = By.xpath("//div[@class='panel-sidebar__btn']//button[1]");
	public static By AnswerStatus = By.xpath("//div[@class='status-anwser']//a");
	public static By HideAll = By.xpath("//div[contains(@class,'display-content d-flex')]//span[1]");
	public static By ShowAll = By.xpath("(//div[contains(@class,'display-content d-flex')]//span)[3]");
	public static By DownWardArrow = By.xpath("(//a[@type='button'])[2]");
	public static By Zoomin = By.xpath("/html/body/app-root/app-student/app-taking-test/div/div/div/app-size/button[1]");
	public static By ZoomOut = By.xpath("/html/body/app-root/app-student/app-taking-test/div/div/div/app-size/button[2]");
	public static By ErrorMessage =By.xpath("//div[@class='modal-header']//div[1]");
	public static By ErrorMessageNo = By.xpath("html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]");
	public static By DisplayAnswerList = By.xpath("(//button[contains(@class,'button button--bg-white')]/following-sibling::button)[2]");
	public static By LeftArrow = By.xpath("//span[@class='arrow']//span[1]");
	public static By RightArrow = By.xpath("//div[@class='sidebar-collapse']//span");
	public static By ClickonAnyQuestion = By.xpath("//div[@id='99']/div[1]/span[17]/span[1]/span[1]");
	public static By ReviewLaterQue = By.xpath("html[1]/body[1]/app-root[1]/app-student[1]/app-taking-test[1]/div[1]/div[1]/app-sidebar[1]/app-sidebar-title[1]/div[2]/div[3]/span[1]");
	public static By AnsweredQue = By.xpath("(//span[@class='status-static__item-text']//font)[2]");
	public static By NotAnsweredQue = By.xpath("//div[@class='status-static__item']//div[1]");
	public static By NotStartedQue = By.xpath("//div[@id='99']/div[1]/span[17]/span[1]/span[1]");
	public static By ExamTitle = By.xpath("//div[@class='ex-info__title']");
	public static By ExamineesNumber = By.xpath("//div[@class='ex-info__user-id']");
	public static By EscNoButton= By.xpath("//button[@class='button button--bg-grey button--radius-small button--bg-white button--size-medium']");

	public static void ClickonOptionA () throws Exception {
		ElementActions.waitForElementVisibilty(OptionA);
		ElementActions.click(OptionA);
		log.info("Click On OPTION A");
	}
	public static void ClickonOptionB () throws Exception {
		ElementActions.waitForElementVisibilty(OptionB);
		ElementActions.click(OptionB);
		log.info("Click On OPTION B");
	}
	public static void ClickonOptionC () throws Exception {
		ElementActions.waitForElementVisibilty(OptionC);
		ElementActions.click(OptionC);
		log.info("Click On OPTION C");
	}
	public static void ClickonOptionD () throws Exception {
		ElementActions.waitForElementVisibilty(OptionD);
		ElementActions.click(OptionD);
		log.info("Click On OPTION D");
	}
	public static void ClickonOptionE () throws Exception {
		ElementActions.waitForElementVisibilty(OptionE);
		ElementActions.click(OptionE);
		log.info("Click On OPTION E");
	}
	public static void ClickonNextButton () throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(NextButton);
		ElementActions.click(NextButton);
		log.info("Click On Next Button");
	}
	public static void ClickonPreviousButton () throws Exception {
		ElementActions.waitForElementVisibilty(PreviousButton);
		ElementActions.click(PreviousButton);
		log.info("Click On Previous Button");
	}
	public static void ClickonReviewLater () throws Exception {
		ElementActions.waitForElementVisibilty(ReviewLater);
		ElementActions.click(ReviewLater);
		log.info("Click On Review Later Button");
	}
	public static void ClickonAnswerStatus() throws Exception {
		ElementActions.waitForElementVisibilty(AnswerStatus);
		ElementActions.click(AnswerStatus);
		log.info("Click On Answer Status Button");
	}
	public static void ClickonHideAll() throws Exception {
		ElementActions.waitForElementVisibilty(HideAll);
		ElementActions.click(HideAll);
		log.info("Click On HideAll Button");
	}
	public static void ClickonShowAll() throws Exception {
		ElementActions.waitForElementVisibilty(ShowAll);
		ElementActions.click(ShowAll);
		log.info("Click On Show All Button");
	}
	public static void ClickonDownwardArrow() throws Exception {
		ElementActions.waitForElementVisibilty(DownWardArrow);
		ElementActions.click(DownWardArrow);
		log.info("Click On DownWard Arrow Button");
	}
	public static void ClickonZoomin() throws Exception {
		ElementActions.waitForElementVisibilty(Zoomin);
		ElementActions.click(Zoomin);
		ElementActions.click(Zoomin);
		log.info("Click On Zoomin Button");

	}
	public static void ClickonZoomout() throws Exception {
		ElementActions.waitForElementVisibilty(ZoomOut);
		ElementActions.click(ZoomOut);
		ElementActions.click(ZoomOut);
		log.info("Click On Zoom Out Button");


	}
	public static void ClickonDisplayAnswerList() throws Exception {
		ElementActions.waitForElementVisibilty(DisplayAnswerList);
		ElementActions.click(DisplayAnswerList);
		log.info("Click On Display Answer List");
	}
	public static void LeftArrowClick() throws Exception {
		ElementActions.waitForElementVisibilty(LeftArrow);
		ElementActions.click(LeftArrow);
		Thread.sleep(2000);
		log.info("Click On Left Arrow Button");
	}
	public static void RightArrowClick() throws Exception {
		ElementActions.waitForElementVisibilty(RightArrow);
		ElementActions.click(RightArrow);
		Thread.sleep(2000);
		log.info("Click On RightArrow Button");
	}
	public static void ClickOnAnyQuestionNumber() throws Exception {
		ElementActions.waitForElementVisibilty(ClickonAnyQuestion);
		ElementActions.click(ClickonAnyQuestion);
		Thread.sleep(2000);
		log.info("Click On Any Question Number Button");
	}
	public static void VerifyAnswerdQue() throws Exception {
		ElementActions.waitForElementVisibilty(AnsweredQue);
		ElementActions.isElementPresent(AnsweredQue);
		Thread.sleep(2000);
		
	}
	public static void VerifyUnAnswerdQue() throws Exception {
		ElementActions.waitForElementVisibilty(NotAnsweredQue);
		ElementActions.isElementPresent(NotAnsweredQue);
		Thread.sleep(2000);
	}
	public static void VerifyNotStartedQue() throws Exception {
		ElementActions.waitForElementVisibilty(NotStartedQue);
		ElementActions.isElementPresent(NotStartedQue);
		Thread.sleep(2000);
	}
	public static void VerifyReviewLaterQue() throws Exception {
		ElementActions.waitForElementVisibilty(ReviewLaterQue);
		ElementActions.isElementPresent(ReviewLaterQue);

	}

	public static void CompleteExam() throws Exception {
		for(int i=0;i<99;i++) {
			Thread.sleep(2000);
			ElementActions.click(OptionA);
			Thread.sleep(2000);
			ElementActions.click(NextButton);
			Thread.sleep(3000);
			if(ElementActions.isDisplayed(ErrorMessage)) {
				Thread.sleep(5000);
				ElementActions.click(ErrorMessageNo);
				Thread.sleep(2000);
				ElementActions.click(OptionB);
				Thread.sleep(2000);
				ElementActions.click(NextButton);
			}
			log.info("Give Complete Exam");

		}

	}
	public static void CheckExamTitle() {
		ElementActions.waitForElementVisibilty(ExamTitle);
		ElementActions.isElementPresent(ExamTitle);
		Assert.assertNotEquals(ExamTitle, "CBT試験");
	}	
	public static void CheckExamineesNumber() {
		ElementActions.waitForElementVisibilty(ExamineesNumber);
		ElementActions.isElementPresent(ExamineesNumber);
		Assert.assertNotEquals(ExamineesNumber, "gt0455");
	}
	public static void ClickOnEscNo() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementToBeVisibleAndClick(EscNoButton);
		ElementActions.click(EscNoButton);
	}
	
}

