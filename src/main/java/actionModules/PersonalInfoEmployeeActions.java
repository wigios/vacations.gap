package actionModules;

import org.openqa.selenium.WebDriver;
import pageObjects.PersonalInfoEmployee;

public class PersonalInfoEmployeeActions {
	
	public WebDriver driver;

	public PersonalInfoEmployeeActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ClickReturnPage() throws InterruptedException {
		PersonalInfoEmployee personalInfoEmployee = new PersonalInfoEmployee(driver);
		personalInfoEmployee.btnReturn.click();
	}
	
	public String messageValidation() {
		PersonalInfoEmployee personalInfoEmployee = new PersonalInfoEmployee(driver);
		return personalInfoEmployee.lblCreateEmployee.getText();
	}

}
