package prueba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ejemplo_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Cool testers");
		String exePath = "/Users/macbookpro/eclipse-workspace/SelJul23/driver/chromedriver";
		//// System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		
		
		WebElement userNameTxt = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("user-name")));

	}

}
