package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinations {

	String offerPageProductame;

	TestContextSetup testContextSetup;
	
	public PageObjectManager pageObjectManager;
	public OfferPageStepDefinations(TestContextSetup testContextSetup)

	{
		this.testContextSetup = testContextSetup;
	}


	@Then("^user search for same (.+) short name  on offer page to check if product exists$")
	public void user_search_for_same_short_name_on_offer_to_check_if_product_exists(String shortName) throws InterruptedException {
	

		switchToWindow();
		
		Thread.sleep(2000);


		OfferPage offer = testContextSetup.pageObjectManager.offersPage();
		offer.search(shortName);

		offerPageProductame = offer.getProductName();

		Assert.assertEquals(testContextSetup.landingPageProductName, offerPageProductame, "It's an error");

	}

	public void switchToWindow()

	{
		
	//pageObjectManager=	new PageObjectManager(testContextSetup.driver);
	LandingPage pg=testContextSetup.pageObjectManager.getLandingPage();
		
		
		
		pg.selectTopDealsPage();
		testContextSetup.genericutils.switchWindowToChild();

	
	}

}
