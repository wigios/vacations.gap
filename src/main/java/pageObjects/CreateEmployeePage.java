package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class CreateEmployeePage extends BasePage{
	
	public WebDriver driver;
	
	public CreateEmployeePage(WebDriver driver){
		super(driver);
	}
	
    @FindBy(id="employee_first_name")
    public WebElement tBoxFirstNameEmployee;    
    
    @FindBy(id="employee_last_name")
    public WebElement tBoxLastNameEmployee;  
    
    @FindBy(id="employee_email")
    public WebElement tBoxEmailEmployee; 
    
    @FindBy(id="employee_identification")
    public WebElement tBoxIDEmployee; 
    
    @FindBy(id="employee_leader_name")
    public WebElement tBoxNameLeaderEmployee; 
    
    @FindBy(id="employee_start_working_on_1i")
    public WebElement lBYearEmployee; 
    
    @FindBy(id="employee_start_working_on_2i")
    public WebElement lBMonthEmployee; 
    
    @FindBy(id="employee_start_working_on_3i")
    public WebElement lBdayEmployee; 
    
    @FindBy(name="commit")
    public WebElement btnCreate; 

    @FindBy(linkText="Back")
    public WebElement btnReturn; 

}
