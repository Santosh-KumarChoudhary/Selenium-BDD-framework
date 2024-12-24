package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import pageObjects.PaginationPage;
import utils.TestContextSetup;

public class PaginationValidationStepDef {
	
	PaginationPage page;
	
	TestContextSetup testContextSetup;
	public PageObjectManager pageObjectManager;
	WebDriver driver;
	
	String pageTitle="Dashboard";

	
	public PaginationValidationStepDef(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
//	@Given("User login with the admin username (.+) and password (.+)")
//			public void login(String username , String password)
//			
//			{
//		
//		
//		page=testContextSetup.pageObjectManager.getPaginationPage();
//		page.getUserName(username);
//		page.getPasswor(password);

		


	@Given("User login with the admin username {string} and password {string}")
	public void user_login_with_the_admin_username_and_password(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		

		page=testContextSetup.pageObjectManager.getPaginationPage();
		page.getUserName(username);
		page.getPasswor(password);
		
		System.out.println(page.getTitle());
		page.getSubmit();
		
	String pagetitle=page.getTitle();

		Thread.sleep(3000);
	//System.out.println(	"Title is " +driver.getTitle());
		
Assert.assertEquals(pagetitle, pageTitle);
		System.out.println("Pagination execution Over");
		
		System.out.println("Page value issssssssss "+page.getTitle());
		
		
	}
	
	@When("user click on menu item")
	
	public void clickOnMenuItem() throws InterruptedException
	
	{
		
		//page=testContextSetup.pageObjectManager.getPaginationPage();

		page.getCustometMenu();
		
		System.out.println("Clicked on menu item");
		
		Thread.sleep(5000);
		
		
	}
	
	


}
