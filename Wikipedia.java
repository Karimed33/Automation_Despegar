package Proyecto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Wikipedia {
	@Test(description = "Validar que el titulo de wikipedia sea Bienvenidos")
	public void ValidarBienvenidosWikipedia() throws Exception 
	{  
	System.setProperty("webdriver.chrome.driver", "C://Users//admin//chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	driver.get("http://es.wikipedia.org/wiki/Wikipedia:Portada");
	WebElement bienvenidos = driver.findElement(By.xpath("//*[@title='Wikipedia:Bienvenidos']"));  
	Assert.assertTrue(bienvenidos.isDisplayed());  
	String textowiki="Bienvenidos";
	String element = bienvenidos.getText();
	Assert.assertEquals(element, textowiki);
	WebElement tituloResultado = driver.findElement(By.id("firstHeading"));  
	System.out.println("Texto encontrado "+ tituloResultado.getText());
	Assert.assertTrue(tituloResultado.isDisplayed());
	driver.close();	
	}
}