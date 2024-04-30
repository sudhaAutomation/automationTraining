package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.switchTo().frame(driver.findElement(
				By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		pickTheDate("May 2000", "30", false);

	}

	public static void pickTheDate(String expMonthYear, String expDate, boolean next) {
		while (true) {
			String actMonthYear = driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]"))
					.getText();
			if (actMonthYear.equals(expMonthYear)) {
				driver.findElement(By.xpath("//a[contains(text(),'" + expDate + "')]")).click();
				break;
			} else if (next) {
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();// next btn
			} else {
				driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();// prev btn
			}
		}
	}

}
