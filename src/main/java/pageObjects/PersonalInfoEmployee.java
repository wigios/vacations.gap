package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class PersonalInfoEmployee extends BasePage{

	public WebDriver driver;
	
	public PersonalInfoEmployee(WebDriver driver){
		super(driver);
	}
	
    @FindBy(linkText="Back")
    public WebElement btnReturn; 
    
    @FindBy(id="notice")
    public WebElement lblCreateEmployee; 
}
