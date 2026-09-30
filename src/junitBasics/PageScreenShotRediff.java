package junitBasics;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PageScreenShotRediff {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void PageScreenshot() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://automation//ScreenshotsSele//RediffRegPage.png"));
	}
}
