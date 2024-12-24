package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;
import pageObjects.PaginationPage;

public class TestContextSetup {
	
	public String landingPageProductName;

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	
	public TestBase testbase;
	public GenericUtils genericutils;
	
	public  PaginationPage paginationpage;
	
	
	public TestContextSetup() throws IOException
		
	{
		
		testbase= new TestBase();
		pageObjectManager=	new PageObjectManager (testbase.WebDriverManager());
		genericutils= new GenericUtils(testbase.WebDriverManager());
		
		paginationpage=new PaginationPage(testbase.WebDriverManager());
	}

}
