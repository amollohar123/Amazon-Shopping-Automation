package AmazonShoping.AbstractComponents;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {

	WebDriver driver;

	public AbstractComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
	}

	public void waitImplicitly() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public WebDriverWait waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		return wait;
	}

	public WebDriverWait waitForElementToDisappear(By findBy) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
		return wait;
	}

	public void switchTab() {
		ArrayList<String> SwitchTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(SwitchTab.get(1));
	}

}
