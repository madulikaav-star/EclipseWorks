package TestNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupBasic {                   //refer to groupstestng in testng file
	@BeforeTest
	public void envsetup() {
		System.out.println("browser loading..");
	}
	@BeforeMethod
	public void urlsetup() {
		System.out.println("url loading");
	}
	@Test (groups= {"sanity"})
	public void currenturlverf() {
		System.out.println("currecturl verified");
	}
	@Test (groups= {"smoke","regression"})         //we can include the method into 2 groups
	public void titleverification() {
		System.out.println("title verified");
	}
	@Test (groups="resression")
	public void buttonverifictaion() {
		System.out.println("button verified");
	}
	@Test (groups="smoke")
	public void dropDownVerf() {
		System.out.println("drop down verification");	
	}
	@Test (groups= {"sanity"})
	public void checkBoxVerif() {
		System.out.println("check box verff");
	}
	@Test 
	public void pagesource() {
		System.out.println("text veriff");
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
