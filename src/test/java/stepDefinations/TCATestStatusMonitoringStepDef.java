package stepDefinations;

import io.cucumber.java.en.When;

public class TCATestStatusMonitoringStepDef {
	
	@When("User clicks on the Test status monitoring button")
	public void user_clicks_on_the_test_status_monitoring_button() throws Exception {
	   testCasePages.TCATestStatusMonitoringPage.ClickOnStatusBTN();
	}
	@When("User checks page visbility")
	public void user_checks_page_visbility() {
	   testCasePages.TCATestStatusMonitoringPage.CheckLogo();
	}
	@When("User clicks on the Show test status monitoring button")
	public void user_clicks_on_the_show_test_status_monitoring_button() throws Exception {
	    testCasePages.TCATestStatusMonitoringPage.ClickOnShowTestStaus();
	}
	@When("User Verify the Value in Venue Selection")
	public void user_verify_the_value_in_venue_selection() throws Exception {
		 testCasePages.TCATestStatusMonitoringPage.VenueSelectionDropdown();
	}
	@When("User Clicks on Display Answer Status")
	public void user_clicks_on_display_answer_status() throws Exception {
		Thread.sleep(2000);
		testCasePages.TCATestStatusMonitoringPage.DisplayAnswerStatusClick();
	}
	@When("User Clicks on Update button")
	public void user_clicks_on_update_button() throws Exception {
		testCasePages.TCATestStatusMonitoringPage.UpdateButtonClick();
	}
	@When("User Clicks on Leave button")
	public void user_clicks_on_leave_button() throws Exception {
		testCasePages.TCATestStatusMonitoringPage.LeaveButtonClick();
	}
	@When("User Clicks On Leave button Yes In PopUp")
	public void user_clicks_on_leave_button_yes_in_pop_up() throws Exception {
		testCasePages.TCATestStatusMonitoringPage.YesButtonClick();
	}
	@When("User Checks the UI of the Page")
	public void user_checks_the_ui_of_the_page() {
	}
	@When("User Clicks On Left button")
	public void user_clicks_on_left_button() throws Exception {
		testCasePages.TCATestStatusMonitoringPage.LeaveButtonClick(); 
	}
	@When("User Clicks On Left button Yes In PopUp")
	public void user_clicks_on_left_button_yes_in_pop_up() throws Exception {
		testCasePages.TCATestStatusMonitoringPage.YesButtonClick();
	}
	
}


