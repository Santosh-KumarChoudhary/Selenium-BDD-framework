package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/pagination.feature",

	glue="stepDefinations", monochrome=true,
	//tags="@PlaceOrder or @OfferPage"
	plugin={"html:target/cucumber.html",
			"json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			
"rerun:target/failed_scenario.txt"
}
		
		)


public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	
	@Override
	@DataProvider(parallel=false)
	public Object [][] scenarios()
	
	{
		return super.scenarios();
	}

}
