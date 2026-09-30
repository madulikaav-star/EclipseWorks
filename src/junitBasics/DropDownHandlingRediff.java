package junitBasics;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingRediff {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test                                                                                   //3 methods to select from dropdown
	public void dropDownHnadling() {
//		WebElement ele=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select"));         //first the selected dropdown is stored in ele
//		Select s =new Select(ele);                             //Select is an imported class
//		s.selectByValue("13");
		
		
		Select s=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select")));     //without storing in ele//directly
//		s.selectByVisibleText("09");
		s.selectByIndex(7);
		
		
		Select s1=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[2]")));               //to select a month
		s.selectByVisibleText("OCT");
		
		Select s2=new Select(driver.findElement(By.xpath("//form[@name='register_mail']/div/div[8]/select[3]")));               //to select an year
		s.selectByIndex(3);
		
	}

}
