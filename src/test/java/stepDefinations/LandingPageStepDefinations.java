package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinations {

	public String landingPageProductName;

	TestContextSetup testContextSetup;
	LandingPage page;

	//public WebDriver driver;

	public LandingPageStepDefinations(TestContextSetup testContextSetup)

	{
		this.testContextSetup = testContextSetup;
		this.page=testContextSetup.pageObjectManager.getLandingPage();
		

	}

	@Given("User is on the green card landing page")
	public void user_is_on_the_green_card_landing_page() {
		
		Assert.assertTrue(page.pageTitle().contains("GreenKart"));

		

		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("^user searched with short name (.+) and abstract actual name of product$")
	public void user_searched_with_short_name_and_abstract_actual_name_of_product(String shortName) throws InterruptedException {
		

		page.search(shortName);

		// testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);

		
		Thread.sleep(2000);
		testContextSetup.landingPageProductName = page.getProductName().split("-")[0].trim();

		System.out.println("Product name is abstracted from hOme page :" + landingPageProductName);

	}

}
