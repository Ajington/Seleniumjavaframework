package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_GoogleSearchPage {
		
	static WebElement element = null;
	
	public static WebElement textbox(WebDriver driver) {
		
		element=driver.findElement(By.name("q"));
		return element;
	}
		
	public static WebElement Searchbutton(WebDriver driver) {
			
		element=driver.findElement(By.name("btnK"));
		return element;
		
	}

}
