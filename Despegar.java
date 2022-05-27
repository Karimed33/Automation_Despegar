package Proyecto;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Despegar {
	@Test(description = "Validar que el funciones Despegar")
	public void ValidarBienvenidosWikipedia() throws Exception 
	{  System.setProperty("webdriver.chrome.driver", "C://Users//admin//chromedriver.exe");  WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.despegar.com.ar");
	WebElement alojamiento = driver.findElement(By.cssSelector(".header-products-container [href='//www.despegar.com.ar/hoteles/']"));
	Assert.assertTrue(alojamiento.isDisplayed(),"error de pagina");
	alojamiento.click();
	Thread.sleep(2000);
	WebElement destino = driver.findElement(By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox-places-destination--1xd0k']//input[@class='input-tag']"));
	Assert.assertTrue(destino.isDisplayed(),"error de pagina en Ingresar Destino");
	destino.click();
	Thread.sleep(2000);
	destino.sendKeys("Cordoba, cordoba, Argentina");
	Thread.sleep(2000);
	destino.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	WebElement fechaEntrada = driver.findElement(By.xpath("//div[@id='searchbox-sbox-box-hotels']//input[@placeholder='Entrada']"));
	Assert.assertTrue(fechaEntrada.isDisplayed(),"error de pagina en Ingresar Fecha Entrada");
	Thread.sleep(2000);
	fechaEntrada.click();
	//Thread.sleep(2000);
	WebElement eleccionFechaEntrada = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-month='2022-06']//*[text()='10']"));
	eleccionFechaEntrada.click();
	Thread.sleep(2000);
	WebElement fechaSalida = driver.findElement(By.xpath("//*[@class='input-container']//input[@placeholder='Salida']"));
	Assert.assertTrue(fechaSalida.isDisplayed(),"error de pagina en Ingresar Fecha Salida");
	fechaSalida.click();
	Thread.sleep(2000);
	WebElement eleccionFechaSalida = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-month='2022-06']//*[text()='11']"));
	eleccionFechaSalida.click();
	Thread.sleep(2000);
	WebElement botonAplicar = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='calendar-footer']//*[@class='calendar-footer-cta-container']//button[@class='sbox5-3-btn -primary -md -disable']"));
	Assert.assertTrue(botonAplicar.isDisplayed(),"Error al Aplicar ");
	botonAplicar.click();
	Thread.sleep(2000);
	WebElement habitaciones = driver.findElement(By.xpath("//div[@class='sbox5-3-distribution-passengers sbox5-3-validation -top-right']"));
	Assert.assertTrue(habitaciones.isDisplayed(),"error de pagina en Ingresar Destino");
	habitaciones.click();
	Thread.sleep(2000);
	WebElement cantidadAdultos = driver.findElement(By.xpath("//div[@class='stepper__distribution_container']//button[@class='steppers-icon-left stepper__icon']"));
	Assert.assertTrue(cantidadAdultos.isDisplayed(),"error de pagina en Ingresar Cantidad Adultos");
	cantidadAdultos.click();
	Thread.sleep(2000);
	WebElement cantidadMenores = driver.findElement(By.xpath("//div[@class='stepper__distribution_container']//button[@class='steppers-icon-left stepper__icon']"));
	Assert.assertTrue(cantidadMenores.isDisplayed(),"error de pagina en Ingresar Cantidad Menores");
	cantidadMenores.click();
	Thread.sleep(2000);
	WebElement btnAplicar = driver.findElement(By.xpath("//a[@class='sbox5-3-btn -md -primary']"));
	Assert.assertTrue(btnAplicar.isDisplayed(),"error de pagina en Ingresar Habitaciones");
	btnAplicar.click();
	driver.close();	
	}
}