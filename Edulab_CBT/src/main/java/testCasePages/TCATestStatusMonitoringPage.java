package testCasePages;

import java.time.Duration;

import org.openqa.selenium.By;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TCATestStatusMonitoringPage extends WebHandler {
	public static By TestStatusMonitoringClick= By.xpath("//ul[@class='sidebar-list']//li[1]");
	public static By VenueSelectionDropDown= By.xpath("//div[@class='w-90']//select[1]");
	public static By DisplayAnswerStatus= By.xpath("(//button[contains(@class,'btn btn-main')]//font)[2]");
	public static By Indicate= By.xpath("//font[text()='indicate']");
	public static By Update= By.xpath("//div[contains(@class,'d-flex flex-row')]//button[1]");
	public static By LeaveButton= By.xpath("(//button[@class='btn btn-exit-enabled']//font)[2]");
	public static By LeftButton= By.xpath("//tr[@class='tableRowBorder']//button");
	public static By PopYes= By.xpath("(//div[@class='modal-footer']//button)[2]");
	public static By StatusMonitoringBtn= By.xpath("//a[contains(text(),'試験状況のモニタリング')]");
	public static By MonitoringLogo =By.xpath("//h6[contains(text(),'試験状況のモニタリング')]");
	public static By ShowTestStatus = By.xpath("//span[contains(text(),'試験状況を表示')]");
	
	
	
	public static void TestStatusMonitoringClick() throws Exception {
		ElementActions.waitForElementVisibilty(TestStatusMonitoringClick);
		ElementActions.click(TestStatusMonitoringClick);	
	}
	public static void VenueSelectionDropdown() throws Exception {
		ElementActions.waitForElementVisibilty(VenueSelectionDropDown);
		ElementActions.select(VenueSelectionDropDown, "19");
	}
	public static void DisplayAnswerStatusClick() throws Exception {
		ElementActions.waitForElementVisibilty(ShowTestStatus);
		ElementActions.click(ShowTestStatus);	
	}
	public static void IndicateButtonClick() throws Exception {
		ElementActions.waitForElementVisibilty(Indicate);
		ElementActions.click(Indicate);	
	}

	public static void LeaveButtonClick() throws Exception {
		ElementActions.waitForElementVisibilty(LeaveButton);
		ElementActions.click(LeaveButton);	
	}
	public static void LeftButtonClick() throws Exception {
		ElementActions.waitForElementVisibilty(LeftButton);
		ElementActions.click(LeftButton);	
	}
	public static void YesButtonClick() throws Exception {
		ElementActions.waitForElementVisibilty(PopYes);
		ElementActions.click(PopYes);	
	}
	public static void UpdateButtonClick() throws Exception {
		WebHandler.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ElementActions.click(Update);	
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
	
	
	
	

}
