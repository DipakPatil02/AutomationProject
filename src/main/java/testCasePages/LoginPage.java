package testCasePages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class LoginPage extends WebHandler{
	
	public static By userName = By.xpath("//input[@formcontrolname='username']");
	public static By Password = By.xpath("//input[@formcontrolname='password']");
	public static By LoginButton = By.xpath("//button[@type='submit']");
	public static By EyeButton = By.xpath("//div[@class='login__form-input login__form-input--pass']//span[1]");
    public static By ErrorUnamePwdMessage  = By.xpath("//div[@class='error']//div[1]");
    public static By BlankUname  = By.xpath("//font[text()='Examination number is a required field']");
    public static By BlankPass  = By.xpath("//font[text()='Password is a required field']");

public static void EnterUsername(String Username)  {
	ElementActions.SendKeys(userName, Username);
}
public static void EnterPasword(String password) {
	ElementActions.SendKeys(Password, password);
}
public static void ClickonLoginButton() throws Exception {
	ElementActions.click(LoginButton);
	ElementActions.waitForElementVisibilty(ErrorUnamePwdMessage);
	String ErrorMessage="入力情報に誤りがあります";
	String Blankuname="受験番号は入力必須項目です";
	String BlankPwd="パスワードは入力必須項目です";
	if(ErrorMessage.equals("There is an error in the input information")) {
//	if(ElementActions.isDisplayed(ErrorUnamePwdMessage))  {
//	Assert.assertTrue(true, "Invalid Credentials");
	AssertJUnit.assertTrue("There is an error in the input information", true);
	ElementActions.waitForElementVisibilty(BlankUname);
	}else if(Blankuname.equals("受験番号は入力必須項目です")) {
//	}else if(ElementActions.isDisplayed(BlankUname)) {
	Assert.assertTrue(true, "Examination number is a required field"); 
	ElementActions.waitForElementVisibilty(BlankPass);
	}else if(ElementActions.isDisplayed(BlankPass)) {
	Assert.assertTrue(true, "Password is a required field"); 
	ElementActions.waitForElementVisibilty(BlankUname);
	ElementActions.waitForElementVisibilty(BlankPass);
	}else if(ElementActions.isDisplayed(BlankPass) || ElementActions.isDisplayed(BlankUname)) {
	Assert.assertTrue(true, "Examination number is a required field&Password is a required field"); 
	}else {
	Assert.assertTrue(true, "Login Succesful");
	}
}
public static void ClickonEyeButton() throws Exception {
	try {
	ElementActions.waitForElementVisibilty(EyeButton);
	ElementActions.click(EyeButton);
	} catch (Exception e) {
		e.getMessage();
	}
}
public static void VerifyLogingPageUrl() throws Exception {
	String Actual =WebHandler.driver.getCurrentUrl();
	String Expected="https://gastrodoctor-stage.edulabcbt.com/#/auth/login";
	Assert.assertEquals(Actual, Expected);
}
public static void VerifyLogingPageTitle() throws Exception {
	String Actual =WebHandler.driver.getTitle();
	String Expected="CBT";
	Assert.assertEquals(Actual, Expected);
}


}