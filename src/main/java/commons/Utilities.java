package commons;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
	
	public static WebDriver driver = null;
	
	public static WebDriver openBrowser(String sBrowserName) {
		try {

			Browser browser;
			browser = Browser.valueOf(sBrowserName);
			
			switch (browser) {

			case CHROME:
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				options.addArguments("--disable-extensions");
				driver = new ChromeDriver(options);
				break;

			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case IE:
				System.out.println("Internet explorer - En construccion");
				break;
				
			case SAFARI: 
				System.out.println("safari - En construccion");
				break;

			default:
				return null;

			}

			driver.get("https://vacations-management.herokuapp.com/users/sign_in");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());
		}
		return driver;
	}
	
	public static void TomarEvidencia(WebDriver driver) {
		Calendar fecha = new GregorianCalendar();

		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);

		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);

		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			synchronized (scrFile) {
				FileUtils.copyFile(scrFile, new File("FailEvidences/" + "Corrida_1" + "/" + anio + "_" + mes
						+ "_" + dia + "_" + hora + "_" + minuto + "_" + segundo + ".jpg"));
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	public static void ManejoAlerts(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
	}


}
