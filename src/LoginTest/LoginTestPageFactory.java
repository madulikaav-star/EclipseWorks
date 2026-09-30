package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LoginPage.LoginLocatorsActions;
import LoginPage.LoginLocatorsPageFactory;

public class LoginTestPageFactory {
	WebDriver driver;
	@BeforeTest
	public void envSetup() {
	driver=new ChromeDriver();         
	driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void Login() {
		LoginLocatorsPageFactory lp=new LoginLocatorsPageFactory(driver); //object created to that class where locators and actions are given
		lp.fieldValues("student", "Password123");     //methods are called //arguments are passed in both the parameters of this method
		lp.submitclick();
		lp.logoutclick();
	}

}
