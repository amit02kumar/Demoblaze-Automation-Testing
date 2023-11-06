package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import LoginPage.loginPage;
import about.about;
import cartPage.cartPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class aboutsteps {

	private WebDriver driver;
	private about About;
	
	 @Given("Open the browser in new window")
	public void Open_the_browser_in_new_window() throws InterruptedException {
	 System.out.println("Inside step - open the browser in new window");
	 
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\INDIA\\eclipse-workspace\\project\\driver\\geckodriver.exe");
	 driver = new FirefoxDriver();

	 //Maximize the window
	 driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	About =new about(driver);
	Thread.sleep(3000);
	}
	 
	
	@Given("I want to click on the about")
	public void I_want_to_click_on_the_about() {
		About.clickabout();
	}
	
	@Then("I want to view the video")
	public void I_want_to_view_the_video() throws InterruptedException {
		Thread.sleep(3000);
		About.video();
		Thread.sleep(3000);
	}
	
	@And("I want to close the about")
	public void I_want_to_close_the_about() {
		About.closeAbout();
	}
	 @Then("close the browser")
	 public void close_the_browser() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.quit();
	 }
}
