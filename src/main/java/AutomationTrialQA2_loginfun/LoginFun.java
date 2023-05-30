package AutomationTrialQA2_loginfun;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import AutomationTrialQA2_copy.BaseBrowser;

public class LoginFun extends BaseBrowser {
	public static void main(String[] args, String Username, String Password, String clearurl) throws InterruptedException {
		LoginFun OB=new LoginFun();
		OB.startBrowser1();
		//OB.clearData(clearurl);
		OB.hitCBTURL();
		OB.login1(Username,Password);
		OB.gothroughInstructions();
		OB.logout();	
	}
	public void startBrowser1() throws InterruptedException {	
		startBrowser();
	}
	//When we completed the exam again we have to automation for that user we required email id
	public void clearData(String clearurl) throws InterruptedException{
		driver.manage().window().maximize();	
		driver.get("https://qa.edulabcbt.com/oneup/auth/clearExamData?email="+clearurl);
		//driver.get(clearurl);
		Thread.sleep(1000);
	}	
	public void hitCBTURL() throws InterruptedException{
		driver.get("https://qa2.edulabcbt.com/#/");
	}	
	public void login1(String Username,String Password) throws InterruptedException{	
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys(Username);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(Password);
		WebElement submit_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		submit_btn.click();
	}
	//There are 10 instruction pages 
	public void gothroughInstructions() throws InterruptedException{
		Thread.sleep(3000);
		WebElement goto_instruct = driver.findElement(By.xpath("//button[@class='button button--bg-blue button--radius-small']"));
		//WebElement goto_instruct = driver.findElement(By.className("button__text d-inline-flex"));
		goto_instruct.click();
		Thread.sleep(1000);
		WebElement rtarrow1 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow1.click();
		Thread.sleep(500);
		WebElement rtarrow2 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow2.click();
		Thread.sleep(500);
		WebElement rtarrow3 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow3.click();
		Thread.sleep(500);
		WebElement rtarrow4 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow4.click();
		Thread.sleep(1000);
		WebElement rtarrow5 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow5.click();
		Thread.sleep(1000);
		WebElement rtarrow6 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow6.click();
		Thread.sleep(1000);
		WebElement rtarrow7 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow7.click();
		Thread.sleep(1000);
		WebElement rtarrow8 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow8.click();
		Thread.sleep(1000);
		WebElement rtarrow9 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow9.click();
		Thread.sleep(1000);
		WebElement rtarrow10 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow10.click();
		Thread.sleep(1000);
		WebElement rtarrow11 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow11.click();
		Thread.sleep(1000);
		WebElement rtarrow12 = driver.findElement(By.xpath("//span[@class='icon-next carousel-control-next-icon']"));
		rtarrow12.click();
		Thread.sleep(1000);	
	}	
	//When we required logout in between exam we need call logout from stepdef
	public void logout() throws InterruptedException{
		WebElement username_lnk = driver.findElement(By.xpath("//div[@class='header__user-name']"));
		username_lnk.click();
		Thread.sleep(4000);
		WebElement logout_lnk = driver.findElement(By.xpath("//div[@class='dropdown-menu__item']"));
		logout_lnk.click();
		Thread.sleep(4000);		
	}		
	//Call from stefdef
	@Test
	public void startexam1() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement GoToExam1 = driver.findElement(By.xpath("//button[@class='button button--bg-blue button--radius-medium']"));
		GoToExam1.click();
		Thread.sleep(3000);
		WebElement GoToExam2 = driver.findElement(By.xpath("//div[@class='t-select__btn']"));
		GoToExam2.click();
		Thread.sleep(3000);		
		WebElement Ques1Opt1 = driver.findElement(By.xpath("(//*[@class='checkbox__checkmark'])[1]"));
		Ques1Opt1.click();	
		WebElement Next1 = driver.findElement(By.xpath("//div[@class='panel-sidebar d-flex justify-content-between']/child::div[2]/child::div[1]/child::button[3]"));
		Next1.click();
		Thread.sleep(5000);
		WebElement zoom =driver.findElement(By.xpath("/html/body/app-root/app-student/app-taking-test/div/div/div/app-size/button[1]"));
		Thread.sleep(1000);
		zoom.click();
		Thread.sleep(1000);
		zoom.click();
		Thread.sleep(4000);
		WebElement zoomin = driver.findElement(By.xpath("/html/body/app-root/app-student/app-taking-test/div/div/div/app-size/button[2]"));
		Thread.sleep(1000);
		zoomin.click();
		Thread.sleep(1000);
		zoomin.click();
		Thread.sleep(4000);	
		driver.findElement(By.className("arrow")).click();
		Thread.sleep(4000);	
		driver.findElement(By.className("arrow")).click();
		Thread.sleep(4000);		
	    WebElement review =driver.findElement(By.xpath("//span[text()='後で見直す']"));
	    Thread.sleep(2000);
	    review.click();
		Thread.sleep(4000);
		String tu = driver.findElement(By.xpath("//div[@class='ex-info__user-name']/following-sibling::div[1]")).getText();
		Thread.sleep(1000);
		System.out.println(tu);
		WebElement Ques1Opt2 = driver.findElement(By.xpath("(//*[@class='checkbox__checkmark'])[2]"));
		Ques1Opt2.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='戻る']")).click();
		System.out.println("User click on "+driver.findElement(By.xpath("//span[text()='戻る']")).getText());
		Thread.sleep(3000);					
		WebElement Ques9 = driver.findElement(By.xpath("//*[@id=\"1\"]/div/span[9]"));
		Ques9.click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@class='checkbox__checkmark'])[2]")).click();	
		Thread.sleep(5000);
		WebElement next9 = driver.findElement(By.xpath("/html/body/app-root/app-student/app-taking-test/div/app-footer/div/div/div[2]/div/button[3]"));
		next9.click();
		Thread.sleep(3000);
		WebElement pop = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div/div/div/div[3]/button[2]"));
		pop.click();
		Thread.sleep(5000);	
		WebElement Ques99 = driver.findElement(By.xpath("(//*[@class='status-btn__item'])[98]"));
		Ques99.click();
		Thread.sleep(4000);
		WebElement Ques99Opt = driver.findElement(By.xpath("(//*[@class='checkbox__checkmark'])[5]"));
		Ques99Opt.click();
		Thread.sleep(4000);
		WebElement ExamSummary = driver.findElement(By.xpath("//*[@class='button button--bg-blue button--radius-small button--size-long']"));
		ExamSummary.click();
		Thread.sleep(2000);
		WebElement ExamComplete = driver.findElement(By.xpath("//*[@class='button button--bg-blue button--radius-small button--size-long']"));
		ExamComplete.click();
		Thread.sleep(2000);
		WebElement ConfirmComplete = driver.findElement(By.xpath("//button[@class='button button--bg-blue button--radius-small button--bg-white button--size-medium']"));
		ConfirmComplete.click();
		Thread.sleep(2000);
		WebElement CompleteMessage = driver.findElement(By.xpath("//p[@class='mb-5'][2]"));
		assertEquals("これで試験は終了です。続いてアンケートの回答をお願いいたします。アンケートの終了をもって退室の流れとなります。",CompleteMessage.getText());
		System.out.println("CompleteMessage.getText()");
		driver.quit();	
	}	
}
		
		

		
		



		

	


