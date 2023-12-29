package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class InstructionPage extends WebHandler {
	private static Logger log = LogManager.getLogger(InstructionPage.class.getName());
	public static By NextButton = By.xpath("//span[@class='icon-next carousel-control-next-icon']");
	public static By PreviousButton = By.xpath("//span[@class='icon-prev carousel-control-prev-icon']");
	public static By GoToTestStartScreen = By.xpath("//button[contains(@class,'button button--bg-blue')]//a[1]");
	public static By TestStart = By.xpath("//div[@class='t-select__btn']");
	public static By IPUsername= By.xpath("//div[@class='header__user-name']");
	
	public static void ClickonNextButton() throws Exception {
		ElementActions.waitForElementVisibilty(NextButton);
		WebElement Enabled=WebHandler.driver.findElement(GoToTestStartScreen);
		for(int i=0;i<12;i++) {
		//	NextButton.click();
			Enabled.isEnabled();
			ElementActions.click(NextButton);
			log.info("Click On next button");
		}
	}
	public static void ClickonPreviousButton() throws Exception {
		ElementActions.waitForElementVisibilty(PreviousButton);
		ElementActions.click(PreviousButton);
		log.info("Click On Previous button");
	}
	public static void GotoTestStartScreenButton() throws Exception {
	//	ElementActions.click();
		ElementActions.waitForElementVisibilty(GoToTestStartScreen);
		ElementActions.click(GoToTestStartScreen);
		log.info("Click On GotoTestStartScreenButton");
	}
	public static void startTestButton() throws Exception {
		try {
		Thread.sleep(2000);
		ElementActions.click(TestStart);
		log.info("Click On startTestButton");
		} catch (Exception e) {
		
		}
		
	}
	public static void VerifyInstructionPageTitle() throws Exception {
		Thread.sleep(2000);
		String Act=WebHandler.driver.getTitle();
		String Exp ="CBT";
		Assert.assertEquals(Act, Exp);
		log.info("Verify Intruction Page Title");
	}
	public static void CheckIPUsername() {
		ElementActions.waitForElementVisibilty(IPUsername);
		ElementActions.isElementPresent(IPUsername);
		Assert.assertNotEquals(IPUsername, "テスト 455");
	}
}
