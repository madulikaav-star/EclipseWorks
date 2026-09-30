package TestNgBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tabsopening {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void tabHnadle() {
		String firsttab=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p[1]/a")).click();

		
		Set<String> alltabs=driver.getWindowHandles();      //we can use arraylist also
		for(String handle:alltabs) {                          //confusion
			if(!handle.equalsIgnoreCase(firsttab)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("madhu@123");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
				
			}
			driver.switchTo().window(firsttab);
		}
		
		
	}
	

}
