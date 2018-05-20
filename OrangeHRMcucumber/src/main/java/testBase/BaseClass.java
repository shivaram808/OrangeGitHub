package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	
	public static WebDriver driver;
	
	

	public static void initializedriver()
	{
		
		System.out.println("Sarted executing before method");
		System.setProperty("webdriver.gecko.driver",".//geckodriver.exe");
		driver= new FirefoxDriver();
		 
		 
		driver.get("http://opensource.demo.orangehrmlive.com/");
		//driver.manage().window().maximize();
		
	}
	

	public void quitdriver()
	{
		driver.close();
		System.out.println("Executed after method");
	}
	

}
