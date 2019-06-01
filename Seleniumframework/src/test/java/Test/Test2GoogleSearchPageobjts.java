package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.P2_GoogleSearchpageObjs;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2GoogleSearchPageobjts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		P2_GoogleSearchpageObjs test2cls=new P2_GoogleSearchpageObjs(driver);
		
		driver.get("https://google.com");
		test2cls.enterinbox("Ajiu");
		test2cls.clickbutton();
		System.out.println("Testing completed");
		
	}

}
