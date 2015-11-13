package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.DraggablePage;

public class TestDraggable {
	
	WebDriver driver;
	DraggablePage objDrag;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		
		driver = new FirefoxDriver();
		
	    /*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\Chrome");
        WebDriver driver = new ChromeDriver();*/
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Drivers\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver(); */
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/draggable/");
		Thread.sleep(2000);
		
	}
	
	@Test	
	public void test_drag_01() throws InterruptedException{
			
		objDrag = new DraggablePage(driver);
		objDrag.dragElement();
		objDrag.navigateToGridTab();
		objDrag.dragElement5();
		objDrag.dragElement4();
		objDrag.dragElement3();
		objDrag.dragElement2();
		objDrag.scrollCheck();
			
		}

	}

