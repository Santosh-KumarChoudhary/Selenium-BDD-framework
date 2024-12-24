package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginationPage {
	
	WebDriver driver;
	
	By userName=By.name("username");
	
	By password=By.name("password");
	
	By clickOnCustomerMenu=By.xpath("//li[@id='menu-customer']");
	
By submit=	By.xpath("//button[@type='submit']");
	
	
	public PaginationPage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	

	
	public String getTitle()
	{
		return driver.getTitle();
	}
	public void getUserName(String username)
	
	{
		driver.findElement(userName).sendKeys(username);
	}
	
	public void getPasswor(String pwd)
	
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void getSubmit()
	{
		driver.findElement(submit).click();
	}
	
	public void getCustometMenu()
	{
		driver.findElement(clickOnCustomerMenu).click();
	}
	

}
