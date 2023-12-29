package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testCasePages.TestSummaryPage;

public class TestSummaryStepdef {
	@When("User Clicks on Click on Return to Exam button")
	public void user_clicks_on_click_on_return_to_exam_button() throws Exception {
	    testCasePages.TestSummaryPage.ReturnToExamClick();
	}
	@When("User Clicks on Click on End Exam button")
	public void user_clicks_on_click_on_end_exam_button() throws Exception {
		testCasePages.TestSummaryPage.EndExamClick();
	}
	@When("User Clicks on Question No17")
	public void user_clicks_on_question_no17() throws Exception {
		 testCasePages.TestSummaryPage.ClickonQue17();
	}
	@When("User Verify TestSummary Page Title")
	public void user_verify_test_summary_page_title() {
	    testCasePages.TestSummaryPage.VerifyTestSummaryPageTitle();
	}
	@When("Verify Return to Exam button Is Displayed")
	public void verify_return_to_exam_button_is_displayed() throws Exception {
		testCasePages.TestSummaryPage.VerifyReturnToExamIsDisplayed();
	}
	@When("Verify End Exam button Is Displayed")
	public void verify_end_exam_button_is_displayed() throws Exception {
		testCasePages.TestSummaryPage.VerifyEndExamIsDisplayed();
	}
	@When("User Checks the answered question status")
	public void user_checks_the_answered_question_status() {
	    testCasePages.TestSummaryPage.AnsweredQues();
	}
	@When("User checks Unanswered question status")
	public void user_checks_unanswered_question_status() {
	    testCasePages.TestSummaryPage.UnAnsweredQes();
	}
	@When("User checks Review later question status")
	public void user_checks_review_later_question_status() {
	    testCasePages.TestSummaryPage.ReviewLaterStatus();
	}
	@When("User checks Not visited question status")
	public void user_checks_not_visited_question_status() {
	   testCasePages.TestSummaryPage.ReviewLaterStatus();
	}
	@When("User Clicks On No")
	public void user_clicks_on_no() throws Exception {
		Thread.sleep(2000);
		testCasePages.TestSummaryPage.ClickonNo();
		Thread.sleep(2000);
	}
	@When("User Verify Question Status is displayed")
	public void User_Verify_Question_Status_is_displayed() {
	   testCasePages.TestSummaryPage.CheckQuestionStatus();
	}
	@When("User Clicks on Close popUp")
	public void User_Clicks_on_Close_popUp() throws Exception {
		Thread.sleep(2000);
	   testCasePages.TestSummaryPage.ClickOnClosePopUp();
	}
	
}
