import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class GooglePage {

	private WebDriver driver;
	
	public GooglePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void paginaInicial(){
		
		driver.get("http://www.google.com.br");
		
	}
	
	public void busca(String string){
		driver.findElement(By.name("q")).sendKeys(string);
		driver.findElement(By.name("btnG")).click();
	}
	
	public boolean existe(String string){
		return driver.getPageSource().contains(string);
	}
}
