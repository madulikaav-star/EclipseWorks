package junitBasics;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofetchLinksGooglePage {
	WebDriver driver=new ChromeDriver();
	String url="https://www.google.com";
	@Before
	public void envSetup() {
		driver.get("https://www.google.com");                   
	}
//	@Test
//	public void linkfetching() {
//		List<WebElement> li=driver.findElements(By.tagName("a"));
//		System.out.println("list count = "+li.size());
//		
//		for(WebElement ele:li) {
//			String links=ele.getAttribute("href");
//			String linktexts=ele.getText();
//			System.out.println(linktexts+"--"+links);
//		}
//	}
	@Test
	public void linkfetching1() {
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("list count = "+li.size());
		
		for(int i=0;i<li.size();i++) {
			WebElement s=li.get(i);
			String links=s.getAttribute("href");
			String linktexts=s.getText();
			System.out.println(linktexts+"--"+links);
		}
	}

}
