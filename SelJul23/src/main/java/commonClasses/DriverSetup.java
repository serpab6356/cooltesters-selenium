package commonClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver setupDriver() {
		
		String exePath = "/Users/macbookpro/eclipse-workspace/SelJul23/driver/chromedriver";
		//System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
