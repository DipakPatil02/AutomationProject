package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamResetStepdef {
	@When("Admin Clicks On Exam Reset")
	public void admin_clicks_on_exam_reset() throws Exception {
	    testCasePages.SAResetExamPage.ExamResetClick();
	}
	@When("Admin Clicks On Examinees Number")
	public void admin_clicks_on_examinees_number() throws Exception {
		testCasePages.SAResetExamPage.ExamineesNumberSearch();
	   
	}
	@When("Admin Enters Examiness Number in Input Field")
	public void admin_enters_examiness_number_in_input_field() throws Exception {
		testCasePages.SAResetExamPage.ExamineesInputField();
	  
	}
	@When("Admin Clicks On Search")
	public void admin_clicks_on_search() throws Exception {
		testCasePages.SAResetExamPage.ExamineesSearchButton();
	}
	@When("Admin Clicks On Radio button")
	public void admin_clicks_on_radio_button() throws Exception {
		testCasePages.SAResetExamPage.RadioButton();
	}
	@When("Admin Clicks on Choice button")
	public void admin_clicks_on_choice_button() throws Exception {
		testCasePages.SAResetExamPage.ChoiceButton();
	    
	}
	@When("Admin Clicks on Reset button")
	public void admin_clicks_on_reset_button() throws Exception {
		testCasePages.SAResetExamPage.ResetExam();
	   
	}
	@When("Admin Clicks on Yes")
	public void amin_clicks_on_yes() throws Exception {
		Thread.sleep(2000);
		testCasePages.SAResetExamPage.ResetExamYes();
	   
	}

}


