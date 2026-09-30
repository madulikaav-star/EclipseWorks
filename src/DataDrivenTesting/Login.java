package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	@BeforeTest
	public void Browserloading() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlsetup() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void login() throws IOException, InterruptedException {
		FileInputStream f=new FileInputStream("D:\\automation\\SampleLoginCred.xlsx");           //to access excel file from our system window
		XSSFWorkbook wb=new XSSFWorkbook(f);                                                //to open the excel in a workbook  //XSSF=xml spreadsheet format
		XSSFSheet sh=wb.getSheet("Sheet1");                         //to open that particular sheet 
		int row=sh.getLastRowNum();                                     //to get the number of rows
		System.out.println("no. of rows= "+row);
		
		for(int i=1;i<=row;i++) {                                    //i starts from 1 because we do no need the first row that is heading
			String username=sh.getRow(i).getCell(0).getStringCellValue();           //1st row//0th column//value of that cell
			System.out.println("username= "+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();              //1st row//1st column//value of that cell
			System.out.println("password= "+password);
			
			driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();                //clear the value inside the field if any 
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			
			
		}
		
	}

}
