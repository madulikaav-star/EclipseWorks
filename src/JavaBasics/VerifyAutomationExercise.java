package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAutomationExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		String actualtitle=driver.getTitle();
		if(actualtitle.equals("automation exercise")) {
			
		System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		String actualurl=driver.getCurrentUrl();
		
		if(actualurl.equals("https://automationexercise.com/login")) {
		System.out.println("correct url");
		}
		else{
		System.out.println("incorrect url");
		}
		
		String src=driver.getPageSource();       //checks if a particular text exists
		
		if(src.contains("abcd")) {     //checks the correct cases too
			System.out.println("text contains");
		}
		else {
			System.out.println("text does not contains");
		}

	}

}
