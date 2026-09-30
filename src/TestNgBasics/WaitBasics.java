package TestNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaitBasics {
	WebDriver driver;
	@BeforeTest
	public void browserloading() {
		driver=new ChromeDriver();
	}
//	@Test
//	public void implicitWait() {                                      //applies to all elements which comes under the declared line
//		driver.get("https://www.amazon.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
//		
//	}
	@Test
	public void ExplicitWait() throws InterruptedException {                   //only for given elements
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-orders']"))).click();
		
	}

}
