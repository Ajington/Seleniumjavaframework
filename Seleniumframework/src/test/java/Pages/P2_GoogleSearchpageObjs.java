package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P2_GoogleSearchpageObjs {
	
	WebDriver driver=null;
	
	
	By textbox=By.name("q");
	By button=By.name("btnK");
	
	public P2_GoogleSearchpageObjs(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterinbox(String Value) {
		
		driver.findElement(textbox).sendKeys(Value);
		
			}
	public void clickbutton() {
		driver.findElement(button).click();
	}
}
