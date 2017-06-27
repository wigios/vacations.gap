package actionModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Employee;
import pageObjects.LoginPage;

public class LoginActions {

	public WebDriver driver;

	public LoginActions(WebDriver driver) {
		this.driver = driver;
	}

	public void IngresoLogin(Employee employee) throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.email.sendKeys(employee.getUser());
		loginPage.passwd.sendKeys(employee.getPass());
		loginPage.btnLogin.click();
		// Utils.esperarSegundos(2);

	}

}
