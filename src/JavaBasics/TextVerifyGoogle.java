package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerifyGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();       //checks if a particular text exists
		
		if(src.contains("Google Search")) {     //checks the correct cases too
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		

	}

}
