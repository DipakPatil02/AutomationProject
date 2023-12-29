package stepDefinations;




	import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class LoginStepdef {
		private static Logger log = LogManager.getLogger(LoginStepdef.class.getName());
		@When("User Enter valid Username {string}")
		public void user_enter_valid_username(String Uname) {
			testCasePages.LoginPage.EnterUsername(Uname);
			log.info("User Enters Invalid Username");
		}

		@When("User Enters valid Password {string}")
		public void user_enters_valid_password(String Pwd) {
			testCasePages.LoginPage.EnterPasword(Pwd);
			log.info("User Enters Valid Password");
		}
		
		@When("User Enter Invalid Username {string}")
		public void user_enter_invalid_username(String InvalidUname) {
			testCasePages.LoginPage.EnterUsername(InvalidUname);
			log.info("User Enters Inavlid Username");
		}
		@When("User Enters Invalid Password {string}")
		public void user_enters_invalid_password(String InvalidPass) {
			testCasePages.LoginPage.EnterPasword(InvalidPass);
			log.info("User Enters Invalid Password");
		   
		}
		@When("User Enters Blank Username {string}")
		public void user_enters_blank_username(String UnameBlank) {
			testCasePages.LoginPage.EnterUsername(UnameBlank);
			log.info("User Enters Blank Username");
		}
		@When("User Enters valid Username {string}")
		public void user_enters_valid_username(String Username) {
			testCasePages.LoginPage.EnterUsername(Username);
			log.info("User Enters Valid Username");
		}
		@When("User Enters blank Password {string}")
		public void user_enters_blank_password(String Pass) {
			testCasePages.LoginPage.EnterPasword(Pass);
			log.info("User Enters Blank Password");
		}
		
		@When("User Enters invalid Username {string}")
		public void user_enters_invalid_username(String InvalidUname) {
			testCasePages.LoginPage.EnterUsername(InvalidUname);
			log.info("User Enters InValid Username");
		}
		@When("User Enters invalid Password {string} in Password Field")
		public void user_enters_invalid_password_in_password_field(String InvalidPassword) {
			testCasePages.LoginPage.EnterPasword(InvalidPassword);
			log.info("User Enters InValid Password");
		}
		@Then("User Enter AlphaNumericUsername Username {string} and AlphaNumericUsername Password {string}")
		public void user_enter_alpha_numeric_username_username_and_alpha_numeric_username_password(String Auname, String Apwd) {
			testCasePages.LoginPage.EnterUsername(Auname);
			testCasePages.LoginPage.EnterPasword(Apwd);
			
		}
		@When("User Enter Numeric Username {string} and Numeric Password {string}")
		public void user_enter_numeric_username_and_numeric_password(String Nuname, String Npwd) {
		    testCasePages.LoginPage.EnterUsername(Nuname);
		    testCasePages.LoginPage.EnterPasword(Npwd);
		}
		@When("User Enter blank Username {string} and Blank Password {string}")
		public void user_enter_blank_username_and_blank_password(String Buname, String Bpwd) {
			testCasePages.LoginPage.EnterUsername(Buname);
			testCasePages.LoginPage.EnterPasword(Bpwd);
		  
		}
		@When("User Enter Valid username as {string}")
		public void user_enter_valid_username_as(String Uname) {
			testCasePages.LoginPage.EnterUsername(Uname);
		}
		@When("User Enters Blank Password as {string}")
		public void user_enters_blank_password_as(String Pwd) {
			testCasePages.LoginPage.EnterPasword(Pwd);
		    
		}
		@When("Login Page Url")
		public void login_page_url() throws Exception {
		   testCasePages.LoginPage.VerifyLogingPageUrl();
		}
		@Then("Verify Login Page Title")
		public void verify_login_page_title() throws Exception {
			testCasePages.LoginPage.CheckLoginPageTitle();
		}
		@When("User Clicks On EyeButton")
		public void user_clicks_on_eye_button() throws Exception {
			testCasePages.LoginPage.ClickonEyeButton();
		}
		@Then("user check error message")
		public void user_check_error_message() throws Exception{
		testCasePages.LoginPage.checkalreadylogin();
		}
		@Then("Verify User ID message")
		public void verify_user_id_message() {
		    testCasePages.LoginPage.CheckEidMessage();
		}
		@Then("Verify Password message")
		public void verify_password_message() {
		   testCasePages.LoginPage.CheckPwdMessage();
		}

	}



