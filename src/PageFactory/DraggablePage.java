package PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DraggablePage {
	
	protected WebDriver driver;
	
	@FindBy(id="draggable")
	WebElement draggable;
	
	@FindBy(xpath=".//*[@id='sortablebox']/li[5]")
	WebElement drag5;
	
	@FindBy(xpath=".//*[@id='sortablebox']/li[5]")
	WebElement drag4;
	
	@FindBy(xpath=".//*[@id='sortablebox']/li[5]")
	WebElement drag3;
	
	@FindBy(xpath=".//*[@id='sortablebox']/li[5]")
	WebElement drag2;
	
	@FindBy(id="ui-id-5")
	WebElement gridTab;
	
	@FindBy(xpath=".//*[@id='draggable']/p")
	WebElement drgText;
	
	
	public DraggablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void navigateToGridTab(){
		
		gridTab.click();
	}
	
	public void dragElement() throws InterruptedException{
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(draggable, 160, 400).build().perform();
		Thread.sleep(2000);
		System.out.println(drgText.getText());
		
	}
	
	public void dragElement5() throws InterruptedException{
		
		Actions builder5 = new Actions(driver);
		builder5.dragAndDropBy(drag5, 0, -100).build().perform();
		Thread.sleep(1000);
	}
	
	public void dragElement4() throws InterruptedException{
		
		Actions builder5 = new Actions(driver);
		builder5.dragAndDropBy(drag4, 0, -80).build().perform();
		Thread.sleep(1000);
	}
	
	public void dragElement3() throws InterruptedException{
		
		Actions builder5 = new Actions(driver);
		builder5.dragAndDropBy(drag3, 0, -50).build().perform();
		Thread.sleep(1000);
	}
	
	public void dragElement2() throws InterruptedException{
		
		Actions builder5 = new Actions(driver);
		builder5.dragAndDropBy(drag2, 0, -30).build().perform();
		Thread.sleep(1000);
	}
	
	public void scrollCheck(){
		
		boolean scrollBarPresentVertical = (boolean) ((JavascriptExecutor)driver).executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight;");
		boolean scrollBarPresentHorizontal = (boolean) ((JavascriptExecutor)driver).executeScript("return document.documentElement.scrollWidth>document.documentElement.clientWidth;");
		if (scrollBarPresentHorizontal == true)
			System.out.println("Horizontal Scrollbar is present on page.");
		else
			System.out.println("Horizontal is not present on page.");
		
		if(scrollBarPresentVertical == true)
			System.out.println("Vertical Scrollbar is present on page.");
		else
			System.out.println("Vertical Scrollbar is not present on page.");
		
	}

}
