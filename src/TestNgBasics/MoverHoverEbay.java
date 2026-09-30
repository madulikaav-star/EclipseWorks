package TestNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoverHoverEbay {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void MouseHOver() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li[4]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement el=driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li[4]/div[2]/div/nav/ul/li[2]/span/a"));
		act.contextClick(el).perform();
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/section[2]/section[1]/div/ul/li[2]/span/a"))).click();
		
	}

}
