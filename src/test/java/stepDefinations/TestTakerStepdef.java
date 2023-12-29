package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testCasePages.TestTakerPage;

public class TestTakerStepdef {
	@When("User Clicks on option")
	public void user_clicks_on_option() throws Exception {
	    testCasePages.TestTakerPage.ClickonOptionA();
	}
	@When("User Clicks On Next button on TestTaker Page")
	public void user_clicks_on_next_button_on_test_taker_page() throws Exception {
		testCasePages.TestTakerPage.ClickonNextButton();
	}
	@When("User Clicks on Return button")
	public void user_clicks_on_return_button() throws Exception {
	    testCasePages.TestTakerPage.ClickonPreviousButton();
	}
	@When("User Clicks on Review Later button")
	public void user_clicks_on_review_later() throws Exception {
	    testCasePages.TestTakerPage.ClickonReviewLater();
	}
	@When("User Clicks On Zoom In button")
	public void user_clicks_on_zoom_in_button() throws Exception {
	    testCasePages.TestTakerPage.ClickonZoomin();
	}
	@When("User Clicks on Zoom Out button")
	public void user_clicks_on_zoom_out_button() throws Exception {
	    testCasePages.TestTakerPage.ClickonZoomout();
	}
	@When("User Clicks on Right Arrow")
	public void user_clicks_on_right_arrow() throws Exception {
		testCasePages.TestTakerPage.RightArrowClick();
	}
	@When("User Clicks on Left Arrow")
	public void user_clicks_on_left_arrow() throws Exception {
		testCasePages.TestTakerPage.LeftArrowClick();
	   
	}
	@When("User Clicks on Hide All button")
	public void user_clicks_on_hide_all_button() throws Exception {
	   testCasePages.TestTakerPage.ClickonHideAll();
	}
	@When("User Clicks on Show All button")
	public void user_clicks_on_show_all_button() throws Exception {
	   testCasePages.TestTakerPage.ClickonShowAll();
	}
	@When("User Clicks on Answer Status Downward Arrow")
	public void user_clicks_on_answer_status_downward_arrow() throws Exception {
	  testCasePages.TestTakerPage.ClickonAnswerStatus();
	}
	@When("User Give Complete Exam")
	public void user_give_complete_exam() throws Exception {
	    testCasePages.TestTakerPage.CompleteExam();
	}
	@When("User Clicks on Display Answer List")
	public void user_clicks_on_display_answer_list() throws Exception {
		testCasePages.TestTakerPage.ClickonDisplayAnswerList();
	}
	@When("User Clicks On Any Question")
	public void user_clicks_on_any_question() throws Exception {
		testCasePages.TestTakerPage.ClickOnAnyQuestionNumber();
	}
	@When("User Verify The Not Started Question")
	public void user_verify_the_not_started_question() throws Exception {
		testCasePages.TestTakerPage.VerifyNotStartedQue();
	    
	}
	@When("User Verify The Review Later Question")
	public void user_verify_the_review_later_question() throws Exception {
		testCasePages.TestTakerPage.VerifyReviewLaterQue();
	  
	}
	@When("User Verify The UnAnswered  Question")
	public void user_verify_the_un_answered_question() throws Exception {
		testCasePages.TestTakerPage.VerifyUnAnswerdQue();
	}
	@When("User Verify The Answered Question")
	public void user_verify_the_answered_question() throws Exception {
		testCasePages.TestTakerPage.VerifyAnswerdQue();
	    
	}
	@When("User Verify Test Taker page Title")
	public void user_verify_test_taker_page_title() {
		TestTakerPage.CheckExamTitle();
	}
	@When("User Checks Examinees number")
	public void user_checks_examinees_number() {
	   TestTakerPage.CheckExamineesNumber();
	   
	}
//	@When("User Clicks On No button")
//	public void User_Clicks_On_No_button() throws Exception {
//	   TestTakerPage.ClickOnEscNo();
//	   
//	}

	}
	
	
