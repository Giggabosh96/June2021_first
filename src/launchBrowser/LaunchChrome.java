package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smkha\\OneDrive\\Desktop\\June2021QA\\Selenium\\Selenium Eclipse Projects\\1st_Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //driver is the object variable		
		//maximize
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");		
		//identify web element and perform action
		driver.findElement(By.name("q")).sendKeys("selenium");		
		//driver.findElement(By.name("btnK")).click();	
		//wait
		Thread.sleep(3000);		
		
		
		
		driver.close();
		
	}

}
