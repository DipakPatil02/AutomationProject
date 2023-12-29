package testCasePages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class EC2312 {
	
	public static By PopUp= By.xpath("//p[@class='modal-submit__mess text-center']");
	public static By UserID=By.xpath("//td[normalize-space()='dm0322']");
	public static By UStatus1=By.xpath("//body[1]/div[2]/div[1]/div[2]/app-monitor-test-status[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[26]/td[3]/span[1]/font[1]");
	public static By Ustatus2= By.xpath("//table[contains(@class,'table borderless')]/tbody[1]/tr[21]/td[3]");
	public static By LoginLink= By.xpath("//a[contains(text(),'アンケートURLはこちら')]");
	
	public static void CheckPopup() throws Exception {
		Thread.sleep(2000);
		WebHandler.driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		ElementActions.waitForElementVisibilty(PopUp);
		ElementActions.isElementPresent(PopUp);
	}
	public static void PopupNotpresent() throws Exception {
		Thread.sleep(2000);
		if(ElementActions.isElementPresent(PopUp)) {
			System.out.println("Alert pop up is present");
		}else {
			System.out.println("Alert pop up is not present");
		}
	
	}
	public static void clickEnterbutton() throws Exception {
        Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void CheckUserStatus2() {
		ElementActions.isElementPresent(Ustatus2);
	}
	public static void CheckUserStatus1() {
		ElementActions.isElementPresent(UStatus1);
		
	}
}
