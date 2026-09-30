package TestNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountBasic {
	@BeforeTest                                             
	public void envsetup() {
		System.out.println("browser loading..");
	}
	@BeforeMethod
	public void urlsetup() {
		System.out.println("url loading");
	}
	@Test (invocationCount=3)                                //executes 3 times
	public void currenturlverf() {                                       
		System.out.println("currect url");
	}
	@Test
	public void titleverification() {
		System.out.println("title verified");
	}
	public void buttonverifictaion() {
		System.out.println("button verified");
	}
	@AfterMethod
	public void tabClosing() {
		System.out.print("tab is closed");
	}
	@AfterTest
	public void browserClosing() {
		System.out.println("browser closing...");
	}


}
