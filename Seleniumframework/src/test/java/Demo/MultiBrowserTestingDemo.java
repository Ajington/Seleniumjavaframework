package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserTestingDemo {
	
	WebDriver driver=null;

@Parameters("browser")
@BeforeTest
public void setup(String browser) {
	
	if (browser.equalsIgnoreCase("Chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	
}

@Test
public void testing() {
		
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("Aji");
	}

@AfterTest
public void teardown() {
	driver.quit();
}
}
