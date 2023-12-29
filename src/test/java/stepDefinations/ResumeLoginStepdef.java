package stepDefinations;

import io.cucumber.java.en.When;

public class ResumeLoginStepdef {
	@When("Validate Error Message")
	public void validate_error_message() throws Exception {
		
	   testCasePages.TCAResumeLoginPage.ValidateErrorMessage();
	}
	@When("Admin Clicks On Resume Login")
	public void admin_clicks_on_resume_login() throws Exception {
		testCasePages.TCAResumeLoginPage.ResumeLoginClick();  
	}
	@When("User Clicks on Resume Test")
	public void user_clicks_on_resume_test() throws Exception {
	    testCasePages.TCAResumeLoginPage.ResumeExam();
	}
	@When("Admin Clicks On Confirm Resume Login")
	public void admin_clicks_on_confirm_resume_login() throws Exception {
		testCasePages.TCAResumeLoginPage.ClickOnConfirmResumeExam();  
	}


}
