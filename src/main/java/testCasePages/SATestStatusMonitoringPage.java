package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import elementActions.ElementActions;

public class SATestStatusMonitoringPage {
	private static Logger log = LogManager.getLogger(SATestStatusMonitoringPage.class.getName());
	public static By TestStatusBtn= By.xpath("//a[contains(text(),'試験状況のモニタリング')]");
	public static By DisplayTestStatusBtn = By.xpath("//button[@class='btn btn-main btn-second refresh-data']");
	public static By VenueSelectionDropDown= By.xpath("//div[@class='w-90']//select[1]");
	public static By UpdateBtn= By.xpath("//button[@class='btn btn-enabled']");
	public static By Indicate = By.xpath("//body[1]/div[2]/div[1]/div[2]/app-monitor-test-status[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]");
	public static By LogOut= By.xpath("//button[contains(text(),'ログアウト')]");
	
	
	
	public static void ClickOnTestMonitoringBtn() throws Exception {
		Thread.sleep(2000);
		ElementActions.click(TestStatusBtn);
		log.info("Click On Test Monitoring Button");
	}
	public static void ClickOnDisplayStatusBtn() throws Exception {
		Thread.sleep(2000);
		ElementActions.click(DisplayTestStatusBtn);
		log.info("Click On Display Test Status Button");
	}
	public static void ClickOnINdicate() throws Exception {
		Thread.sleep(2000);
		ElementActions.click(Indicate);
		log.info("Click On Indicate Button");
	}
	public static void ClicOnDropDown() throws Exception {
		Thread.sleep(1000);
		ElementActions.waitForElementVisibilty(VenueSelectionDropDown);
		ElementActions.select(VenueSelectionDropDown, "青森新町通りテストセンター");
		log.info("Select Value From Dropdown");
	}
	public static void ClickOnUpdate() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(UpdateBtn);
		ElementActions.click(UpdateBtn);
		log.info("Click On Update Button");
	}
	public static void ClickOnLogOut() throws Exception {
		Thread.sleep(2000);
		ElementActions.click(LogOut);
		log.info("Click On Logout Button");
	}
	

}
