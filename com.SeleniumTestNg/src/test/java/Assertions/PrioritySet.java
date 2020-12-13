package Assertions;

import java.util.List;
import java.util.Iterator; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;




public class PrioritySet {
	
	@Test(priority=0)
	public void testcase1() throws InterruptedException 
	{	
		System.out.println("Test case1 - Enter login details");
		//Verify launch browser functionality
		System.setProperty("webdriver.chrome.driver", "C:\\Selinum project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Verify facebook url working as expected
		driver.get("https://www.facebook.com/");		
		Thread.sleep(3000);
		String title=driver.getTitle();		
		Assert.assertEquals(title, "Facebook – log in or sign up","Page title is not as expected");
		System.out.println(title +" Successfully displayed");
		
		//Check the login button is enabled and displayed
		WebElement loginButton = driver.findElement(By.name("login"));
		
		Assert.assertEquals(loginButton.isEnabled(), true,"login button is not enabled");
		System.out.println("chceck button is enabled :"+ loginButton.isEnabled());
		System.out.println("x axis :" + loginButton.getLocation().x);
		System.out.println("y axis :" + loginButton.getLocation().y);
		System.out.println("width :" + loginButton.getSize().width);
		System.out.println("height :" + loginButton.getSize().height);
		System.out.println("getTagName :" + loginButton.getTagName());
		System.out.println("getAttribute(title) :" + loginButton.getAttribute(title));
		System.out.println("getcssvalue(title) :" + loginButton.getCssValue(title));
		System.out.println("toString :" + loginButton.toString());
		System.out.println("hashCode :" + loginButton.hashCode());

		
		
//		WebElement CreateNewBtn = driver.findElement(By.linkText("Create New Account"));
		WebElement CreateNewBtn = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		CreateNewBtn.click();
		Thread.sleep(9000);
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> allele= driver.findElements(By.tagName("a"));
		System.out.println("total link count is :"+allele.size());
		
		System.out.println("first link name 16 is : " + allele.get(16).getText());
		
		//print all the links in the page
		System.out.println("Print all the URL name with Index values");
		System.out.println("=============================================");
		String url ="";
	      Iterator<WebElement> iterator = allele.iterator();
	      int i =0;
	      while (iterator.hasNext()) {
	    	  url = iterator.next().getText();
//	    	  System.out.println(url);
	    	  System.out.println("SNo " +i+": " +url);
	    	  i++;
	      }
		                              
		
		
//		String pg=driver.getPageSource();
//		System.out.println(pg);
		driver.navigate().back();
		Thread.sleep(9000);
		
		
				
		

		driver.quit();
	}
	@Test(priority=1)
	public void testcase2() 
	{
		System.out.println("Test case2 - Enter login details");


	}
	@Test(priority=2)
	public void testcase3() 
	{
		System.out.println("Test case3 - Account Creation");

	}
	@Test(priority=3)
	public void testcase4() 
	{
		System.out.println("Test case4 - Account Modify");

	}
	
	

}
