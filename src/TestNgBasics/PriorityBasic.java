package TestNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityBasic {
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
	@Test (priority= -1)                                    //to prioritize before zero 
	public void titleverification() {
		System.out.println("title verified");
	}
	public void buttonverifictaion() {                          //zero is the first priority
		System.out.println("button verified");
	}
	@Test (priority=2)                                      //to prioritize after zero
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
