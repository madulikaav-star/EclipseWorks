package junitBasics;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAutoExe {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://automationexercise.com/login#google_vignette");
	}
	@Test
	public void XPathverf() {
		driver.findElement(By.xpath("//input[2][@name='email']")).sendKeys("madhu@gmail.com"); //to write email id in email field
		driver.findElement(By.xpath("//input[3][@name='password']")).sendKeys("madhu@123"); // to write password in password field
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();       //to click the button
	}
	

}
