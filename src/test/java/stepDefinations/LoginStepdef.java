package stepDefinations;




	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import io.cucumber.java.en.Then;
import testCasePages.LoginPage;


	public class LoginStepdef {
		private static Logger log = LogManager.getLogger(LoginStepdef.class.getName());
		@Then("User Enter valid Username {string}")
		public void user_enter_valid_username(String Uname) {
			testCasePages.LoginPage.EnterUsername(Uname);
			log.info("User Enters Invalid Username");
		}

		@Then("User Enters valid Password {string}")
		public void user_enters_valid_password(String Pwd) {
			testCasePages.LoginPage.EnterPasword(Pwd);
			log.info("User Enters Valid Password");
		}
		
		@Then("User Enter Invalid Username {string}")
		public void user_enter_invalid_username(String InvalidUname) {
			testCasePages.LoginPage.EnterUsername(InvalidUname);
			log.info("User Enters Inavlid Username");
		}
		@Then("User Enters Invalid Password {string}")
		public void user_enters_invalid_password(String InvalidPass) {
			testCasePages.LoginPage.EnterPasword(InvalidPass);
			log.info("User Enters Invalid Password");
		   
		}
		@Then("User Enters Blank Username {string}")
		public void user_enters_blank_username(String UnameBlank) {
			testCasePages.LoginPage.EnterUsername(UnameBlank);
			log.info("User Enters Blank Username");
		}
		@Then("User Enters valid Username {string}")
		public void user_enters_valid_username(String Username) {
			testCasePages.LoginPage.EnterUsername(Username);
			log.info("User Enters Valid Username");
		}
		@Then("User Enters blank Password {string}")
		public void user_enters_blank_password(String Pass) {
			testCasePages.LoginPage.EnterPasword(Pass);
			log.info("User Enters Blank Password");
		}
		
		@Then("User Enters invalid Username {string}")
		public void user_enters_invalid_username(String InvalidUname) {
			testCasePages.LoginPage.EnterUsername(InvalidUname);
			log.info("User Enters InValid Username");
		}
		@Then("User Enters invalid Password {string} in Password Field")
		public void user_enters_invalid_password_in_password_field(String InvalidPassword) {
			testCasePages.LoginPage.EnterPasword(InvalidPassword);
			log.info("User Enters InValid Password");
		}
		@Then("User Enter AlphaNumericUsername Username {string} and AlphaNumericUsername Password {string}")
		public void user_enter_alpha_numeric_username_username_and_alpha_numeric_username_password(String Auname, String Apwd) {
			testCasePages.LoginPage.EnterUsername(Auname);
			testCasePages.LoginPage.EnterPasword(Apwd);
			
		}
		@Then("User Enter Numeric Username {string} and Numeric Password {string}")
		public void user_enter_numeric_username_and_numeric_password(String Nuname, String Npwd) {
		    testCasePages.LoginPage.EnterUsername(Nuname);
		    testCasePages.LoginPage.EnterPasword(Npwd);
		}
		@Then("User Enter blank Username {string} and Blank Password {string}")
		public void user_enter_blank_username_and_blank_password(String Buname, String Bpwd) {
			testCasePages.LoginPage.EnterUsername(Buname);
			testCasePages.LoginPage.EnterPasword(Bpwd);
		  
		}
		@Then("User Enter Valid username as {string}")
		public void user_enter_valid_username_as(String Uname) {
			testCasePages.LoginPage.EnterUsername(Uname);
		}
		@Then("User Enters Blank Password as {string}")
		public void user_enters_blank_password_as(String Pwd) {
			testCasePages.LoginPage.EnterPasword(Pwd);
		    
		}
		@Then("Login Page Url")
		public void login_page_url() throws Exception {
		   testCasePages.LoginPage.VerifyLogingPageUrl();
		}
		@Then("Verify Login Page Title")
		public void verify_login_page_title() throws Exception {
			testCasePages.LoginPage.VerifyLogingPageTitle();
		}
		@Then("User Clicks On EyeButton")
		public void user_clicks_on_eye_button() throws Exception {
			testCasePages.LoginPage.ClickonEyeButton();
		}



	}



