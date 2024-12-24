package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	WebDriver driver;

	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By applyButton = By.xpath("//button[contains(text(),'Apply')]");

	By placeOrderButton = By.xpath("//button[text()='Place Order']");
	By cart = By.cssSelector("img[alt='Cart']");
	By increment = By.cssSelector("a.increment");
By addedToCat=	By.cssSelector(".product-action button");

	public CheckoutPage(WebDriver driver)

	{
		this.driver = driver;
	}

	public void checkOutItem()

	{
		driver.findElement(cart).click();
		driver.findElement(checkOutButton).click();

	}

	public boolean applyCoupns()

	{
		return driver.findElement(placeOrderButton).isDisplayed();
	}

	public boolean VerifyPlaceOrder()

	{
		return driver.findElement(placeOrderButton).isDisplayed();
	}

	public void addNumberOfItems(int number)

	{
		for (int i = 1; i <=number; i++)

		{
			driver.findElement(increment).click();
		}
		
		
	}
	
	public void addToTheCart()
	
	{
		driver.findElement(addedToCat);
	}

}
