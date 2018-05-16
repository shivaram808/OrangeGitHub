package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {
	
	public static WebDriver driver;
	
	@Before
	public void initializedriver()
	{
		
		System.out.println("Sarted executing before method");
		System.setProperty("webdriver.gecko.driver",".//geckodriver.exe");
		driver= new FirefoxDriver();
		 
		 
		driver.get("http://opensource.demo.orangehrmlive.com/");
		//driver.manage().window().maximize();
		
	}
	
	@After
	public void quitdriver()
	{
		System.out.println("Executed after method");
	}
	

}
