package prueba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_implicitWait {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.out.println("Cool testers");
		String exePath = "/Users/macbookpro/eclipse-workspace/SelJul23/driver/chromedriver";
		//// System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		
		driver.quit();

	}

}
