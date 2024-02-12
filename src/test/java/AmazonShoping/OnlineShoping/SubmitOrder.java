package AmazonShoping.OnlineShoping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AmazonShoping.AbstractComponents.AbstractComponents;
import AmazonShoping.PageObjects.CartPage;
import AmazonShoping.PageObjects.CheckOutPage;
import AmazonShoping.PageObjects.LandingPage;
import AmazonShoping.PageObjects.ProductDetailPage;
import AmazonShoping.PageObjects.ProductPage;
import AmazonShoping.PageObjects.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SubmitOrder {
	@Test
	public void submitOrder() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		LandingPage landingpage = new LandingPage(driver);
		landingpage.goTo();
		String productname = "Yamaha classic guitar";
		landingpage.searchProduct(productname);
		AbstractComponents Abstractcomponent = new AbstractComponents(driver);
		Abstractcomponent.ScrollDown();
		String productName = "Yamaha F370 Acoustic Guitar, Natural";
		ProductPage productpage = new ProductPage(driver);
		productpage.SearchListIterator(productName);
		Abstractcomponent.switchTab();
		ProductDetailPage productDetailPage = new ProductDetailPage(driver);
		productDetailPage.extendWarranty();
		productDetailPage.addToCart();
		productDetailPage.goToCartPage();
		CartPage cartpage = new CartPage(driver);
		cartpage.ProceedToPayment();
		SignInPage signPage = new SignInPage(driver);
		signPage.SignIn();
		CheckOutPage checkoutpage = new CheckOutPage(driver);
		checkoutpage.InputAddress();
		driver.quit();
	}
}
