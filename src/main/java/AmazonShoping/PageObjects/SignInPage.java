package AmazonShoping.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonShoping.AbstractComponents.AbstractComponents;

public class SignInPage extends AbstractComponents {

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String userEmail = "amullohar.9@gmail.com";
	String userPassword = "Amol@321";

	By emailTextField = By.id("ap_email");
	By passTextField = By.id("ap_password");

	@FindBy(id = "ap_email")
	WebElement email;

	@FindBy(id = "continue")
	WebElement ContinueButton;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement SignInButton;

	public void SignIn() {
		waitForElementToAppear(emailTextField);
		email.sendKeys("amullohar.9@gmail.com");
		ContinueButton.click();
		waitForElementToAppear(passTextField);
		password.sendKeys("Amol@321");
		SignInButton.click();
	}

}
