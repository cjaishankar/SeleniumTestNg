package javaSaleniumTrainingDay1;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Facebk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinum project\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();		
		wd.get("https://www.facebook.com");
		Thread.sleep(300);
		String title1= wd.getTitle();
		
		System.out.println(title1);
		Assert.assertEquals("Facebook – log in or sign up", title1, "not as epected title");
		wd.quit();
	}

}
