package MyWorks;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import junit.framework.Assert;

import org.junit.jupiter.api.Assertions;

public class FacebookLoginPageJunit {
	WebDriver driver=new ChromeDriver();
	@Before
	public void browserLoading() {
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void URLVerification() {
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/login/";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	@Test
	public void titleVerification() {
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook";
		Assert.assertEquals(actualTitle,expectedTitle );
	}
	@Test
	public void logoDisplayed() {
		Boolean logo=driver.findElement(By.xpath("//*[name()='svg']")).isDisplayed();
		if(logo) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo is not displayed");
		}
	}
	@Test
	public void emailAddressOrMobileNumberFieldDisplayed() {
		Boolean email=driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
		if(email) {
			System.out.println("Email address or mobile number field is displayed");
		}
		else {
			System.out.println("Email address or mobile number field is not displayed");
		}
	}
	@Test
	public void passwordFieldDisplayed() {
		Boolean password=driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed();
		if(password) {
			System.out.println("Password field is displayed");
		}
		else {
			System.out.println("Password field is not displayed");
		}
	}
	@Test
	public void loginButtonDisplayed() {
		Boolean login=driver.findElement(By.xpath("//div[@aria-label='Log in']")).isDisplayed();
		if(login) {
			System.out.println("Login button is displayed");
		}
		else {
			System.out.println("Login button is not displayed");
		}
	}
	@Test
	public void loginButtonEnabled() {
		Boolean login=driver.findElement(By.xpath("//div[@aria-label='Log in']")).isEnabled();
		if(login) {
			System.out.println("Login button is enabled");
		}
		else {
			System.out.println("Login button is not enabled");
		}
	}
	@Test
	public void setValues() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sampleemail@gmail.com");  //email address or mobile number field
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sample name");             //password field
		driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();	                   //login button 
	
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[4]/div/a/div/div[1]")).click(); //forgotten password link
		Thread.sleep(1000);
		driver.navigate().back();
	
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[5]/div/a/div/div[1]")).click(); //create an account link
		Thread.sleep(1000);
		driver.navigate().back();
	}
	@AfterTest
	public void browserclosing() {
		driver.quit();
	}

}
