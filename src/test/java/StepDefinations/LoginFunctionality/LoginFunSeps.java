package StepDefinations.LoginFunctionality;




import org.openqa.selenium.WebDriver;

import AutomationTrialQA2_copy.BaseBrowser;
import AutomationTrialQA2_loginfun.LoginFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class LoginFunSeps extends BaseBrowser {
	
	LoginFun OB=new LoginFun();
	
	public static WebDriver driver = null;
	
	@Given("Browser  is started")
	public void browser_is_started() throws InterruptedException {
		OB.startBrowser1();

	}
	@Then("^Data is cleared with (.*)$")
	public void data_is_cleared(String clearurl) throws Throwable {
	    		OB.clearData(clearurl);
		// Write code here that turns the phrase above into concrete actions

	}
	@Then("CBT URL is hit")
	public void cbt_url_is_hit() throws InterruptedException {
	    
		OB.hitCBTURL();
		// Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("Go through instructions")
	public void go_through_instructions() throws InterruptedException {
	    OB.gothroughInstructions();
		// Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("Logout")
	public void logout() throws InterruptedException {
		OB.logout();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("^Enter username as (.*) and password as (.*) and Click on Login1$")
	public void enter_username_as_username_and_password_as_password_and_click_on_login1(String Username,String Password) throws InterruptedException {
	    OB.login1(Username, Password);
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Take Exam")
	public void take_exam() throws InterruptedException {
	    OB.startexam1();
	    
	    
	}
	

		}








