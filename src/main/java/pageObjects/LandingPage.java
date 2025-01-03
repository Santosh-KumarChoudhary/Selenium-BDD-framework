package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	
By search=	By.xpath("//input[@type='search']");
	
By productName=By.cssSelector("h4[class='product-name']");

By topDeals=By.linkText("Top Deals");
	
	public LandingPage(	WebDriver driver)
	
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
	
	public void selectTopDealsPage()
	
	{
		driver.findElement(topDeals).click();
	}
	
	public String pageTitle()
	
	{
		return driver.getTitle();
	}
}
