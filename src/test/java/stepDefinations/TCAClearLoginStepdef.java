package stepDefinations;
import io.cucumber.java.en.When;


public class TCAClearLoginStepdef {
	
	@When("User Navigate To New Login Screen")
	public void User_Navigate_To_New_Login_Screen() throws Exception {
		testCasePages.CommonElements.Navigate();
	}
	@When("Admin Clicks On Clear Login")
	public void admin_clicks_on_clear_login() throws Exception {
		testCasePages.TCAClearLoginPage.ClearLoginClick();
	    
	}

}
