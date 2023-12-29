package stepDefinations;

import io.cucumber.java.en.When;

public class SATestStatusMonitoringPageStepDef {
	@When("User select center from the dropdown")
	public void user_select_center_from_the_dropdown() throws Exception {
	   testCasePages.SATestStatusMonitoringPage.ClicOnDropDown();
	}
	@When("user clicks on the logout button")
	public void user_clicks_on_the_logout_button() throws Exception {
	    testCasePages.SATestStatusMonitoringPage.ClickOnLogOut();
	}
	@When("user clicks on the Show test status button")
	public void user_clicks_on_the_show_test_status_button() throws Exception {
	    testCasePages.SATestStatusMonitoringPage.ClickOnDisplayStatusBtn();
	}
	@When("user clicks on the any indicate button")
	public void user_clicks_on_the_any_indicate_button() throws Exception {
	    testCasePages.SATestStatusMonitoringPage.ClickOnINdicate();
	}
	@When("user clicks on the update button")
	public void user_clicks_on_the_update_button() throws Exception {
	   testCasePages.SATestStatusMonitoringPage.ClickOnUpdate();
	}



}
