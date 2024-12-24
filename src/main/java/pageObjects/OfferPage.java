package pageObjects;


	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
		
WebDriver driver;
		
By search=	By.id("search-field");
	
By productName=	By.xpath("//td[text()='Tomato']");
		
		
		
		public OfferPage(	WebDriver driver)
		
		{
			this.driver=driver;
		}
		
		
		public void search(String name)
		
		{
		driver.findElement(search).sendKeys(name);
		
		}
		public void getSearchedName()
		
		{
			driver.findElement(search).getText();
		}

		public String getProductName()
		
		{
			return driver.findElement(productName).getText();
		}
	


}
