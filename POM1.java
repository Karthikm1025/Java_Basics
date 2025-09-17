package pageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM1 {

	
	public static WebElement username (WebDriver driver) {
		
	return	driver.findElement(By.name("username"));
		
	}
	
	public static WebElement pwd (WebDriver driver) {
		
	return	driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton (WebDriver driver) {
		
	return	driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
	}
	
}
