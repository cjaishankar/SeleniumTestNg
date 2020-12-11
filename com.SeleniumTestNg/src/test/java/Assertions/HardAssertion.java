package Assertions;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardAssertion {
	
	
	@Test
	
	public void hardassert() 
	{
		
		System.out.println("Navigate to browser");
		Assert.assertEquals(true, true,"not as expected");
		System.out.println("Enter the User name and passsword");
		
		System.out.println("Login to software download screen");
		Assert.assertEquals("DXC software", "Hpe software","not as expected");
		
		System.out.println("download software");
		Assert.assertEquals("DXC login scree", "DXC login scree", "not as expected");
	}

}
