package testCasePages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TCATestStatusMonitoringPage extends WebHandler {
	private static Logger log = LogManager.getLogger(TCATestStatusMonitoringPage.class.getName());
	public static By TestStatusMonitoringClick= By.xpath("//ul[@class='sidebar-list']//li[1]");
	public static By VenueSelectionDropDown= By.xpath("//div[@class='w-90']//select[1]");
	public static By DisplayAnswerStatus= By.xpath("(//button[contains(@class,'btn btn-main')]//font)[2]");
	public static By Indicate= By.xpath("//font[text()='indicate']");
	public static By UpdateBtn= By.xpath("//button[@class='btn btn-enabled']");
	public static By LeaveButton= By.xpath("(//button[@class='btn btn-exit-enabled'])[1]");
	public static By LeftButton= By.xpath("//tr[@class='tableRowBorder']//button");
	public static By PopYes= By.xpath("(//div[@class='modal-footer']//button)[2]");
	public static By StatusMonitoringBtn= By.xpath("//a[contains(text(),'試験状況のモニタリング')]");
	public static By MonitoringLogo =By.xpath("//h6[contains(text(),'試験状況のモニタリング')]");
	public static By ShowTestStatus = By.xpath("//span[contains(text(),'試験状況を表示')]");
	public static By VenueSelection = By.xpath("//select[@id='test-center-val']]");
	
	
	
	public static void TestStatusMonitoringClick() throws Exception {
		ElementActions.waitForElementVisibilty(TestStatusMonitoringClick);
		ElementActions.click(TestStatusMonitoringClick);
		log.info("Click on Test status Monitoing Button");
	}
	public static void VenueSelectionDropdown() throws Exception {
		ElementActions.waitForElementVisibilty(VenueSelectionDropDown);
		ElementActions.select(VenueSelectionDropDown, "19");
		log.info("Select Value From Dropdown");
	}
	public static void DisplayAnswerStatusClick() throws Exception {
		ElementActions.waitForElementVisibilty(ShowTestStatus);
		ElementActions.click(ShowTestStatus);
		Thread.sleep(5000);
		log.info("Click on Display Answer Status Button");
	}
	public static void IndicateButtonClick() throws Exception {
		ElementActions.waitForElementVisibilty(Indicate);
		ElementActions.click(Indicate);	
		log.info("Click on Indicate Button");
	}

	public static void LeaveButtonClick() throws Exception {
		WebHandler.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ElementActions.waitForElementVisibilty(LeaveButton);
		ElementActions.click(LeaveButton);
		log.info("Click on Leave Button");
		
	}
	public static void LeftButtonClick() throws Exception {
		WebHandler.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ElementActions.waitForElementVisibilty(LeftButton);
		ElementActions.click(LeftButton);
		log.info("Click on Left Button");
	}
	public static void YesButtonClick() throws Exception {
		Thread.sleep(4000);
		ElementActions.waitForElementVisibilty(PopYes);
		ElementActions.click(PopYes);	
		log.info("Click on Yes Button");
	}
	public static void UpdateButtonClick() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(UpdateBtn);
		ElementActions.click(UpdateBtn);
		log.info("Click On Update Button");
	}
	public static void CheckLogo() {
		if(ElementActions.isElementPresent(MonitoringLogo)) {
			System.out.println("Test status monitoring page is visible");
		}
		else {
			System.out.println("page is not visible");
		}
	}
	public static void ClickOnShowTestStaus() throws Exception {
		ElementActions.waitForElementVisibilty(ShowTestStatus);
		ElementActions.click(ShowTestStatus);
	}
	public static void ClickOnStatusBTN() throws Exception {
		ElementActions.waitForElementVisibilty(StatusMonitoringBtn);
		ElementActions.click(StatusMonitoringBtn);
	}
	public static void ClicOnDropDown() throws Exception {
		Thread.sleep(1000);
		Select center = new Select(webHandler.WebHandler.driver.findElement(VenueSelection));
		center.selectByVisibleText("青森新町通りテストセンター");
		
	}
	
	
	
	

}
