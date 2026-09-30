package TestNgBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTabsOpening {
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
	public void multipleTabHandling() throws InterruptedException {

		driver.switchTo().newWindow(WindowType.TAB);           //a new tab is opened
		driver.get("https://www.facebook.com/");              //facebook is opened in the new tab
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);              //another new tab is opened 
		driver.get("https://www.ebay.com/");                        //ebay is opened in the new tab
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());    //all the tabs are stored in a list//getwindohandlessss() is used
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));                               //we accessed facebook tab by index value
		driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]")).sendKeys("madhu@123.com");   //performed some tasks in the facebook
	}

}
