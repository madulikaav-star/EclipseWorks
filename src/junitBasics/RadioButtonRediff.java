package junitBasics;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonRediff {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void radiobuttonverf() {
		WebElement ele=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[9]/div/label[2]/input"));
		Boolean b=ele.isSelected();
		if(!b) {
			ele.click();
		}
	}

}
