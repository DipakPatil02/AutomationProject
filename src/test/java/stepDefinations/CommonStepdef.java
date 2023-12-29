package stepDefinations;

import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Utils.ExcelReader;
import elementActions.ElementActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testCasePages.CommonElements;
import testCasePages.DashboardPage;
import webHandler.WebHandler;

public class CommonStepdef {
	private static Logger log = LogManager.getLogger(CommonStepdef.class.getName());
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws Exception {
		if (ElementActions.isDisplayed(CommonElements.UsernameDownArrow)) {
			CommonElements.UsernameDownArrow();
			CommonElements.Logout();
			Thread.sleep(2000);
			CommonElements.ReturnToLoginPage();
			Thread.sleep(2000);
		}
		String appUrlValue=null;
		List<Map<String, String>> values = ExcelReader.readApplicationSheetFromExcel();
		for(Map<String, String> map : values) {
			if (map.containsKey("env") && map.get("env").equals(Hooks.enviornment)) {
				appUrlValue = map.get("appurl");
				log.info("Value of 'appurl': " + appUrlValue);
				log.info("Opening browser");
				break;
			
			}
		}
		WebHandler.driver.get(appUrlValue);
	}
	@Then("User Clicks On Login button")
	public void User_Clicks_On_Login_button() throws Exception {
		testCasePages.LoginPage.ClickonLoginButton();
		
	}
	@Then("Admin is on admin Screen")
	public void admin_is_on_admin_screen() throws Exception {
		testCasePages.CommonElements.Navigate();
	}
	@Then("Admin Enter valid Username and Password")
	public void admin_enter_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) throws Exception {
	    List<Map<String, String>> map = dataTable.asMaps(String.class,String.class);
	    String Username =map.get(0).get("Username");
	    String Password =map.get(0).get("Password");
		testCasePages.CommonElements.AdminLogin(Username, Password);
	}
	@Then("Admin Clicks On Login button")
	public void admin_clicks_on_login_button() throws Exception {
		testCasePages.CommonElements.AdminLoginButton();
	}
	@Then("Admin Clicks On Logout button")
	public void admin_clicks_on_logout_button() throws Exception {
	   testCasePages.CommonElements.AdminLogoutButton();
	}

}
