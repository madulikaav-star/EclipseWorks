package junitBasics;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExpandSiteLogin {
	WebDriver driver=new ChromeDriver();
	String url="https://practice.expandtesting.com/login";
	@Before
	public void envSetup() {
		driver.get("https://practice.expandtesting.com/login");
	}
	@Test
	public void loginVerify() {
		driver.findElement(By.name("username")).sendKeys("madhu");
		driver.findElement(By.name("password")).sendKeys("madhu@123");
		driver.findElement(By.id("submit-login")).click();
	}
	@After
	public void browserClose() {
		driver.close();
	}
	
	

}
