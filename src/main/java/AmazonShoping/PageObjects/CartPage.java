package AmazonShoping.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonShoping.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="sc-buy-box-ptc-button")
	WebElement proceedTopayment;
	
	public void ProceedToPayment() {
		proceedTopayment.click();
	}
}
