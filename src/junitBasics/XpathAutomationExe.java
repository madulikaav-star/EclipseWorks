package junitBasics;

import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAutomationExe {
	// absolute xpath
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://automationexercise.com/login#google_vignette");
	}
	@Test
	public void XPathverf() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("madhu@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("madhu@123");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
	}
	

}
