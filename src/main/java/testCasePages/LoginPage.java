package testCasePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;

import elementActions.ElementActions;
import webHandler.WebHandler;

public class LoginPage extends WebHandler{
	private static Logger log = LogManager.getLogger(LoginPage.class.getName());
	public static By userName = By.xpath("//input[@formcontrolname='username']");
	public static By Password = By.xpath("//input[@formcontrolname='password']");
	public static By LoginButton = By.xpath("//button[@type='submit']");
	public static By EyeButton = By.xpath("//div[@class='login__form-input login__form-input--pass']//span[1]");
    public static By ErrorUnamePwdMessage  = By.xpath("//div[@class='error']//div[1]");
    public static By BlankUname  = By.xpath("//font[text()='Examination number is a required field']");
    public static By BlankPass  = By.xpath("//font[text()='Password is a required field']");
    public static By DualError = By.xpath("//div[@class='error']");
    public static By LoginTitle= By.xpath("//div[@class='login__title']");
    public static By EidMessage= By.xpath("//input[@placeholder='受験番号をご入力ください']");
    public static By PwdMessage= By.xpath("//input[@placeholder='パスワードをご入力ください']");

public static void EnterUsername(String Username)  {
	ElementActions.cleanAndsend(userName, Username);
	log.info("Enter Username");
}
public static void EnterPasword(String password) {
	//ElementActions.SendKeys(Password, password);
	ElementActions.cleanAndsend(Password, password);
	log.info("Enter Password");
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
//	}else if(ElementActions.isDisplayed(BlankPass)) {
	}else if(BlankPwd.equals(BlankPwd)) {
	Assert.assertTrue(true, "Password is a required field"); 
	ElementActions.waitForElementVisibilty(BlankUname);
	ElementActions.waitForElementVisibilty(BlankPass);
	}else if(ElementActions.isDisplayed(BlankPass) || ElementActions.isDisplayed(BlankUname)) {
	Assert.assertTrue(true, "Examination number is a required field&Password is a required field"); 
	}else {
	Assert.assertTrue(true, "Login Succesful");
	}
	log.info("Click On Login Button");
}
public static void ClickonEyeButton() throws Exception {
	try {
	ElementActions.waitForElementVisibilty(EyeButton);
	ElementActions.click(EyeButton);
	} catch (Exception e) {
		e.getMessage();
	}
	log.info("Click On Eye Button");
}
public static void VerifyLogingPageUrl() throws Exception {
	String Actual =WebHandler.driver.getCurrentUrl();
	String Expected="https://orthodoctor-stage.edulabcbt.com/#/auth/login";
	Assert.assertNotEquals(Actual, Expected);
	log.info("Verify Login Page Url");
}
//public static void VerifyLogingPageTitle() throws Exception {
//	String Actual =WebHandler.driver.getTitle();
//	String Expected="CBT";
//	Assert.assertEquals(Actual, Expected);
//	log.info("Verify Login Page Title");
//}
public static void checkalreadylogin() {
ElementActions.isElementPresent(DualError);
Assert.assertNotEquals(DualError, "別のデバイスかブラウザを使用して既にログインしています。別のデバイスかブラウザが閉じられているか確認してください。 （試験監督員は管理画面で、試験前であれば「ログインのクリア」、試験中であれば「試験の再開」をしてください。）");
}

public static void CheckLoginPageTitle() {
	ElementActions.isElementPresent(LoginTitle);
	Assert.assertNotEquals(LoginTitle, "消化器病専門医試験");	
}
public static void CheckEidMessage() {
	ElementActions.isElementPresent(EidMessage);
	Assert.assertNotEquals(EidMessage, "受験番号をご入力ください");
}
public static void CheckPwdMessage() {
	ElementActions.isElementPresent(PwdMessage);
	Assert.assertNotEquals(PwdMessage, "パスワードをご入力ください");
}
}