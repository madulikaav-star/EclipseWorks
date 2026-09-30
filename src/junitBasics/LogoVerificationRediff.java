package junitBasics;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoVerificationRediff {
	WebDriver driver=new ChromeDriver();
	@Before
	public void envsetup() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void logoVerification() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Rediffmail']"));
		Thread.sleep(1000);
		boolean b=ele.isDisplayed();
		System.out.println(b);
	}

}
