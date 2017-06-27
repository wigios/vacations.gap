package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class LoginPage extends BasePage{

	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="user_email")
    public WebElement email;
    
    @FindBy(id="user_password")
    public WebElement passwd;    
    
    @FindBy(name="commit")
    public WebElement btnLogin;  
}
