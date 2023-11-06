package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import LoginPage.loginPage;
import about.about;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstep{
	
	public WebDriver driver;
	public loginPage loginpage;
	
	/* @Before
	public void setup() {
		driver=new ChromeDriver();
	}
	*/
	/*@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		} 
	} */
	
@Given("Launch the browser")
public void Launch_the_browser() throws InterruptedException {
	 System.out.println("Inside step - open the browser in new window");

	 //WebDriver driver= WebDriverManager.firefoxdriver().create();
	System.setProperty("webdriver.gecko.driver","C:\\Users\\INDIA\\eclipse-workspace\\project\\driver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	loginpage = new loginPage(driver);
	 
	 //Maximize the window
	 driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
}

@Given("I am on the DemoBlaze login page")
public void i_am_on_the_demo_blaze_login_page() throws InterruptedException {
	driver.findElement(By.cssSelector("#login2")).click();
}

@Given("I have entered a valid username and password")
public void i_have_entered_a_valid_username_and_password() {
	loginpage.enterUsername("amit@12345");
	loginpage.enterPassword("pwd@12345");
}

@When("I click on the login button")
public void i_click_on_the_login_button() throws InterruptedException {
	loginpage.clickLoginButton();
}

@Then("I should be logged in successfully")
public void i_should_be_logged_in_successfully() throws InterruptedException {
	Thread.sleep(3000);
	Assert.assertEquals(loginpage.checkLogoutButton(),true);
}

@And("I clicked on the logout button")
public void i_clicked_on_the_logout_button() throws InterruptedException {
	Thread.sleep(3000);
	loginpage.clickLogoutButton();
	Thread.sleep(3000);
}
@Then("close browser")
public void close_browser() {
	driver.quit();
}
}
