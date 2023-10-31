package testCasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class CommonElements extends WebHandler {

	public static By AlertYes = By.xpath("//button[contains(@class,'button button--bg-grey')]");
	public static By ReturnToLoginPage = By.xpath("//a[@href='#/auth/login']");
	public static By AlertMessage = By.xpath("//div[text()='確認']");
	public static By UsernameDownArrow = By.xpath("//div[@class='header__user-name']");
	public static By Logout = By.xpath("//div[@class='dropdown-menu__item']");
	public static By userName = By.xpath("//input[@formcontrolname='username']");
	public static By Password = By.xpath("//input[@formcontrolname='password']");
	public static By LoginButton = By.xpath("//button[@type='submit']");
	public static By AdminLogoutButton = By.xpath("//button[contains(@class,'btn btn-success')]");
	
	public static void AlertYes() throws Exception {
		ElementActions.waitForElementToBeVisibleAndClick(AlertMessage);
	}
	public static void ReturnToLoginPage() throws Exception {
		ElementActions.isElementPresent(ReturnToLoginPage);
		ElementActions.click(ReturnToLoginPage);
	}
	public static void UsernameDownArrow() throws Exception {
		ElementActions.waitForElementToBeVisibleAndClick(UsernameDownArrow);
	}
	public static void Logout() throws Exception {
		ElementActions.waitForElementToBeVisibleAndClick(Logout);
	}
	public static void AdminLogin(String Uname,String password) throws Exception {
		ElementActions.SendKeys(userName, Uname);
		ElementActions.SendKeys(Password, password);
	}
	public static void AdminLoginButton() throws Exception {
		ElementActions.click(LoginButton);
	}
	public static void Navigate() throws Exception {
		Thread.sleep(2000);
		WebHandler.driver.switchTo().newWindow(WindowType.TAB).get("https://gastrodoctor-stage.edulabcbt.com/#/auth/login");
	}
	public static void AdminLogoutButton() throws Exception {
//	    ElementActions.waitForElementVisibilty(AdminLogoutButton);
		Thread.sleep(4000);
		ElementActions.click(AdminLogoutButton);
	}


}
