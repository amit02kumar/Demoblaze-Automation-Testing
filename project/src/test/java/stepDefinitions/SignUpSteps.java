package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {

	private WebDriver driver;

	@Given("Open the browser")
	public void Open_the_browser() throws InterruptedException {
	 System.out.println("Inside step - open the browser");

	System.setProperty("webdriver.gecko.driver","C:\\Users\\INDIA\\eclipse-workspace\\project\\driver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 
	 //Maximize the window
	 driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	Thread.sleep(3000);
	}
	
	@Given("The user is on the signup page")
	public void The_user_is_on_the_signup_page() {
		driver.findElement(By.cssSelector("#signin2")).click();
	}
	
	@When("The user enters username and password")
	public void The_user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.cssSelector("#sign-username")).sendKeys("amit@ku12345678");
		driver.findElement(By.cssSelector("#sign-password")).sendKeys("Pwxd@password");
		Thread.sleep(3000);
	}
	
	@Then("User clicks on signup button")
	public void User_clicks_on_signup_button() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick='register()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
	}
	
	@And("User wants to login now")
	public void User_wants_to_login_now() throws InterruptedException {
		driver.findElement(By.cssSelector("#login2")).click();
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("Amit@aaa12345678");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("Pwd@password");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#logout2")).isDisplayed();
		}
	
	@And("Click on the logout button")
	public void Click_on_the_logout_button() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("#logout2")).isDisplayed();
		driver.findElement(By.cssSelector("#logout2")).click();
		Thread.sleep(3000);
	}
	@Then("Close browser")
	public void Close_browser() {
		driver.quit();
	}
	
}
