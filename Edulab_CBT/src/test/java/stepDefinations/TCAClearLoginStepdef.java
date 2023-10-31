package stepDefinations;
import io.cucumber.java.en.Then;


public class TCAClearLoginStepdef {
	
	@Then("User Navigate To New Login Screen")
	public void User_Navigate_To_New_Login_Screen() throws Exception {
		testCasePages.CommonElements.Navigate();
	}
	@Then("Admin Clicks On Clear Login")
	public void admin_clicks_on_clear_login() throws Exception {
		testCasePages.TCAClearLoginPage.ClearLoginClick();
	    
	}

}
