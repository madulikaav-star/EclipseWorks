package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadingGuru {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void fileUploading() {
		
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Madhu\\Pictures\\Screenshots\\empty passw.png");  //uploaded a file
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();       //checked the check box
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();          //clicked the submit button
		
	}

}
