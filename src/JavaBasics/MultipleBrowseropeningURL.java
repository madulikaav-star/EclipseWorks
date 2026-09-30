package JavaBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowseropeningURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		EdgeDriver driver1=new EdgeDriver();
		driver.get("https://www.google.com");
		
		FirefoxDriver driver2=new FirefoxDriver();
		driver.get("https://www.amzaon.com");
		
		driver1.close();
		driver2.close();
	}

}
