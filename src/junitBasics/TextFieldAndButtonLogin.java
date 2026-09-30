package junitBasics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldAndButtonLogin {
	WebDriver driver=new ChromeDriver();
	String url="https://practicetestautomation.com/practice-test-login/";
	
	@Before
	public void envSetup() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void loginVerification() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("madhu");   //to input values to username field  //to get the name locator we have to right click in the userfield in the browser page and select inspect and look for name or id values
		Thread.sleep(1000);  //to slowdown the process //not necessary
		
		driver.findElement(By.name("password")).sendKeys("madhu@123");  //to input values to password field
		Thread.sleep(1000);
		
		driver.findElement(By.id("submit")).click();   //to click the submit button
	}
	@After
	public void browserClose() {
		driver.close();
	}

}
