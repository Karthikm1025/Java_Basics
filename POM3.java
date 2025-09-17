package pageObjectModel;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class POM3 {

	public static WebElement username;
	
	public static WebElement password;
	
	public static WebElement submit;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.edgedriver","C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, POM3.class);
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submit.click(); // this method will not work because for this element there is no Name and id attribute 
		// due to this it will not fetch the element and send the action 
	}
	
	
}
