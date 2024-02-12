package AmazonShoping.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonShoping.AbstractComponents.AbstractComponents;

public class ProductPage extends AbstractComponents {

	WebDriver driver;
	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".a-size-base-plus")
	List<WebElement> SearchList;
	
	public void SearchListIterator(String productName) {
		for(int i=0;i<SearchList.size();i++) {
			if(SearchList.get(i).getText().equalsIgnoreCase(productName)) {
				SearchList.get(i).click();
				break;
			}
		}
	}
}
