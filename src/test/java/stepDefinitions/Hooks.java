package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext=context;
	}
	
	@Before
	public void BeforeSteps() {
		/*
		Starting a WebDriver
		Setting up DB Connections
		Setting up testData
		Setting up browser Cookies
		Navigating to certain page
		or anything before the test
		*/
	}
	
	
	
	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}
}
