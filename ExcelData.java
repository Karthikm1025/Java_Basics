package dataDrivenExamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ExcelData {

	WebDriver driver;
	
	String maindata[][]=null;


	@DataProvider(name="LoginDetails")
	public String[][] dataProvider() throws IOException {

		maindata=getExceldata1();

		return maindata;
	}

	
	//@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		
	}

	

	public static String[][] getExceldata1() throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\karthikmo\\Desktop\\Automation\\WebAutomation\\test-data\\Data2.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int NumberOfRows = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(NumberOfRows);

		//int numberOfCells = row.getPhysicalNumberOfCells();

		System.out.println(NumberOfRows);

		//	System.out.println(numberOfCells);

		String data[][]	= new String [4][2];
		for (int i = 0; i <NumberOfRows; i++) {
			XSSFRow row1 = sheet.getRow(i);

			for (int j = 0; j<row1.getPhysicalNumberOfCells(); j++) {

				String value = row1.getCell(j).toString();
				//System.out.println(value);

				data[i][j]=value;

			}

		}

		return data;

	}


	@Test(dataProvider="LoginDetails")
	public void LoginHrm (String Username, String PWD) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(Username);
		WebElement  pwd = driver.findElement(By.xpath("//input[@type= 'password']"));
		pwd.sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	//@AfterTest
	public void aftertest() {
		
		driver.quit();
	}
}
