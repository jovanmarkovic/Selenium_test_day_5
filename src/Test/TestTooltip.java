package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.TooltipPage;

public class TestTooltip {
	
	WebDriver driver;
	TooltipPage objTooltip;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		
		driver = new FirefoxDriver();
		
	    /*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\Chrome");
        WebDriver driver = new ChromeDriver();*/
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Drivers\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver(); */
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/tooltip/");
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test_slide() throws InterruptedException{
		
		objTooltip = new TooltipPage(driver);
		objTooltip.moveToTooltip();
			
		}

}
