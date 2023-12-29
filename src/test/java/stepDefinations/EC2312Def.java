package stepDefinations;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;
import testCasePages.DashboardPage;
import webHandler.WebHandler;

public class EC2312Def {

	@When("User Clicks any button")
	public void user_clicks_any_button() throws Exception {
	    testCasePages.EC2312.clickEnterbutton();
	}
	@When("User checks if the timeout popup is present")
	public void user_checks_if_the_timeout_popup_is_present() throws Exception {
	   testCasePages.EC2312.PopupNotpresent();
	}
	@When("User Clicks on Resume Exam")
	public void user_cliks_on_resume_exam() throws Exception {
		DashboardPage.ClickOnResumeExam();
	}
	@When("user Checks status for user1")
	public void user_checks_status_for_user1() throws Exception {
	   testCasePages.EC2312.CheckUserStatus1();
	}
	@When("user Checks status for user2")
	public void user_checks_status_for_user2() throws Exception {
	   testCasePages.EC2312.CheckUserStatus2();
	}
	@When("User waits for the timeUp Popup")
	public void user_waits_for_the_time_up_popup() throws Exception {
		testCasePages.EC2312.CheckPopup();
	}
	@When("Admin enters minutes")
	public void admin_enters_minutes() throws Exception {
		testCasePages.TCAResumeLoginPage.TimerMinutesInput();
	}
	@When("Admin enters seconds")
	public void admin_enters_seconds() throws Exception {
		testCasePages.TCAResumeLoginPage.TimerSecondsInput();
	}
	@When("Admin Clicks on Minutes Adjustment")
	public void admin_clicks_on_minutes_adjustment() throws Exception {
		testCasePages.TCAResumeLoginPage.ClickOnTimerMinutesInputField();
	}
	@When("Admin Clicks on Seconds Adjustment")
	public void admin_clicks_on_seconds_adjustment() throws Exception {
		testCasePages.TCAResumeLoginPage.ClickOnTimerSecondsInput();
	}
	@When("Admin Enters Examinee1 Number in Input Field")
	public void admin_enters_examinee1_number_in_input_field() throws Exception {
		testCasePages.TCAResumeLoginPage.ExamineesInputField1();
	  
	}
	@When("Admin Enters Examinee2 Number in Input Field")
	public void admin_enters_examinee2_number_in_input_field() throws Exception {
		testCasePages.TCAResumeLoginPage.ExamineesInputField2();
	  
	}
	@When("User Clicks on Escape button")
	public void user_clicks_on_escape_button() throws Exception {
	    DashboardPage.clickEscbutton();
	    Thread.sleep(2000);
	}
	
}
