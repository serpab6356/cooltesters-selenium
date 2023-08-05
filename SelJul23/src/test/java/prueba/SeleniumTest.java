package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hola Selenium");
		String exePath = "/Users/macbookpro/eclipse-workspace/SelJul23/driver/chromedriver";
		//System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//Obtener elementos
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement pwdTxt = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//Haciendo login
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(2000);
		pwdTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
	}

}
