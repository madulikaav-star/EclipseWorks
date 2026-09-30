package junitBasics;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTextpracticeSite {
	WebDriver driver= new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void ButtonTextVerf() {
		WebElement ele=driver.findElement(By.id("submit"));          //if id or name is given in the inspect
		String txt=ele.getText();                 // we can directly use this method
		System.out.println(txt);
	}

}
