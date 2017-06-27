package actionModules;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePage;


public class HomeActions {
	
	public WebDriver driver;

	public HomeActions(WebDriver driver) {
		this.driver = driver;
	}

	public void IngresarCreateEmployee() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);		
		
		homePage.lnkCreateEmployee.sendKeys(Keys.END);
		Thread.sleep(2000);
		homePage.lnkCreateEmployee.click();
		
	}
	
	public void LogoutApp() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.lnkLogout.click();		
	}
	
	public void findLeaderUser(String leaderName){
		for (int i = 2; i < 20; i++) {
			if (driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[4]")).getText()
					.equalsIgnoreCase(leaderName)) {
				driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[9]")).click();
				break;
			}
		}
	}	
	
	public String messageValidationFinal() {
		HomePage homePage = new HomePage(driver);
		return homePage.lbWelcomeGAP.getText();
	}

}
