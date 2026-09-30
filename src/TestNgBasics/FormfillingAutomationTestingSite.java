package TestNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormfillingAutomationTestingSite {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test(priority=1)
	public void titleVerf() {
		String actualtitle=driver.getTitle();
		String expectedtitle="Register";
		Assert.assertEquals(actualtitle,expectedtitle);
	}
	@Test(priority=2)
	public void currenturl() {
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://demo.automationtesting.in/Register.html/";
		Assert.assertEquals(actualurl, expectedurl);
		System.out.println("correct url");
	}
	@Test(priority=3)
	public void formFilling() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("madhu");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("A V");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Palakkad olavakkode");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("madulika.vinodh@ahalia.ac.in");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1234567890");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
//		driver.findElement(By.xpath(""))
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a")).click();    //hobbies
		
		  
		
		
		Select skill=new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"Skills\\\"]")));//skills
		skill.selectByValue("Configuration");
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		
		
	}

}
