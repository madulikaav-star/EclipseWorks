package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DragAndDrop {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void dragandDrop() throws InterruptedException {
		WebElement sourcee=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement targett=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDrop(sourcee, targett).perform();
		String expected=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		String actual="Dropped!";
//		if(expected.equalsIgnoreCase(actual)){
//			System.out.println("it is dropped");
//		}
//		else {
//			System.out.println("it is not dropped");
//		}
		
		Assert.assertEquals(expected, actual);
		
	}

}
