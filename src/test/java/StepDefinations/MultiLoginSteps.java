//package StepDefinations;
//import org.openqa.selenium.WebDriver;
//import AutomationTrialQA2_copy.BaseBrowser;
//import AutomationTrialQA2_multilogin.OpenBrowser;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;

//public class MultiLoginSteps extends BaseBrowser {
//	OpenBrowser OB=new OpenBrowser();
//	public static WebDriver driver = null;
//	@Given("Browser  is started")
//	public void browser_is_started() throws InterruptedException {
//		OB.startBrowser1();
//	}
//	@Then("^Data is cleared with (.*)$")
//	public void data_is_cleared(String clearurl) throws Throwable {
//	    		OB.clearData(clearurl);
//	}
//	@Then("CBT URL is hit")
//	public void cbt_url_is_hit() throws InterruptedException {	    
//		OB.hitCBTURL();	    
//	}
//	@Then("Go through instructions")
//	public void go_through_instructions() throws InterruptedException {
//	    OB.gothroughInstructions();    
//	}
//	@Then("Logout")
//	public void logout() throws InterruptedException {
//		OB.logout();	    
//	}
//	@Then("^Enter username as (.*) and password as (.*) and Click on Login1$")
//	public void enter_username_as_username_and_password_as_password_and_click_on_login1(String Username,String Password) throws InterruptedException {
//	    OB.login1(Username, Password);
//	}
//	@Then("Take Exam")
//	public void take_exam() throws InterruptedException {
//	    OB.startexam();   
//	}
//		}

