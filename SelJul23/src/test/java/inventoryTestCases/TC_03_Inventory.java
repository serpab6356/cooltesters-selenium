package inventoryTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationsPages.InventoryPage;
import navigationsPages.SauceLoginPage;

public class TC_03_Inventory {
	  //Declarar e iniciar el WebDriver
	  WebDriver driver = DriverSetup.setupDriver();
		
		//PageObjects
	  SauceLoginPage loginPage = new SauceLoginPage(driver);
	  InventoryPage inventoryPage = new InventoryPage(driver);
		
	  @BeforeTest
	  public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	  }
		
	  @Test
	  public void TC_01() {
		  loginPage.loginSauce(GlobalVariables.USER_NAME, GlobalVariables.PASSWORD);
		  Assert.assertTrue(inventoryPage.addToCartAndVerifyRmvBtn());
	  }
	  
	  @AfterTest
	  public void closeDriver() {
		  driver.quit();
	  }
}

