package pageObjectModel;

import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestData {

	@Test
	public void loginHrm2() throws InterruptedException {
	System.setProperty("Webdriver.edgedriver","C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	
//	POM1.username(driver).sendKeys("Admin");
//	POM1.pwd(driver).sendKeys("admin123");
//	POM1.loginButton(driver).click();
	
//	PageFactory.initElements(driver, POM2.class);
//	
//	POM2.username.sendKeys("Admin");
//	POM2.pwd2.sendKeys("admin123");
//	POM2.login.click();
	
	
	
	
	
	
	
	
//	driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	
  
	
	
	
	
	
	
	
	}	
}
