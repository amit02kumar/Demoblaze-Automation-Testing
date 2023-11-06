package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import contactpage.contactpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class contactsteps {
	private WebDriver driver;
	private contactpage contactPage;

	@Given("open the browser")
	public void Open_the_browser() throws InterruptedException {
	 System.out.println("Inside step - open the browser");
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\INDIA\\eclipse-workspace\\project\\driver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	
	 //Maximize the window
	 driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	contactPage = new contactpage(driver);
	Thread.sleep(3000);
	}
	
	@And("I want to open contact")
	public void I_want_to_open_contact() throws InterruptedException {
		//WebElement contact= driver.findElement(By.xpath("//a[normalize-space()='Contact']"));
		//contact.click();
		//contactPage = new contactpage(driver);

		contactPage.contact();
		Thread.sleep(2000);
	}
	
	@Then("I want to fill the text box")
	public void I_want_to_fill_the_text_box() {
		//WebElement email = driver.findElement(By.cssSelector("#recipient-email"));
		//email.sendKeys("amit@12345");
		contactPage.email();
		//driver.findElement(By.cssSelector("#recipient-name")).sendKeys("amit kumar");
		contactPage.name();
		//driver.findElement(By.cssSelector("#message-text")).sendKeys("This is a message");
		contactPage.message();
	}
	
	@And("I want to click on send message")
	public void I_want_to_click_on_send_message() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button[onclick='send()']")).click();
		contactPage.clickonButton();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
	}
	
	@Then("Close the browser")
	public void Close_the_browser() {
		driver.quit();
	}
}
