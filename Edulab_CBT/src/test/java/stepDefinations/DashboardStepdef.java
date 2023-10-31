package stepDefinations;

import io.cucumber.java.en.Then;
import testCasePages.DashboardPage;


public class DashboardStepdef {
	@Then("User Clicks on Esc button")
	public void user_clicks_on_esc_button() throws Exception {
	    DashboardPage.clickEscbutton();
	}
	@Then("User Clicks On No button")
	public void user_clicks_on_no_button() throws Exception {
		DashboardPage.ClickonNo();
	}
	@Then("User Clicks On Yes button")
	public void user_clicks_on_yes_button() throws Exception {
		DashboardPage.ClickonYes();
	}
	@Then("Click on User name Down Arrow")
	public void click_on_user_name_down_arrow() throws Exception {
		DashboardPage.ClickonUserNameDownArrow();
	}
	@Then("Click on Logout")
	public void click_on_logout() throws Exception {
		DashboardPage.ClickonLogout();
	}
	
	@Then("Verify Go To Exam button is Displayed")
	public void verify_go_to_exam_button_is_displayed() throws Exception {
	   DashboardPage.GotoExamButtonIsDisplayed();
	}
	@Then("User Clicks Username Down Arrow")
	public void user_clicks_username_down_arrow() throws Exception {
		DashboardPage.ClickonUserNameDownArrow();
	}
	@Then("User Clicks on Logout button")
	public void user_cliks_on_logout_button() throws Exception {
		DashboardPage.ClickonLogout();
	}
	@Then("User Clicks on Return To LoginPage")
	public void user_clicks_on_return_to_login_page() throws Exception {
		DashboardPage.ReturnToLoginPage();  
	}
	@Then("User Clicks on Go To Exam button")
	public void user_clicks_on_go_to_exam_button() throws Exception {
		DashboardPage.GotoExamButton();
	}
	@Then("Verify Dashboard Page Title")
	public void verify_dashboard_page_title() {
		DashboardPage.VerifyDashboardPageTitle();
	}
}
