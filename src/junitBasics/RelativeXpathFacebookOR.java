package junitBasics;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathFacebookOR {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void EmailField() {
		driver.findElement(By.xpath("//input[@type='password' or @name='pass']")).sendKeys("madhu@123");
		driver.findElement(By.xpath("//input[@type='text' or @name='email']")).sendKeys("madhu@123");
	}

}
