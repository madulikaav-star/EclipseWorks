package junitBasics;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshotRediff {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void elementScreenshot() throws IOException {
		WebElement ele=driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://automation//ScreenshotsSele//fullnameField.png"));
	}

}
