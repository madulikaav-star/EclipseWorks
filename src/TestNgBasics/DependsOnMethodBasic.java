package TestNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethodBasic {
	@BeforeTest
	public void envsetup() {
		System.out.println("browser loading..");
	}
	@BeforeMethod
	public void urlsetup() {
		System.out.println("url loading");
	}
	@Test
	public void currenturlverf() {
		System.out.println("currecturl verified");
	}
	@Test (priority= -1, dependsOnMethods = {"buttonverifictaion"})
	public void titleverification() {
		System.out.println("title verified");
	}
	public void buttonverifictaion() {
		System.out.println("button verified");
	}
	@Test (priority=2)
	public void dropDownVerf() {
		System.out.println("drop down verification");	}
		
	
	@AfterMethod
	public void tabClosing() {
		System.out.print("tab is closed");
	}
	@AfterTest
	public void browserClosing() {
		System.out.println("browser closing...");
	}


}
