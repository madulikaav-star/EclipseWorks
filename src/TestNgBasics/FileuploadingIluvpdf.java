package TestNgBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadingIluvpdf {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@Test
	public void wordtopdf() throws AWTException {
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileUploadCode("Documents\\pen test scenario.docx");               //method we created and the method is given below
		
		
		
	}
	public void fileUploadCode(String file) throws AWTException {
		StringSelection str=new StringSelection(file);                        //StringSelection class is called to handle file value
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);   //to copy the file to clipboard of our system
		
		Robot robot=new Robot();                                             //we use Robot class to paste the copied file from clip board to file name field of the window and enter it
		robot.delay(3000);           //to delay for 3 secs
		robot.keyPress(KeyEvent.VK_CONTROL);        //to control the keys to copy and paste
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
