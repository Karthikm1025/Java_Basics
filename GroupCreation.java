package testNgExamples;

import java.util.jar.Attributes.Name;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class GroupCreation {

	@Test(groups = {"bike"})
	public void Bajajbikes() {
		
		System.out.println("pulsar");
	}
	@Test(groups = {"scooter"})
	public void BajajScooter(String string) {
		
		System.out.println("MIT");
	}
	@Test(groups = {"scooter"})
	public void hondaScooter() {
		
		System.out.println("Activa");
		
	}
	@Test(groups = {"bike"})
	public void hondabikes() {
		System.out.println("Xblade");
	}
	@Test
	@Parameters("parameter")
	public void parameterization (String ouput) {
		
		System.out.println("ouput ->" + ouput);
		
	}
	
}
