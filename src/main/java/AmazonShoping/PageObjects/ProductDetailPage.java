package AmazonShoping.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonShoping.AbstractComponents.AbstractComponents;

public class ProductDetailPage extends AbstractComponents{

	WebDriver driver;
	public ProductDetailPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="mbb-offeringID-1")
	WebElement warranty;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(css=".nav-cart-count")
	WebElement cartButton;
	
	public void extendWarranty() {
		
		warranty.click();
		
	}

	public void addToCart() {
		
		addtocart.click();
	}

	public void goToCartPage() {
		
		cartButton.click();
	}
	
}
