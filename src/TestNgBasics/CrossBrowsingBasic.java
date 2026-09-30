package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingBasic {
	WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeTest
	public void browserSetup(String browser) {
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equals("Firefox")) {
			driver= new FirefoxDriver();
		}
	}
	@BeforeMethod
	public void urlsetup() {
		driver.get("https://www.google.com");
	}
	@Test
	public void googlesearch() {
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
	}
//	@AfterTest
//	public void browserclose() {
//		driver.quit();
//	}
}
