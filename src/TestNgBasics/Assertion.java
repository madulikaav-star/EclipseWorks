package TestNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlsetup() {
		driver.get("https://www.google.com");
	}
	@Test
	public void softAssertion() {
		String actaultitle=driver.getTitle();
		System.out.println("actual title is "+actaultitle);
		String expectedtitle="google";
		if(actaultitle.equalsIgnoreCase(expectedtitle)){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");                     //in this, even if the condition become fails,test passes
		}
		
	}
	@Test
	public void hardAssertion() {
		String actaulti=driver.getTitle();
		System.out.println("actual title is "+actaulti);
		String expectedti="google";
		Assert.assertEquals(expectedti,actaulti);  //if the condition fails, test will stop execution and next lines will not be printed
		System.out.println("helloo");
		
	}

}
