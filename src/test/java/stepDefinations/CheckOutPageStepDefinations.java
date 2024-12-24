package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefinations {

	public String landingPageProductName;

	TestContextSetup testContextSetup;
	
	public CheckoutPage page;

	//public WebDriver driver;

	public CheckOutPageStepDefinations(TestContextSetup testContextSetup)

	{
		this.testContextSetup = testContextSetup;
		this.page=testContextSetup.pageObjectManager.getCheckoutPage();

	}


	
	@Then ("^User proceed to checkout and validate the (.+) items in the checkout page$")
	public void userproceedToCheckOut(String name) throws InterruptedException
	
	{
		page.checkOutItem();
		//Thread.sleep(3000);	
	}
	
	@Then("verify user has ability to enter promo code and place the order")
	public void checkOutPage()
	
	{
		//page=testContextSetup.pageObjectManager.getCheckoutPage();
		
	
		Assert.assertTrue(page.applyCoupns());
		Assert.assertTrue(page.VerifyPlaceOrder());
	}
	
	@When("Added {string} times of the selected product to the cart")
	public void add3ItemsToCheckOut(String quantity)
	
	{
		page.addNumberOfItems(Integer.parseInt(quantity));
		page.addToTheCart();
	}
}
