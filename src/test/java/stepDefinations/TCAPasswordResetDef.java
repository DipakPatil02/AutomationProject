package stepDefinations;

import io.cucumber.java.en.When;
import testCasePages.TCAPasswordReset;

public class TCAPasswordResetDef {
	@When("Admin Clicks on Reset Password")
	public void admin_clicks_on_reset_password() throws Exception {
	   TCAPasswordReset.ClickOnResetPass();
	}

	@When("Admin Clicks On Examinee Number")
	public void admin_clicks_on_examinee_number() throws Exception {
	    TCAPasswordReset.ClickOnExamineeNumber();
	}

	@When("Admin Enters Examinee Number in Input Field")
	public void admin_enters_examinee_number_in_input_field() throws Exception {
	    TCAPasswordReset.InputField();
	}

	@When("Admin Enters New password in the box")
	public void admin_enters_new_password_in_the_box() throws Exception {
	    TCAPasswordReset.EnterNewPasswd();
	}

	@When("Admin clicks on reset password btn")
	public void admin_clicks_on_reset_password_btn() throws Exception {
	   TCAPasswordReset.ClickOnPasswdResetBtn();
	   
	}
	@When("Admin Clicks on search btn")
	public void Admin_Clicks_on_search_btn() throws Exception {
	    TCAPasswordReset.clickOnsearch();
	}
	@When("Admin Clicks on No btn")
	public void Admin_Clicks_on_No_btn() throws Exception {
	    TCAPasswordReset.ClickResetNo();
	}
}
