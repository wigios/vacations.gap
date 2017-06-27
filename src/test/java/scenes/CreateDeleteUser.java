package scenes;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import actionModules.CreateEmployeeActions;
import actionModules.HomeActions;
import actionModules.LoginActions;
import actionModules.PersonalInfoEmployeeActions;
import commons.Utilities;
import pageObjects.Employee;
import commons.BaseTest;
import commons.ExcelUtils;

public class CreateDeleteUser implements BaseTest{

	private WebDriver driver;	
	private Employee employee;
	private LoginActions loginActions;
	private HomeActions homeActions;
	private CreateEmployeeActions createEmployeeActions;
	private PersonalInfoEmployeeActions personalInfoEmployeeActions;
	
	
	@BeforeClass
	public void setupPages() {		
		employee = new Employee();
	}
	
	@Parameters("browser")
	@Test(enabled = true)
	public void CreateVerifyDeleteUser(String browser) {

		try {

			driver = Utilities.openBrowser(browser);
			
			loginActions = new LoginActions(driver);
			homeActions = new HomeActions(driver);
			createEmployeeActions = new CreateEmployeeActions(driver);
			personalInfoEmployeeActions = new PersonalInfoEmployeeActions(driver);
			
			//begin
			loginActions.IngresoLogin(employee);

			homeActions.IngresarCreateEmployee();			

			createEmployeeActions.formCreateEmployee(employee);
			
			Assert.assertEquals(RESULT_EXPECTED, personalInfoEmployeeActions.messageValidation());
			
			personalInfoEmployeeActions.ClickReturnPage();			
			
			homeActions.findLeaderUser(employee.getLeaderName());
			
			Utilities.ManejoAlerts(driver);
			
			Assert.assertEquals(RESULT_EXPECTED_FINAL, homeActions.messageValidationFinal());

			homeActions.LogoutApp();
		}

		catch (Exception e) {
			Assert.fail(); // To fail test in case of any element identification
							// failure
		}

	}
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		try {
			if (testResult.getStatus() == ITestResult.FAILURE) {
				System.out.println(testResult.getStatus());
				Utilities.TomarEvidencia(driver);

				ExcelUtils.setCellData("Failed", 1, 10, "DataTestPractice.xlsx");
			} else {
				ExcelUtils.setCellData("Passed", 1, 10, "DataTestPractice.xlsx");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void Terminacion() throws Exception {
		driver.quit();
		System.out.println("El Proceso ha terminado");

	}

}
