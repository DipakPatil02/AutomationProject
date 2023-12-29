package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCompletePageStepDef {
	@When("User Clicks on End test")
	public void user_clicks_on_end_test() throws Exception {
		testCasePages.TestCompletePage.ClickOnEndTest();
	}
	@When("User Clicks on Yes in popup")
	public void user_clicks_on_yes_in_popup() throws Exception {
	    testCasePages.TestCompletePage.ClickOnYes();
	}
	@When("User Checks Submit Check")
	public void user_checks_submit_check() {
	    testCasePages.TestCompletePage.CheckSubmitCheck();
	}
	@When("User Check submit message")
	public void user_check_submit_message() {
	    testCasePages.TestCompletePage.CheckSubmitMsg();
	}
	@When("User Check Answer sent message")
	public void user_check_answer_sent_message() {
	    testCasePages.TestCompletePage.CheckAnswerSentMsg();
	}


}
