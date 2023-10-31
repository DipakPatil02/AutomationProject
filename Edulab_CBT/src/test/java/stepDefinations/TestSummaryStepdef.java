package stepDefinations;

import io.cucumber.java.en.Then;

public class TestSummaryStepdef {
	@Then("User Clicks on Click on Return to Exam button")
	public void user_clicks_on_click_on_return_to_exam_button() throws Exception {
	    testCasePages.TestSummaryPage.ReturnToExamClick();
	}
	@Then("User Clicks on Click on End Exam button")
	public void user_clicks_on_click_on_end_exam_button() throws Exception {
		testCasePages.TestSummaryPage.EndExamClick();
	}
	@Then("User Clicks on Question No17")
	public void user_clicks_on_question_no17() throws Exception {
		 testCasePages.TestSummaryPage.ClickonQue17();
	}
	@Then("User Verify TestSummary Page Title")
	public void user_verify_test_summary_page_title() {
	    testCasePages.TestSummaryPage.VerifyTestSummaryPageTitle();
	}
	@Then("Verify Return to Exam button Is Displayed")
	public void verify_return_to_exam_button_is_displayed() throws Exception {
		testCasePages.TestSummaryPage.VerifyReturnToExamIsDisplayed();
	}
	@Then("Verify End Exam button Is Displayed")
	public void verify_end_exam_button_is_displayed() throws Exception {
		testCasePages.TestSummaryPage.VerifyEndExamIsDisplayed();
	}
	@Then("User Checks the answered question status")
	public void user_checks_the_answered_question_status() {
	    testCasePages.TestSummaryPage.AnsweredQues();
	}
	@Then("User checks Unanswered question status")
	public void user_checks_unanswered_question_status() {
	    testCasePages.TestSummaryPage.UnAnsweredQes();
	}
	@Then("User checks Review later question status")
	public void user_checks_review_later_question_status() {
	    testCasePages.TestSummaryPage.ReviewLaterStatus();
	}
	@Then("User checks Not visited question status")
	public void user_checks_not_visited_question_status() {
	   testCasePages.TestSummaryPage.ReviewLaterStatus();
	}



}
