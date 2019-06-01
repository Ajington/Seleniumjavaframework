 package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.P1_GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearchPage {
	
	static WebDriver driver=null;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://google.com");
		P1_GoogleSearchPage.textbox(driver).sendKeys("Aji");
		P1_GoogleSearchPage.Searchbutton(driver).click();
		System.out.println("Testing passed");
		
	}

}
