package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		System.out.println("Cool testers");
		String exePath = "/Users/macbookpro/eclipse-workspace/SelJul23/driver/chromedriver";
		//// System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com.mx");		
	}
}
