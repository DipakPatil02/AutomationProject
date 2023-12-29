package testCasePages;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import elementActions.ElementActions;
import webHandler.WebHandler;
public class DashboardPage {

	private static Logger log = LogManager.getLogger(DashboardPage.class.getName());
	public static By yesButton = By.xpath("//button[contains(@class,'button button--bg-grey button')]");
	public static By NoButton = By.xpath("(//button[contains(@class,'button button--bg-blue button')])[2]");
	public static By UsernameDownArrow = By.xpath("//div[@class='header__user-name']");
	public static By Logout = By.xpath("//div[@class='dropdown-menu__item']");
	public static By GotoExamButton=By.xpath("//span[text()='受験説明ページにいく']");
	public static By ReturnToLoginPage=By.xpath("//a[@href='#/auth/login']");//span[@class='button__text d-inline-flex']
	public static By logo = By.cssSelector(".t-select__object-title");
	public static By timer= By.cssSelector("div[class='t-select__object-count d-flex'] div:nth-child(1) div:nth-child(1)");
	public static By questions= By.cssSelector("div[class='t-select__object-count d-flex'] div:nth-child(1) div:nth-child(1)");
	public static By Username= By.xpath("//div[@id='button-user']");
	public static By DashboardTitle = By.xpath("//div[@class='header__title']");
	public static By ResumeExam= By.xpath("//button[@class='button button--bg-blue button--radius-small']");
	
	public static void clickEscbutton() throws Exception {
		WebHandler.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		log.info("Click On Escape Button");
		Thread.sleep(5000);
		
	}
	public static void ClickonYes() throws Exception {
		Thread.sleep(2000);
		elementActions.ElementActions.waitForElementVisibilty(yesButton);
		elementActions.ElementActions.click(yesButton);
		log.info("Click On Yes");
		Thread.sleep(2000);
	}
	public static void ClickonNo() throws Exception {
		Thread.sleep(2000);
		elementActions.ElementActions.waitForElementVisibilty(NoButton);
		elementActions.ElementActions.click(NoButton);
		log.info("Click On No");
	}
	public static void ClickonUserNameDownArrow() throws Exception {
		Thread.sleep(2000);
		elementActions.ElementActions.waitForElementVisibilty(UsernameDownArrow);
		elementActions.ElementActions.click(UsernameDownArrow);
		log.info("Click On UserNameDownArrow");
	}
	public static void ClickonLogout() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(Logout);
		elementActions.ElementActions.click(Logout);
		log.info("Click On Logout");
	}
	public static void GotoExamButtonIsDisplayed() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(GotoExamButton);
		if(elementActions.ElementActions.isElementPresent(GotoExamButton)) {
			System.out.println("Go To Exam Button Is Displayed");
		} else {
			System.out.println("Not Displayed");
		}
		log.info("Verify GotoExamButtonIsDisplayed");
	}
	public static void ReturnToLoginPage() throws Exception {
		Thread.sleep(2000);
		elementActions.ElementActions.click(ReturnToLoginPage);	
		log.info("Click On ReturnToLoginPage");
	}
	public static void GotoExamButton() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(GotoExamButton);
		elementActions.ElementActions.click(GotoExamButton);
		log.info("Click OnGo To Exam Button");
	}
	public static void VerifyDashboardPageTitle() {
//	String Actual = WebHandler.driver.getTitle();
//	String Expected="CBT試験";
//	Assert.assertNotEquals(Actual, Expected);
//	log.info("Verify Dashboard Page Title");
		ElementActions.waitForElementVisibilty(DashboardTitle);
		ElementActions.isElementPresent(DashboardTitle);
	}
	public static void UserNameDropDownIsDisplayed() throws Exception {
		elementActions.ElementActions.waitForElementVisibilty(UsernameDownArrow);
		if(elementActions.ElementActions.isElementPresent(UsernameDownArrow)) {
			System.out.println("UserName Dropdown Is Displayed");
		} else {
			System.out.println("Not Displayed");
		}
		log.info("Verify Username Down Arrow Is Displayed");
	}
	public static void examLogoCheck() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(logo);
		ElementActions.isDisplayed(logo);
		Assert.assertNotEquals(logo, "CBT試験");
		Thread.sleep(2000);
	}
	public static void timerCheck() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(timer);
		ElementActions.isDisplayed(timer);
		Assert.assertNotEquals(timer, "150分");
		Thread.sleep(2000);
	}
	public static void questionCheck() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(questions);
		ElementActions.isDisplayed(questions);
		Assert.assertNotEquals(questions, "100問");
		Thread.sleep(2000);
	}
	public static void UsernameCheck() {
		ElementActions.waitForElementVisibilty(Username);
		ElementActions.isElementPresent(Username);
		Assert.assertNotEquals(Username, "テスト 455");
	}
	
	public static void ClickOnResumeExam() throws Exception {
		ElementActions.waitForElementVisibilty(ResumeExam);
		ElementActions.click(ResumeExam);
	}
}
