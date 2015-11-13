package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TooltipPage {
	
	protected WebDriver driver;
	
	@FindBy(id="age")
	WebElement age;
	
	public void moveToTooltip() throws InterruptedException {
		
		Actions action = new Actions(driver);		
		action.moveToElement(age).build().perform();
		action.clickAndHold(age).perform();
		Thread.sleep(3000);
		
	}
	
	public TooltipPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

}
