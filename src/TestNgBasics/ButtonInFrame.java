package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonInFrame {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://leafground.com/frame.xhtml");
	}
	@Test
	public void testLeafWork() {
		driver.switchTo().frame(0);        //the button lies in a frame so we have to access by frame. if there are lot of frames, access it by index value
		driver.findElement(By.xpath("//*[@id=\"Click\"]")).click();     //then we can click the button
//		driver.switchTo().defaultContent();      //to go back to original content//im not clear about this
	}

}
