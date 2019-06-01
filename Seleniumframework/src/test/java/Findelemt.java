import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelemt {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung");
		Thread.sleep(3000);
		
		List<WebElement> emts = driver.findElements(By.xpath("//input"));
		int vle = emts.size();
		System.out.println("no of input is "+ vle);
		System.out.println("test passed");
		driver.quit();
	}

}
