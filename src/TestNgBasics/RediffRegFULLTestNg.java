package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class RediffRegFULLTestNg {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void currenturl() {
		String url=driver.getCurrentUrl();
//		if(url.equals("https://register.rediff.com/register/register.php?FormName=user_details")) {
//			System.out.println("correct currenturl");
//		}
		Assert.assertEquals(url,"https://register.rediff.com/register/register.php?FormName=user_details" );
	}
	@Test
	public void titleverification() {
		String title=driver.getTitle();
		if(title.equals("Rediff")) {
			System.out.println("correct title");
		}
	}
	@Test
	public void textverf() {
		String src=driver.getPageSource();
		if(src.contains("Full name")) {
			System.out.println("text contains");
		}
	}
	@Test
	public void logoVerf() {
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Rediffmail']"));
		Boolean b=ele.isDisplayed();
		if(b) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo is not displayed");
		}
	}
	@Test (priority=1)
	public void fullname() {
		driver.findElement(By.xpath("//form[@name=\"register_mail\"]/div/div[2]/input")).sendKeys("madulika");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input")).sendKeys("madhu@123");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[4]/input")).click();
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[6]/div/input")).sendKeys("madhu@2003");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[7]/div/input")).sendKeys("madhu@2003");
		
		Select s=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[1]")));
		s.selectByIndex(7);
		Select s1=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]")));
		s1.selectByIndex(6);
		Select s2=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]")));
		s2.selectByIndex(11);
		
		Boolean b=(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]/input"))).isSelected();
		if(!b) {
			driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]/input")).click();
		}
		
		Select d=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[10]/select")));
		d.selectByValue("99");
		
		Select c=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[11]/div/select")));
		c.selectByValue("Bangalore");
		
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[14]/div/div/input")).sendKeys("madulika.vinodh@ahalia.ac.in");
		
//		Boolean bo=(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[15]/div/input"))).isSelected();
//		if(!b) {
//			driver.findElement(By.xpath("//form[@name='register_mail']/div/div[15]/div/input")).click();
//		}
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[17]/div/div/div[2]/input")).sendKeys("9526053731");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[20]/input")).click();
		
		
	}
	
	
	
	
	
}
