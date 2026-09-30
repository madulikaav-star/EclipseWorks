package junitBasics;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ButtonEnabledRediff {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void buttonEnabled() {
		Boolean b=driver.findElement(By.id("Register")).isEnabled();
		if(b) {
			System.out.println("button is enabled");
		}
		else {
			System.out.println("button is disabled");
		}
	}

}
