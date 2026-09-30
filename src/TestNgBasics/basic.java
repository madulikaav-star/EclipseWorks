package TestNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic {
	@BeforeTest                                             //executes only once that is at the beginning of the execution
	public void envsetup() {
		System.out.println("browser loading..");
	}
	@BeforeMethod
	public void urlsetup() {
		System.out.println("url loading");
	}
	@Test
	public void currenturlverf() {                                       //methods of @test are executed in alphabetical order
		System.out.println("currecturl verified");
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
	@AfterTest                                                      //executes only once that is at the end of the execution
	public void browserClosing() {
		System.out.println("browser closing...");
	}

}
