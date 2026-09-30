package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURLVerifyGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualurl=driver.getCurrentUrl();
		
		if(actualurl.equals("https://www.google.com")) {
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}

	}

}
