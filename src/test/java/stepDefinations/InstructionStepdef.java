package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testCasePages.InstructionPage;

public class InstructionStepdef {
	
	@When("User Clicks on Next button")
	public void user_clicks_on_next_button() throws Exception {
		InstructionPage.ClickonNextButton();
	}

	@When("User Clicks on Previous button")
	public void user_clicks_on_previous_button() throws Exception {
		Thread.sleep(2000);
		InstructionPage.ClickonPreviousButton();
		
}
	@When("User Clicks on GotoTestStartScreenButton")
	public void user_clicks_on_goto_test_start_screen_button() throws Exception {
		InstructionPage.GotoTestStartScreenButton();
	}
	@When("User Clicks on TestStartbutton")
	public void user_clicks_on_test_startbutton() throws Exception {
	    InstructionPage.startTestButton();
	}
	@When("Verify Instruction Page Title")
	public void verify_instruction_page_title() throws Exception {
		InstructionPage.VerifyInstructionPageTitle();
	}
	@When("User checks Username on the instruction page")
	public void user_checks_username_on_the_instruction_page() {
	    InstructionPage.CheckIPUsername();
	}

}
