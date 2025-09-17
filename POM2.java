package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM2 {

	
	@FindBy(name = "username")
	public static WebElement username;
	
	@FindBy(name="password")
	
	public static WebElement pwd2;
	
	
	@FindBy (xpath = "//button[@type=\"submit\"]" )
	public static WebElement login;
	
}
