package smokeTestStepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import testBase.BaseClass;

public class Hooks extends BaseClass{
	

	
	@Before
	public void beforehook()
		{
			System.out.println("Before hook has been trigerred!!");
			
			BaseClass.initializedriver();
		}
	
	@After
	public void Afterhook()
	{
		System.out.println("After hook has been trigerred!!");
		
		BaseClass.driver.quit();
		
		System.out.println("Browser is closed....");
	}

	
}
