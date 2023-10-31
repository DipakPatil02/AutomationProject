package stepDefinations;

import io.cucumber.java.en.Then;
import testCasePages.InstructionPage;

public class InstructionStepdef {
	
	@Then("User Clicks on Next button")
	public void user_clicks_on_next_button() throws Exception {
		InstructionPage.ClickonNextButton();
	}

	@Then("User Clicks on Previous button")
	public void user_clicks_on_previous_button() throws Exception {
		InstructionPage.ClickonPreviousButton();
}
	@Then("User Clicks on GotoTestStartScreenButton")
	public void user_clicks_on_goto_test_start_screen_button() throws Exception {
		InstructionPage.GotoTestStartScreenButton();
	}
	@Then("User Clicks on TestStartbutton")
	public void user_clicks_on_test_startbutton() throws Exception {
	    InstructionPage.startTestButton();
	}
	@Then("Verify Instruction Page Title")
	public void verify_instruction_page_title() throws Exception {
		InstructionPage.VerifyInstructionPageTitle();
	}

}
