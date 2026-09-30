package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		
		String expectedresult="Google";
		
		if(actualresult.equals(expectedresult)) {         //or we can use equalsIgnoreCase() to avoid checking the cases
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}

	}

}
