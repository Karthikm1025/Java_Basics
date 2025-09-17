package testNgExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Parallel_Assertion {
	WebDriver driver;
//	@Test
//	public void openAmazon() {
//		System.setProperty("WebDriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
//		 driver = new EdgeDriver();
//		 driver.get("https://www.amazon.in/");
//	}
//	@Test
//	public void openBing() {
//		System.setProperty("WebDriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
//		 driver = new EdgeDriver();
//		driver.get("https://www.bing.com/");
//	}
	@Test
	public void checkAssertion() {
		
		String name = "Karthik";
		Assert.assertEquals(name, "karthik");
		
	}
}
