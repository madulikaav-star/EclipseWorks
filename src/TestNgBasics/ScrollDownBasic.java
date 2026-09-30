package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDownBasic {
	WebDriver driver;
	@BeforeTest
	public void browserloading() {
		driver=new ChromeDriver();
	}
//	@Test
//	public void scrolldownPixel() {                                   //scroll by pixel
//		driver.get("https://www.amazon.in/");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)","");
//	}
//	@Test
//	public void scrolldownVisibleElement() {                                                          //scroll till the given element
//		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
//		WebElement ele=driver.findElement(By.id("Register"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		
//	}
	@Test
	public void scrolldownLast() throws InterruptedException {                                           //scroll till last
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	

}
