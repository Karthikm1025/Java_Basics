package testNgExamples;

import org.testng.annotations.Test;

public class TestNgExamples {

	@Test(enabled = true)
	public void method1() {
		
		System.out.println("executed frist method");
		}
	@Test(dependsOnMethods = "method1")
	public void mehtod2() {
		System.out.println("executed second method");
	}
   @Test(dependsOnMethods = "mehtod2")
	public void mthod3() {
		System.out.println("executed mthod3");
	}
	
}
