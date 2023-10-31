package stepDefinations;

import io.cucumber.java.en.Then;

public class TestTakerStepdef {
	@Then("User Clicks on option")
	public void user_clicks_on_option() throws Exception {
	    testCasePages.TestTakerPage.ClickonOptionA();
	}
	@Then("User Clicks On Next button on TestTaker Page")
	public void user_clicks_on_next_button_on_test_taker_page() throws Exception {
		testCasePages.TestTakerPage.ClickonNextButton();
	}
	@Then("User Clicks on Return button")
	public void user_clicks_on_return_button() throws Exception {
	    testCasePages.TestTakerPage.ClickonPreviousButton();
	}
	@Then("User Clicks on Review Later button")
	public void user_clicks_on_review_later() throws Exception {
	    testCasePages.TestTakerPage.ClickonReviewLater();
	}
	@Then("User Clicks On Zoom In button")
	public void user_clicks_on_zoom_in_button() throws Exception {
	    testCasePages.TestTakerPage.ClickonZoomin();
	}
	@Then("User Clicks on Zoom Out button")
	public void user_clicks_on_zoom_out_button() throws Exception {
	    testCasePages.TestTakerPage.ClickonZoomout();
	}
	@Then("User Clicks on Right Arrow")
	public void user_clicks_on_right_arrow() throws Exception {
		testCasePages.TestTakerPage.RightArrowClick();
	}
	@Then("User Clicks on Left Arrow")
	public void user_clicks_on_left_arrow() throws Exception {
		testCasePages.TestTakerPage.LeftArrowClick();
	   
	}
	@Then("User Clicks on Hide All button")
	public void user_clicks_on_hide_all_button() throws Exception {
	   testCasePages.TestTakerPage.ClickonHideAll();
	}
	@Then("User Clicks on Show All button")
	public void user_clicks_on_show_all_button() throws Exception {
	   testCasePages.TestTakerPage.ClickonShowAll();
	}
	@Then("User Clicks on Answer Status Downward Arrow")
	public void user_clicks_on_answer_status_downward_arrow() throws Exception {
	  testCasePages.TestTakerPage.ClickonAnswerStatus();
	}
	@Then("User Give Complete Exam")
	public void user_give_complete_exam() throws Exception {
	    testCasePages.TestTakerPage.CompleteExam();
	}
	@Then("User Clicks on Display Answer List")
	public void user_clicks_on_display_answer_list() throws Exception {
		testCasePages.TestTakerPage.ClickonDisplayAnswerList();
	}
	@Then("User Clicks On Any Question")
	public void user_clicks_on_any_question() throws Exception {
		testCasePages.TestTakerPage.ClickOnAnyQuestionNumber();
	}
	@Then("User Verify The Not Started Question")
	public void user_verify_the_not_started_question() throws Exception {
		testCasePages.TestTakerPage.VerifyNotStartedQue();
	    
	}
	@Then("User Verify The Review Later Question")
	public void user_verify_the_review_later_question() throws Exception {
		testCasePages.TestTakerPage.VerifyReviewLaterQue();
	  
	}
	@Then("User Verify The UnAnswered  Question")
	public void user_verify_the_un_answered_question() throws Exception {
		testCasePages.TestTakerPage.VerifyUnAnswerdQue();
	}
	@Then("User Verify The Answered Question")
	public void user_verify_the_answered_question() throws Exception {
		testCasePages.TestTakerPage.VerifyAnswerdQue();
	    
	}

	}
	
	
