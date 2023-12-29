package stepDefinations;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testCasePages.DashboardPage;
import webHandler.WebHandler;


public class DashboardStepdef {
	@When("User Clicks on Esc button")
	public void user_clicks_on_esc_button() throws Exception {
	    DashboardPage.clickEscbutton();
	    Thread.sleep(2000);
	}
	@When("User Clicks On No button")
	public void user_clicks_on_no_button() throws Exception {
		DashboardPage.ClickonNo();
	}
	@When("User Clicks On Yes button")
	public void user_clicks_on_yes_button() throws Exception {
		Thread.sleep(2000);
		DashboardPage.ClickonYes();
	}
	@When("Click on User name Down Arrow")
	public void click_on_user_name_down_arrow() throws Exception {
		DashboardPage.ClickonUserNameDownArrow();
	}
	@When("Click on Logout")
	public void click_on_logout() throws Exception {
		DashboardPage.ClickonLogout();
	}
	
	@When("Verify Go To Exam button is Displayed")
	public void verify_go_to_exam_button_is_displayed() throws Exception {
	   DashboardPage.GotoExamButtonIsDisplayed();
	}
	@When("User Clicks Username Down Arrow")
	public void user_clicks_username_down_arrow() throws Exception {
		DashboardPage.ClickonUserNameDownArrow();
	}
	@When("User Clicks on Logout button")
	public void user_cliks_on_logout_button() throws Exception {
		DashboardPage.ClickonLogout();
	}
	@When("User Clicks on Return To LoginPage")
	public void user_clicks_on_return_to_login_page() throws Exception {
		DashboardPage.ReturnToLoginPage();  
	}
	@When("User Clicks on Go To Exam button")
	public void user_clicks_on_go_to_exam_button() throws Exception {
		DashboardPage.GotoExamButton();
	}
	@When("Verify Dashboard Page Title")
	public void verify_dashboard_page_title() {
		DashboardPage.VerifyDashboardPageTitle();
	}
	@When("User Verify Username Down Arrow")
	public void user_verify_username_down_arrow() throws Exception {
		DashboardPage.UserNameDropDownIsDisplayed();
	}
	@When("User check the Exam logo")
	public void user_check_the_exam_logo() throws Exception {
	   DashboardPage.examLogoCheck();
	}

	@When("User Checks the timer")
	public void user_checks_the_timer() throws Exception {
	   DashboardPage.timerCheck();
	}
	@When("User Checks the number of questions")
	public void user_checks_the_number_of_questions() throws Exception {
	   DashboardPage.questionCheck();
	}
	@When("User Checks Username")
	public void user_checks_username() {
	    DashboardPage.UsernameCheck();
	}
	
	
}
