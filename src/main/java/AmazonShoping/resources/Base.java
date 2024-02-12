//package AmazonShoping.resources;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Base {
//	WebDriver driver;
//	public WebDriver Initializer() {
//		Properties prop=new Properties();
//		FileInputStream fil;
//		try {
//			fil = new FileInputStream(System.getProperty("C:\\Users\\Amol\\eclipse-workspace\\OnlineShoping\\src\\main\\java\\AmazonShoping\\resources\\GlobalData.Properties"));
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			fil = new FileInputStream(System.getProperty("C:\\Users\\Amol\\eclipse-workspace\\OnlineShoping\\src\\main\\java\\AmazonShoping\\resources\\GlobalData.Properties"));
//			prop.load(fil);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String browserName=prop.getProperty("browser");
//		if(browserName.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		}
//		else if(browserName.equalsIgnoreCase("firefox")) {
//			System.setProperty("WebDriver.gecko.driver","path of driver");
//			driver=new FirefoxDriver();
//		}
//		else if(browserName.equalsIgnoreCase("edge")) {
//			System.setProperty("WebDriver.edge.driver","path of driver");
//			driver=new EdgeDriver();
//		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		return driver;
//	}
//	
//	
//	
//}
//
