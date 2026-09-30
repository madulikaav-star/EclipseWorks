package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatepickCalender {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	@Test
	public void datePicker() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("07/06/2025");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/a[2]")).click();
		
		

		
		
	}
	

}
