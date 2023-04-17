//package StepDefinations.superadmin;
//
//import org.openqa.selenium.WebDriver;
//
//import AutomationTrialQA2_copy.BaseBrowser;
//import AutomationTrialQA2_multilogin.OpenBrowser;
//import AutomationTrialQA2_superadminlogin.SuperAdminLogin;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class Superadminlogin extends BaseBrowser {
//
//    SuperAdminLogin SA=new SuperAdminLogin();
//	
//	public static WebDriver driver = null;
//	
//	
//	@Given("Browser is started")
//	public void browser_is_started() throws InterruptedException {
//	    SA.startBrowser1();
//	}
//
//
//	@Then("CBT URL is hit")
//	public void cbt_url_is_hit() throws InterruptedException {
//	    
//		SA.hitCBTURL();
//		// Write code here that turns the phrase above into concrete actions
//	    
//	}
//	@When("^User enters username (.*) and password (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		SA.login1(username, password);
//	    
//	}
//
//	@Then("Click on login button")
//	public void click_on_login_button() {
//	    
//	}
//	
//	@Then("User logged in to super admin module homepage with title {string}")
//	public void user_logged_in_to_super_admin_module_homepage_with_title(String string) throws InterruptedException {
//	    SA.checkhomepage(string);
//	}
//
//	
//	@Then("I click on admin Logout button")
//	public void i_click_on_admin_logout_button() {
//		SA.Logout();
//	}
//}
