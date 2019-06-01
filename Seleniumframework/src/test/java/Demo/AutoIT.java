package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {

public static void main(String[] args) throws Exception {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("http://tinyupload.com/");
driver.findElement(By.name("uploaded_file")).click();
Runtime.getRuntime().exec("C:\\Users\\Vinoth\\Documents\\autox.exe");
System.out.println("Upload successfl");

}
	
	
}
