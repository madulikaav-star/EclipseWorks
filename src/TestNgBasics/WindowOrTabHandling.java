package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowOrTabHandling {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.google.com");     //google is opened in a tab
	}
	@Test
	public void switchingtoAnotherTab() throws InterruptedException {
		String firsttab=driver.getWindowHandle();                  //google tab is stored in a reference
		driver.switchTo().newWindow(WindowType.TAB);           //a new tab is opened
		driver.get("https://www.facebook.com/");               //facebook is opened in new tab
		driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]")).sendKeys("madhu@123.com");     //any tasks is done in the facebook tab//eg: gmail is typed in the field
		Thread.sleep(4000);                             //waited 4 seconds
		driver.close();                        //closed the currect(facebook) tab
		driver.switchTo().window(firsttab);         //switched to google tab
		
	}

}
