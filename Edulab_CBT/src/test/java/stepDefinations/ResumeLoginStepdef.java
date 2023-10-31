package stepDefinations;

import io.cucumber.java.en.Then;

public class ResumeLoginStepdef {
	@Then("Validate Error Message")
	public void validate_error_message() throws Exception {
	   testCasePages.TCAResumeLoginPage.ValidateErrorMessage();
	}
	@Then("Admin Clicks On Resume Login")
	public void admin_clicks_on_resume_login() throws Exception {
		testCasePages.TCAResumeLoginPage.ResumeLoginClick();  
	}
	@Then("User Clicks on Resume Test")
	public void user_clicks_on_resume_test() throws Exception {
	    testCasePages.TCAResumeLoginPage.ResumeExam();
	}


}
