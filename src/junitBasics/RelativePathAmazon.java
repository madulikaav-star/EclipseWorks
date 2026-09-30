package junitBasics;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativePathAmazon {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://www.amazon.in/");
	
	}
	@Test
	public void linkClick() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[4]/div/a")).click();
	}
}
