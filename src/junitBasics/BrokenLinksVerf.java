package junitBasics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksVerf {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://www.luminartechnolab.com");
	}
	@Test
	public void brokenLinks() {
		List<WebElement> li= driver.findElements(By.tagName("a"));
		System.out.println("total links = "+li.size());
		for(WebElement data:li) {
			String links=data.getAttribute("href");
			String linktext=data.getText();
			System.out.println(linktext+"=="+links);
			verify(links);
		}
		
	}
	public void verify(String u) {
		try {
		URL ul=new URL(u);
		HttpURLConnection con=(HttpURLConnection) ul.openConnection();
		con.setConnectTimeout(3000);
		con.connect();
		
		if(con.getResponseCode()==200) {
			System.out.println("valid"+ul);
		}
		else {
			System.out.println("invalid"+ul);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
