package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBaseSetup {

	WebDriver driver;
		
	
	@BeforeTest
	public void setup() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/registration/");
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void testTearDown(){
		
		driver.quit();
	}

	
}
