package junitBasics;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchBarVerf {
	WebDriver driver=new ChromeDriver();
	String url="https://www.google.com";
	@Before
	public void envSetup() {
		driver.get("https://www.google.com");                     //4 ways to search in google search bar
	}
//	@Test
//	public void googleSearch() {
//		driver.findElement(By.name("q")).sendKeys("books");             //this will search books and press the google search button
//		
//		driver.findElement(By.name("btnK")).click();
//	}
	@Test                                                            
	public void googlesearch2() {
		WebElement search=driver.findElement(By.name("q"));             //this will search books and select from the suggestion drop down
		search.sendKeys("books");
		search.submit();
	}
//	@Test
//	public void googlesearch3() {
//		WebElement search=driver.findElement(By.name("q"));              //this will search the books and press the enter
//		search.sendKeys("books",Keys.ENTER);
//	}
//	@Test
//	public void googlesearch4() {
//		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);        //shortest way to search and press enter
//	}

}
