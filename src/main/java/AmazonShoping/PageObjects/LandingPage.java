package AmazonShoping.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonShoping.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void goTo() {
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
	}
	
	
		@FindBy(css="input[placeholder='Search Amazon.in']")
		WebElement SearchField;
		
		@FindBy(id="nav-search-submit-button")
		WebElement SearchButton;

		public void searchProduct(String product) {
			SearchField.sendKeys(product);
			SearchButton.click();
		}
}
