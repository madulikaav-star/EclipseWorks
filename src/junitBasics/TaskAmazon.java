package junitBasics;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAmazon {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://www.amazon.in/");
	
	}
	
	
	
	
	@Test
	public void amazon() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);      //search mobiles in search bar
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']")).click();         //click account list link
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("madhu@123",Keys.ENTER);      //type invalid email in the email field
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[5]/div/a")).click();        //
		driver.findElement(By.id("nav-cart")).click();
		
		driver.findElement(By.xpath("//div[@class='nav-left']/a")).click();
		
		driver.findElement(By.xpath("//*[@class='hmenu hmenu-visible']/section/ul/li[2]/a")).click();
		driver.navigate().back();
		driver.navigate().back();
		

}
}
