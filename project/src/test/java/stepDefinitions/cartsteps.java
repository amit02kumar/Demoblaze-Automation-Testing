package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cartPage.cartPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class cartsteps {
	private WebDriver driver;
	private cartPage cartpage;
	
	
	@Given("I want to click on the product")
	public void i_want_to_click_on_the_product() throws InterruptedException {
		 System.out.println("Inside step - open the browser");
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\INDIA\\eclipse-workspace\\project\\driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		cartpage = new cartPage(driver);
		cartpage.products();
	}

	@Then("I want to click on add to cart")
	public void i_want_to_click_on_add_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		cartpage.addToCart();
		Thread.sleep(3000);

	}
	@Then("I Want to handle the alert")
	public void I_Want_to_handle_the_alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("I want to go to the cart")
	public void I_want_to_go_to_the_cart() throws InterruptedException {
		cartpage.clickOnCart();
		Thread.sleep(3000);
	}
	
	@Then("I want to click place the order")
	public void I_want_to_click_place_the_order() throws InterruptedException {
		cartpage.placeorder();
		Thread.sleep(3000);
	}
	
	@Then("I Want to fill the TextBox")
	public void I_Want_to_fill_the_TextBox() throws InterruptedException {
		
		//to enter name
		cartpage.entername();
		
		//country
		cartpage.entercountry();

		//city
		cartpage.entercity();
		
		//credit- card
		cartpage.card();
		
		//month
		cartpage.entermonth();
		
		//year
		cartpage.enteryear();
		Thread.sleep(3000);
		
	}
	
	@And("I want to click on purchase")
	public void I_want_to_click_on_purchase() {
		cartpage.purchase();
	}
	
	@And("I want to click ok when it shows purchase is done")
	public void I_want_to_click_ok_when_it_shows_purchase_is_done() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ok = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
		ok.click();
		}

	@Then("I want to close the browser")
	public void I_want_to_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}




