package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingpage;

	public OfferPage offerpage;

	public WebDriver driver;
	public CheckoutPage checkoutpage;
	
	public PaginationPage paginationpage;


	public PageObjectManager(WebDriver driver)

	{
		this.driver = driver;
	}

	public LandingPage getLandingPage()

	{
		landingpage = new LandingPage(driver);

		return landingpage;
	}

	public OfferPage offersPage()

	{
		offerpage = new OfferPage(driver);

		return offerpage;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		checkoutpage= new CheckoutPage(driver);
		
 return checkoutpage;
	}
	
	public PaginationPage getPaginationPage()
	
	{
		paginationpage=new PaginationPage(driver);
		return paginationpage;
	}
	

}
