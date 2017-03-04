import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GooglePageTest {

	private WebDriver driver;
	private GooglePage google;
	
	@Before
	public void inicializa(){
		this.driver = new FirefoxDriver();
		this.google = new GooglePage(driver);
	}
	
	@Test
	public void deveFazerUmaBuscaNoGoogleTest(){
		google.paginaInicial();
		google.busca("Selenium");
		assertTrue(google.existe("Selenium"));
	}
	
	@After
	public void finaliza(){
		driver.quit();
	}
	
}
