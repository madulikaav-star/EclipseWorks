package junitBasics;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTxtRediff {
	WebDriver driver= new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void ButtonTextVerf() {
		WebElement ele=driver.findElement(By.id("Register"));        //if id or name or anything cant be seen but value can be seen.
		String txt=ele.getAttribute("Value");         //to access the value in attribute "value" in inspect
		System.out.println(txt);
	}

}
