package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// Identifying all the WebElements of this page 	
	

	@FindBy(xpath=".//*[@id='txtUsername']")
	WebElement Username;
	
	@FindBy(xpath=".//*[@id='txtPassword']")
	WebElement Password;
	
	@FindBy(xpath=".//*[@id='btnLogin']")
	WebElement LoginBtn;
//	
	
	public void AdminLogin(String uid,String pwd)
	{
		Username.sendKeys(uid);
		Password.sendKeys(pwd);
		LoginBtn.click();
		
	}

}
