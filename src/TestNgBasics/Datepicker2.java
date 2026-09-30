package TestNgBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker2 {
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
	public void datePicker() {
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		while(true) {
			String monthtext=driver.findElement(By.xpath("//*[@id=\\\"datepicker1\\\"]")).getText();   //this will save the current month in monthtext
			System.out.println(monthtext);
			if(monthtext.equals("November 2026")) {                 //we want november 2026 //if current month is november then it will break
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();   //forward button is clicked
			}
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")); //table values are storred in a list
		for(WebElement dateselement:dates) {                
			String date=dateselement.getText();
			System.out.print(date);
			if(date.equals("13")) {
				dateselement.click();
				
			}
		}
		
		
		
		
//		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
//		
	}

}
