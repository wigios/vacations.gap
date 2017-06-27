package actionModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CreateEmployeePage;
import pageObjects.Employee;

public class CreateEmployeeActions {
	
	public WebDriver driver;

	public CreateEmployeeActions(WebDriver driver) {
		this.driver = driver;
	}

	public void formCreateEmployee(Employee employee) throws InterruptedException {
		
		CreateEmployeePage createEmployeePage = new CreateEmployeePage(driver);
		
		createEmployeePage.tBoxFirstNameEmployee.sendKeys(employee.getFirstName());
		createEmployeePage.tBoxLastNameEmployee.sendKeys(employee.getLastName());
		createEmployeePage.tBoxEmailEmployee.sendKeys(employee.getEmail());
		createEmployeePage.tBoxIDEmployee.sendKeys(employee.getId());
		createEmployeePage.tBoxNameLeaderEmployee.sendKeys(employee.getLeaderName());
		
		new Select(createEmployeePage.lBYearEmployee).selectByVisibleText(employee.getYearBirth());
		new Select(createEmployeePage.lBMonthEmployee).selectByVisibleText(employee.getMonthBirth());
		new Select(createEmployeePage.lBdayEmployee).selectByVisibleText(employee.getDayBirth());
		
		createEmployeePage.btnCreate.click();

	}

}
