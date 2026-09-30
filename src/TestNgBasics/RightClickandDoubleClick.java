package TestNgBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickandDoubleClick {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void Rightclick() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		act.contextClick(edit).perform();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
		WebElement el=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(el).perform();
		WebElement cut=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]"));
		act.contextClick(cut).perform();
		Thread.sleep(1000);
		Alert b=driver.switchTo().alert();
		b.accept();
		
		WebElement elem=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(elem).perform();
		WebElement copy=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]"));
		act.contextClick(copy).perform();
		Thread.sleep(1000);
		Alert c=driver.switchTo().alert();
		c.accept();
		
		WebElement eleme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(eleme).perform();
		WebElement paste=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]"));
		act.contextClick(paste).perform();
		Thread.sleep(1000);
		Alert d=driver.switchTo().alert();
		d.accept();
		
		WebElement elemen=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(elemen).perform();
		WebElement delete=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[5]"));
		act.contextClick(delete).perform();
		Thread.sleep(1000);
		Alert e=driver.switchTo().alert();
		e.accept();
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(element).perform();
		WebElement quite=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[7]"));
		act.contextClick(quite).perform();
		Thread.sleep(1000);
		Alert f=driver.switchTo().alert();
		f.accept();
		
		WebElement dc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dc).perform();
		Thread.sleep(1000);
		Alert z=driver.switchTo().alert();
		z.accept();
		
	}
	

}
