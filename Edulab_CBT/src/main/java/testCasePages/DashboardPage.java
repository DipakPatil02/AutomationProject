package testCasePages;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import assertions.Assertions;
import webHandler.WebHandler;
public class DashboardPage {

	private static Logger log = LogManager.getLogger(DashboardPage.class.getName());
	public static By yesButton = By.xpath("//button[contains(@class,'button button--bg-grey button')]");
	public static By NoButton = By.xpath("(//button[contains(@class,'button button--bg-blue button')])[2]");
	public static By UsernameDownArrow = By.xpath("//div[@class='header__user-name']");
	public static By Logout = By.xpath("//div[@class='dropdown-menu__item']");
	public static By GotoExamButton=By.xpath("//span[text()='受験説明ページにいく']");
	public static By ReturnToLoginPage=By.xpath("//a[@href='#/auth/login']");
	
	public static void clickEscbutton() throws Exception {
		WebHandler.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //    Thread.sleep(2000);
		Robot r= new Robot();
	//	Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
	}
	public static void ClickonYes() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(yesButton);
		elementActions.ElementActions.click(yesButton);
	}
	public static void ClickonNo() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(NoButton);
		elementActions.ElementActions.click(NoButton);
	}
	public static void ClickonUserNameDownArrow() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(UsernameDownArrow);
		elementActions.ElementActions.click(UsernameDownArrow);
	}
	public static void ClickonLogout() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(Logout);
		elementActions.ElementActions.click(Logout);
	}
	public static void GotoExamButtonIsDisplayed() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(GotoExamButton);
		elementActions.ElementActions.isElementPresent(GotoExamButton);
	}
	public static void ReturnToLoginPage() throws Exception {
		Thread.sleep(2000);
		elementActions.ElementActions.click(ReturnToLoginPage);	
	}
	public static void GotoExamButton() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(GotoExamButton);
		elementActions.ElementActions.click(GotoExamButton);
	}
	public static void VerifyDashboardPageTitle() {
	String Actual = WebHandler.driver.getTitle();
	String Expected="CBT";
	Assert.assertEquals(Actual, Expected);
	log.info("Verify Dashboard Page Title");
	}
}
