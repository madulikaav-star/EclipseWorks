package junitBasics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestBasic {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envSetup() {
		driver.get("https://www.google.com");
	}
	@Test
	public void titleVerification() {
		String actualtitle=driver.getTitle();
		if(actualtitle.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
	}
	@Test
	public void urlVerification() {
		String url=driver.getCurrentUrl();
		System.out.println("actualurl= "+url);
		if(url.equals("https://www.google.com")) {       // a backslash is missing so it shows incorrect url
			System.out.println("correct url");
		}
		else {
			System.out.println("incorrect url;");
		}
	}
	@Test
	public void TextVerification() {
		String src=driver.getPageSource();
		if(src.contains("About")) {
			System.out.println("text contains");
		}
		else {
			System.out.println("text does not contains");
		}
	}
	@After
	public void browserClose() {
		driver.close();   //to close the tabs
		// driver.quit();    //to quit from the browser
	}
	
}

