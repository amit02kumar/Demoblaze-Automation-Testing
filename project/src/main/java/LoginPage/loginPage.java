 package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	private WebDriver driver;
		
	//locators
	private By usernameInputLocator=By.cssSelector("#loginusername");
	private By passwordInputLocator=By.cssSelector("#loginpassword");
	private By login=By.cssSelector("button[onclick='logIn()']");
	private By logout=By.cssSelector("#logout2");

	//Constructor
	public loginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	
	//methods
	public void enterUsername(String username) {
		WebElement usernameInput= driver.findElement(usernameInputLocator);
		usernameInput.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		WebElement passwordInput= driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton() throws InterruptedException {
		WebElement loginButton = driver.findElement(login);
		loginButton.click();
		Thread.sleep(4000);
	}
	
	public boolean checkLogoutButton() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(logout).isDisplayed();	
		}

	public void clickLogoutButton() {
		WebElement logoutButton = driver.findElement(logout);
		logoutButton.click();
	}
	public void login(String username, String password) throws InterruptedException {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}

}

