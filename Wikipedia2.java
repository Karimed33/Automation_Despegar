package Proyecto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Wikipedia2 {
	@Test(description = "Validar que el titulo de wikipedia sea Bienvenidos")
	public void ValidarBienvenidosWikipedia() throws Exception {  System.setProperty("webdriver.chrome.driver", "C://Users//admin//chromedriver.exe");  WebDriver driver = new ChromeDriver();
	driver.get("http://es.wikipedia.org/wiki/Wikipedia:Portada");
	WebElement imput = driver.findElement(By.cssSelector(".main-box.main-box-responsive-image .main-footer .mw-ui-button"));  
	Assert.assertTrue(imput.isDisplayed());  
	imput.click();
	Thread.sleep(1000);
	WebElement tituloResultado = driver.findElement(By.id("firstHeading"));  
	System.out.println("Texto encontrado "+ tituloResultado.getText());  
	Assert.assertTrue(tituloResultado.isDisplayed(), "Gustav_Holst");
	driver.close();	
	}
}