package Assertions;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert softAsset = new SoftAssert();
	@Test
	public void test1() 
	{
		System.out.println("Opend browser");
		Assert.assertEquals(true, true);	
		
		System.out.println("Enter user id");		
		System.out.println("Enter password");
		
		System.out.println("click on signin");
		Assert.assertEquals("Signin", "Signin","lable name changed");
		
		System.out.println("Validate home page successfull");
		softAsset.assertEquals("HP Networking", "Dxc Networking","Title not as expected");
		
		System.out.println("Enter customer details");
		softAsset.assertEquals("HP enter screen", "DXC enter screen","details are not as expected");
		
		System.out.println("HPE EUA screem");
		softAsset.assertEquals("HP EUA screen", "HPe EUA screen","EUA not as expected");
		
		System.out.println("Confirmation screen");
		Assert.assertEquals(true, true,"confrimation scree not expected");
		
		softAsset.assertAll();
		
	}


	
	

}
