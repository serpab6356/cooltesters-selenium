package prueba;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTests {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Cool testers");
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
		
		
		//Metodos de explorador
		//Obtener titulo de la pagina actual
		String title = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + title);
		
		//Obtener URL
		String url = driver.getCurrentUrl();
		System.out.println("La url actual es: " + url);
		
		//Metodos de navegación
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Verificar  elemento desplegado
		boolean inventoryItemisDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		
		if(inventoryItemisDisplayed) {
			System.out.println("El articulo esta desplegado");
		}
		
		//Obtener  texto de WebElement
		String itemName = driver.findElement(By.className("inventory_item_name")).getText();
		
		if(itemName.contains("Sauce Labs")) {
			System.out.println("El producto es correcto");
		}else {
			System.out.println("ERROR: El producto es incorrecto");
		}
		
		
		
		//Drop down
		Select oSelect = new Select(driver.findElement(By.xpath("//select[@data-test = 'product_sort_container']")));
		oSelect.selectByVisibleText("Price (high to low)");
			
		
		//FindElements
		List<WebElement> prodLists = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Numero de elementos en la lista: " + prodLists.size());
		
		String primerItem = prodLists.get(0).getText();
		System.out.println(primerItem);
		
		String segundoItem = prodLists.get(1).getText();
		System.out.println(segundoItem);
		
		for(int i = 0; i < prodLists.size(); i++) {
			System.out.println("Los productos son: " + prodLists.get(i).getText());
			if(!prodLists.get(i).getText().contains("Labs")) {
				System.out.println("El producto no es un producto LABS valid");
				break;
			}
		}
		
		
		//Cerrar navegador
		driver.close();//Cerrar ventana/pestaña actual que el webdriver este usando
		driver.quit(); //Cierra todas las ventanas que Selenium abrio
		
		
	}

}
