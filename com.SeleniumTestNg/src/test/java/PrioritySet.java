

import org.testng.Assert;
import org.testng.annotations.Test;


public class PrioritySet {
	
	@Test(priority=1)
	public void testcase1() 
	{
		System.out.println("Test case1 - Launch browser with url");

	}
	@Test(priority=3)
	public void testcase2() 
	{
		System.out.println("Test case2 - Enter login details");

	}
	@Test(priority=2)
	public void testcase3() 
	{
		System.out.println("Test case3 - Account Creation");

	}
	@Test(priority=0)
	public void testcase4() 
	{
		System.out.println("Test case4 - Account Modify");

	}
	
	

}
