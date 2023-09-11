package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_Soft_Assertion {
  @Test
  public void Tc1() {
	  
	  SoftAssert softassert = new SoftAssert();
	  
	  System.out.println("Cool testers");
	  String exePath = "/Users/macbookpro/eclipse-workspace/SelJul23/driver/chromedriver";
	  //// System.setProperty("webdriver.chrome.driver", exePath);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");	
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Swag Labs";
	  String badTitle = "swagLabs";
	  
	  softassert.assertEquals(actualTitle,  expectedTitle);
	  softassert.assertEquals(actualTitle,  badTitle);
	  
	  softassert.assertAll();
	  
	  driver.close();//Cerrar ventana/pestaña actual que el webdriver este usando
	  
  }
}
