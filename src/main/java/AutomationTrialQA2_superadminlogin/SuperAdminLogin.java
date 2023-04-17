package AutomationTrialQA2_superadminlogin;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import AutomationTrialQA2_copy.BaseBrowser;

public class SuperAdminLogin extends BaseBrowser{
	
	public static void main(String[] args, String Username, String Password, String clearurl) throws InterruptedException {
		SuperAdminLogin OB=new SuperAdminLogin();
		
		
		
		OB.startBrowser1();
		//OB.clearData(clearurl);
		OB.hitCBTURL();
		OB.login1(Username,Password);
		
		
	}
	public void startBrowser1() throws InterruptedException {
		
		startBrowser();
	}
	public void clearData(String clearurl) throws InterruptedException{
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		//driver.manage().timeouts().getImplicitWaitTimeout();
		
		//wait = new WebDriverWait(driver, 15);
		
		
		//driver.get("https://qa.edulabcbt.com/oneup/auth/clearExamData?email="+clearurl);
		//driver.get(clearurl);
		Thread.sleep(1000);
	}
	
	public void hitCBTURL() throws InterruptedException{
		 

		driver.get("https://qa2.edulabcbt.com/#/");
	}
	public void login1(String Username,String Password) throws InterruptedException{
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.clear();
		username.sendKeys(Username);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.clear();
		password.sendKeys(Password);
		WebElement submit_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		submit_btn.click();
		
		
		
	}
	
	@Test
	public void checkhomepage(String hometitle) throws InterruptedException{
		
		Thread.sleep(4000);
		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/a"));
		
		String s1 = homepage.getText();
		System.out.println(s1);
		
//		if(hometitle.equals(s1))
//		{
//			
//			System.out.println("matched");
//		}
//		else
//		{
//			System.out.println("Not matched");
//		}
		
		Assert.assertEquals("Not matched",hometitle, s1);
	}
	
	public void Logout() {
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/a"));
		logout.click();
		driver.quit();
		
	}

}
