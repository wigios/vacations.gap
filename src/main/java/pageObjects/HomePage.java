package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(linkText="Create a new employee")
    public WebElement lnkCreateEmployee;
    
	@FindBy(linkText="Logout")
    public WebElement lnkLogout;
	
	@FindBy(xpath="//*[@id='user_information']/span")
	public WebElement lbWelcomeGAP;
}
