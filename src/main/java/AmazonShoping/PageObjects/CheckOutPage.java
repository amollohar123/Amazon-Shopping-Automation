package AmazonShoping.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonShoping.AbstractComponents.AbstractComponents;

public class CheckOutPage extends AbstractComponents {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String CountryName = "India";
	String fullname = "Amol Lohar";
	String phonenumber = "8686262692";
	String pincode = "404212";
	String addressline1 = "plot no 1, warje,Pune";
	String addressline2 = "Lane no=1";
	String Landmark = "Tapodham parisar";
	String city_town = "warje";
	String State = "MAHARASHTRA";

	By fullNa = By.cssSelector("span[id='address-ui-widgets-countryCode'] span[role='button']");

	@FindBy(css = ".a-dropdown-item")
	List<WebElement> countryList;

	@FindBy(id = "address-ui-widgets-enterAddressFullName")
	WebElement FullName;

	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
	WebElement PhoneNumber;

	@FindBy(id = "address-ui-widgets-enterAddressPostalCode")
	WebElement PinCode;

	@FindBy(id = "address-ui-widgets-enterAddressLine1")
	WebElement AddressLine1;

	@FindBy(id = "address-ui-widgets-enterAddressLine2")
	WebElement AddressLine2;

	@FindBy(id = "address-ui-widgets-landmark")
	WebElement LandMark;

	@FindBy(id = "address-ui-widgets-enterAddressCity")
	WebElement City_Town;

	@FindBy(xpath = "(//span[@role='button'])[2]")
	WebElement StateButtn;

	@FindBy(xpath = "//li/a")
	List<WebElement> StateList;

	@FindBy(css = "input[aria-labelledby='address-ui-widgets-form-submit-button-announce']")
	WebElement useThisAddButton;

	public void countrySelection(String CountryName) {
		waitForElementToAppear(By.cssSelector(".a-button-text.a-declarative"));
		driver.findElement(By.cssSelector(".a-button-text.a-declarative")).click();
		WebElement country1 = countryList.stream().filter(country -> country.getText().equalsIgnoreCase(CountryName))
				.findFirst().orElse(null);
		country1.click();
		System.out.println(country1);
	}

	public void StateSelection(String StateName) {
		StateButtn.click();
		WebElement State = StateList.stream().filter(state -> state.getText().equalsIgnoreCase(StateName)).findFirst()
				.orElse(null);
		State.click();
	}

	public void InputAddress() {
		waitForElementToAppear(fullNa);
		countrySelection(CountryName);
		waitForElementToAppear(By.id("address-ui-widgets-enterAddressFullName"));
		FullName.sendKeys(fullname);
		waitForElementToAppear(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		PhoneNumber.sendKeys(phonenumber);
		waitForElementToAppear(By.id("address-ui-widgets-enterAddressPostalCode"));
		PinCode.sendKeys(pincode);
		waitForElementToAppear(By.id("address-ui-widgets-enterAddressLine1"));
		AddressLine1.sendKeys(addressline1);
		waitForElementToAppear(By.id("address-ui-widgets-enterAddressLine2"));
		AddressLine2.sendKeys(addressline2);
		waitForElementToAppear(By.id("address-ui-widgets-landmark"));
		LandMark.sendKeys(Landmark);
		waitForElementToAppear(By.id("address-ui-widgets-enterAddressCity"));
		City_Town.sendKeys(city_town);
		StateSelection(State);
		waitForElementToDisappear(By.cssSelector(".a-lgtbox-vertical-scroll"));
		//useThisAddButton.click(); //This permenantly save address 
	}

}
