package junitBasics;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathFacebk {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void XPathverf() {
		driver.findElement(By.xpath("//input[1][@name='email']")).sendKeys("madhu@gmail.com"); //to write email id in email field
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("madhu@123"); // to write password in password field
		driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();       //to click the button
	}

}
