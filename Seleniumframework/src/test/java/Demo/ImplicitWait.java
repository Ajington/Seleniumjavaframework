package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	public static void main(String[] args) {
		cls1();
	}
	
	public static void cls() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("s")).sendKeys("Aji");

}
	
	public static void cls1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		WebDriverWait expwait=new WebDriverWait(driver, 10);
		WebElement element = expwait.until(ExpectedConditions.elementToBeClickable(By.className("s")));
		driver.findElement(By.name("s")).sendKeys("Aji");

	}
	
	
}
