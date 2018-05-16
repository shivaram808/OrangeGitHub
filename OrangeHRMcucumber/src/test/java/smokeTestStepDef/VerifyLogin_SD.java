package smokeTestStepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.Loginpage;
import testBase.BaseClass;

public class VerifyLogin_SD extends BaseClass{

	Loginpage lg = new Loginpage(driver);
		
	@Given("^Login to the orange HRM application as a Admin$")
	public void login_to_the_orange_HRM_application_as_a_Admin() throws Throwable {
			System.out.println("Login to the application");
			
			lg.AdminLogin("Admin", "admin");
		}

	@Then("^\"([^\"]*)\" Message should be displayed$")
	public void message_should_be_displayed(String arg1) throws Throwable {
			
			String arg = arg1;
			
			System.out.println("Home page is displayed : "+arg);

		}
	
		
		
	
	
	
}
