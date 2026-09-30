package TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsBasicCopyandPaste {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlsetup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void copyandpaste() {                          //to copy from fullname field and paste it in rediffmail field
		WebElement fullname=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input"));         //locate fullname field
		
		WebElement rediffmail=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input"));        //locate rediffmail field
		
		fullname.sendKeys("madhu");                                          //to write something in fullname field
		Actions act=new Actions(driver);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a");                //to select from fullname field
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c");                  //copy the selected text from fullname
		act.keyDown(rediffmail,Keys.CONTROL).sendKeys("v");                //to paste the copied text in the rediffmail field
		
		act.build().perform();                                   //to perform this action
		
	}
	
	

}
