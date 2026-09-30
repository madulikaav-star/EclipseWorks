package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocatorsPageFactory {
	WebDriver driver;
	
	@FindBy(name="username")            //instead of findElement
	WebElement username;              //creating reference            
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")
	WebElement logout;
	
	public LoginLocatorsPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fieldValues(String UN,String PSWD) {
		username.sendKeys(UN);
		password.sendKeys(PSWD);
		
	}
	public void submitclick() {
		submit.click();
	}
	public void logoutclick() {
		logout.click();
	}

}
