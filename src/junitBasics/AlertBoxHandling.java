package junitBasics;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertBoxHandling {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("file:///C:/Users/Madhu/OneDrive/Desktop/alertbox.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void alertbox() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();              //we will get unhandled exception error if we dont use the below 2 lines
		Alert a=driver.switchTo().alert();                             //switch to alert window
		                                             
		String alerttext=a.getText();                              //to get the text written in the alert box
		if(alerttext.equals("")) {                       // to check whether the text in the alert is same as the given text in the code 
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		a.accept();                                      //to click ok in the alert box
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("madhu");     //firstname
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("lika");       //lastname
		driver.findElement(By.xpath("/html/body/input[4]")).click();                //submit
		
	}

}

