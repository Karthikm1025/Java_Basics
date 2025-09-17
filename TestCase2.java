package dataDrivenExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	@Parameters({"username","pwd"})
	public void inCorrectPwd(String Username, String PWD) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(Username);
		WebElement  pwd = driver.findElement(By.xpath("//input[@type= 'password']"));
		pwd.sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	
	
}
