package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager()
	
	{
		
		if(driver==null)
		{
			
			WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        


		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        driver.get("https://www.ecomdeveloper.com/demo/admin/index.php?route=common/login");
		//driver.manage().timeouts()

		}
		
		return driver;
	}

}
