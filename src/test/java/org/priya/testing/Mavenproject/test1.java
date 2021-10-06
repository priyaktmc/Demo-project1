package org.priya.testing.Mavenproject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
	
	@Test
	public void verifyTitle(){		
	
		System.setProperty("webdriver.chrome.driver","E:\\java softwares\\chromedriver.exe");
		Logger log=Logger.getLogger("rootLogger");		
		log.debug("driver class loaded");
		WebDriver driver = new ChromeDriver();
		// Object is created- Chrome browser is opened
		log.debug("window maimise");
		driver.manage().window().maximize();
		
	driver.get("https://www.amazon.in");
	
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	System.out.println("Assert passed");
	
	driver.close();
	}
}
