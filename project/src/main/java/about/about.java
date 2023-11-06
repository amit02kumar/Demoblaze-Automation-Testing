package about;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class about {
	
	public WebDriver driver;
	
	//Locators
	private By about = By.xpath("//a[normalize-space()='About us']");
	private By playvideo = By.cssSelector(".vjs-poster");
	private By close = By.cssSelector("div[id='videoModal'] div[class='modal-footer'] button[type='button']");

	// Constructor
	public about(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}

    //method
	public void clickabout() {
		WebElement about1 = driver.findElement(about);
		about1.click();
	}

	public void video() {
		WebElement video1 = driver.findElement(playvideo);
		video1.click();
	}

	public void closeAbout() {
		WebElement close1 = driver.findElement(close);
		close1.click();
	}

}
