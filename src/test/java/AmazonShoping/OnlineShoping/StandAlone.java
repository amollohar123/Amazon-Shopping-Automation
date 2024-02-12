package AmazonShoping.OnlineShoping;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in");
	
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Yamaha classic guitar");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);");
		List<WebElement> productList=driver.findElements(By.cssSelector(".a-size-base-plus"));
		String productName="Yamaha F370 Acoustic Guitar, Natural";
		for(int i=0;i<=productList.size();i++) {
			if(productList.get(i).getText().equalsIgnoreCase(productName)) {
				productList.get(i).click();
				System.out.println(driver.getCurrentUrl());
				break;
			}
		}
		System.out.println(driver.getTitle());
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    System.out.println(driver.getTitle());
		    driver.findElement(By.id("mbb-offeringID-1")).click();
		    driver.findElement(By.cssSelector(".nav-cart-count")).click();
		    driver.findElement(By.xpath("(//span[@class='a-size-base-plus'])[1]")).click();
		    driver.findElement(By.id("ap_email")).sendKeys("amullohar.9@gmail.com");
		    driver.findElement(By.id("continue")).click();
		    driver.findElement(By.id("ap_password")).sendKeys("Amol@321");
		    driver.findElement(By.id("signInSubmit")).click();
		    List<WebElement> addedProds=driver.findElements(By.xpath("//li/span/a"));
		   
		    System.out.println(addedProds.get(1).getText());
		    System.out.println(addedProds.get(1).getText());
		  
		    driver.quit();
	}
}
