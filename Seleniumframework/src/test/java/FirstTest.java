import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("https://amazon.in");
		System.out.println("TEst pased");
		driver.quit();
	}
}
