package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLocatorsActions {              //reference-LoginTest package//LoginTestValues class
	WebDriver driver;
	//object repository
	By username=By.name("username");          //reference created to BY //located all the fields
	By password=By.name("password");
	By submit=By.id("submit");
	By logout=By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a");
	
	public LoginLocatorsActions(WebDriver driver) {       //a constructor is created to set driver details
		this.driver=driver;                                   //this parameter value is passed to instance variable above created                         
	}
	
	public void fieldValues(String UN,String PSWD) {            //methods are created//parameters should be passed from that class
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(UN);         //all the actions of fields are created
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(PSWD);
	}
	public void buttonClick() {
		driver.findElement(submit).click();                //another method to click the button
		
	}
	public void logoutButton() {
		driver.findElement(logout).click();
	}

}
