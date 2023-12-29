package testCasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class TCAPasswordReset {
	public static By ResetPassword = By.xpath("//a[contains(text(),'パスワードのリセット')]");
	public static By ExamineeNumber= By.xpath("//input[contains(@class,'text-muted d-inline-block')]");
	public static By InputBox= By.xpath("//input[contains(@class,'edu-input form-control')]");
	public static By NewPassBox= By.xpath("//input[@type='password']");
	public static By passResetBtn= By.xpath("//button[contains(text(),'パスワードをリセットする')]");
	public static By searchBtn = By.xpath("//*[@class='fas fa-search edu-search']");
	public static By resetNo= By.xpath("//button[contains(text(),'キャンセル')]");
	
	public static void ClickOnResetPass() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(ResetPassword);
		ElementActions.click(ResetPassword);
	}
	public static void ClickOnExamineeNumber() throws Exception {
		ElementActions.waitForElementVisibilty(ExamineeNumber);
		ElementActions.click(ExamineeNumber);
		//log.info("Click on ExamNumber Search input Field");
	}
	public static void InputField() throws Exception {
		WebElement Ele= WebHandler.driver.findElement(InputBox);
        Thread.sleep(10000);
        Ele.sendKeys("dm0324");
        Thread.sleep(10000);
       // Log.info("Admin Enters Examinee number");
	}
	public static void EnterNewPasswd() throws Exception {
		WebElement Ele= WebHandler.driver.findElement(NewPassBox);
        Thread.sleep(10000);
        Ele.sendKeys("1234567");
        Thread.sleep(10000);
       // Log.info("Admin Enters New Password");
	}
	public static void ClickOnPasswdResetBtn() throws Exception {
		ElementActions.waitForElementVisibilty(passResetBtn);
		ElementActions.click(passResetBtn);
	}
	
	public static void clickOnsearch() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(searchBtn);
		ElementActions.webDriverWait(searchBtn);
		ElementActions.click(searchBtn);
		
	}
	public static void ClickResetNo() throws Exception {
		Thread.sleep(2000);
		ElementActions.waitForElementVisibilty(resetNo);
		ElementActions.click(resetNo);
	}

}
