package stepDefinations;

import io.cucumber.java.en.Then;

public class TestCompletePageStepDef {
	@Then("User Clicks on End test")
	public void user_clicks_on_end_test() throws Exception {
		testCasePages.CBTTestCompletePage.ClickOnEndTest();
	}
	@Then("User Clicks on Yes in popup")
	public void user_clicks_on_yes_in_popup() throws Exception {
	    testCasePages.CBTTestCompletePage.ClickOnYes();
	}
	@Then("User Checks Submit Check")
	public void user_checks_submit_check() {
	    testCasePages.CBTTestCompletePage.CheckSubmitCheck();
	}
	@Then("User Check submit message")
	public void user_check_submit_message() {
	    testCasePages.CBTTestCompletePage.CheckSubmitMsg();
	}
	@Then("User Check Answer sent message")
	public void user_check_answer_sent_message() {
	    testCasePages.CBTTestCompletePage.CheckAnswerSentMsg();
	}


}
