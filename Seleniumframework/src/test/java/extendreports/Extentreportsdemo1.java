package extendreports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreportsdemo1 {
		
		 static WebDriver driver=null;
	public static void main(String[] args) {
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("report.html");
		
		//create extent reports and attach reporters
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		//create toggle for given test and add log to it
		ExtentTest test=extent.createTest("Google search","Descrip of google search");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		test.pass("Opened web page");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Kasi");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Clicked on search");
		driver.quit();
		test.info("All done");
		
		System.out.println("All passed");
		extent.flush();

	}

}
