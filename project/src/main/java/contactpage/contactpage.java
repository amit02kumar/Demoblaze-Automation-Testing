package contactpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactpage {
	
	private WebDriver driver;
	
	//Locators
	private By contacts = By.xpath("//a[normalize-space()='Contact']");
	private By emailAdd = By.cssSelector("#recipient-email");
	private By entername = By.cssSelector("#recipient-name");
	private By mess = By.cssSelector("#message-text");
	private By button = By.cssSelector("button[onclick='send()']");
	
	//Constructor
			public contactpage(WebDriver driver) {
				this.driver = driver;
			}
	//method
		public void contact() {
			WebElement contactus = driver.findElement(contacts);
			contactus.click();
		}
		
		public void email() {
			WebElement emailaddress = driver.findElement(emailAdd);
			emailaddress.sendKeys("Amit@12355");
		}
		
		public void name() {
			WebElement name1 = driver.findElement(entername);
			name1.sendKeys("amit kumar");
		}
		
		
		public void message() {
			WebElement messagetext = driver.findElement(mess);
			messagetext.sendKeys("This is a message");
		}
		
		public void clickonButton() {
			WebElement click = driver.findElement(button);
			click.click();;
		}
}
