package testNgExamples;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitCreation {
WebDriver driver;
long startTime;
long endTime;
	
	@BeforeSuite
	public void starter() {
		startTime = System.currentTimeMillis();
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
		 driver = new EdgeDriver();
		
	}

    @Test
	public void openGoogle() {
				
		driver.get("https://www.google.com/");
		//driver.quit();
	//	long endTime = System.currentTimeMillis();	
	}
    @Test
	 public void openYahoo() {
		//long startTime = System.currentTimeMillis();

//		System.setProperty("WebDriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.yahoo.com/");
	//	driver.quit();
		//long endTime = System.currentTimeMillis();
	}
	@Test
	public void openBing() {
		//long startTime = System.currentTimeMillis();

//		System.setProperty("WebDriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/");
	//	driver.quit();
		//long endTime = System.currentTimeMillis();
		
	//long totalTime = startTime-endTime;
	//	System.out.println("Time taken" + totalTime);
	}
//initial time taken = 7518 milliseconds
	
	@AfterSuite
	public void closing() {
		driver.quit();
		endTime = System.currentTimeMillis();	
		long totaltime = endTime-startTime;
		System.out.println(totaltime);
	}
	
}
