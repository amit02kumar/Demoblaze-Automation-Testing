package cartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {

	private WebDriver driver;
	
	//locator
	private By product = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
	private By clickaddtoCart = By.xpath("//a[normalize-space()='Add to cart']");
	private By clickPlaceOrder = By.xpath("//button[normalize-space()='Place Order']");
	private By clickcart= By.xpath("//a[@id='cartur']");
	private By name= By.cssSelector("#name");
	private By country= By.cssSelector("#country");
	private By city= By.cssSelector("#city");
	private By credit= By.cssSelector("#card");
	private By month= By.cssSelector("#month");
	private By year= By.cssSelector("#year");
	private By purchaseitem= By.cssSelector("button[onclick='purchaseOrder()']");
	
	//Constructor
		public cartPage(WebDriver driver) {
			this.driver = driver;
		}
	//method
	public void products() {
		WebElement product1 = driver.findElement(product);
		product1.click();
	}
	
	public void addToCart() {
		WebElement cart = driver.findElement(clickaddtoCart);
		cart.click();
	}
	
	public void clickOnCart() {
		WebElement  clickedcart = driver.findElement(clickcart);
		clickedcart.click();
	}
	public void placeorder() {
		WebElement placeOrder = driver.findElement(clickPlaceOrder);
		placeOrder.click();
	}
	public void entername() {
		WebElement name1 = driver.findElement(name);
		name1.sendKeys("Amit kumar");
	}
	public void entercountry() {
		WebElement country1 = driver.findElement(country);
		country1.sendKeys("India");
	}
	public void entercity() {
		WebElement city1 = driver.findElement(city);
		city1.sendKeys("Pilani, Rajasthan");
	}
	public void card() {
		WebElement card1 = driver.findElement(credit);
		card1.sendKeys("75551-2145");
	}
	public void entermonth() {
		WebElement month1 = driver.findElement(month);
		month1.sendKeys("September");
	}
	public void enteryear() {
		WebElement year1 = driver.findElement(year);
		year1.sendKeys("2023");
	}
	
	public void purchase() {
		WebElement buy = driver.findElement(purchaseitem);
		buy.click();
	}
	
	
}

