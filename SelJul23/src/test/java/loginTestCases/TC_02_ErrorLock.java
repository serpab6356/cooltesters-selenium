package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationsPages.SauceLoginPage;

public class TC_02_ErrorLock {
	
  //Declarar e iniciar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//PageObjects
	SauceLoginPage loginPage = new SauceLoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
  @Test
  public void TC_02() {
	  loginPage.loginSauce(GlobalVariables.USER_NAME_LOCK, GlobalVariables.PASSWORD);
	  Assert.assertTrue(loginPage.validateLockError());
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
  
}
