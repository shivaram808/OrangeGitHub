package testBase;

import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	
	@Before
	public void beforehook()
		{
			System.out.println("Before hook has been trigerred!!");
			initializedriver();
		}
	
	public void Afterhook()
	{
		
	}
}
