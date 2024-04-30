package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		driver.get("https://swhizz.com/site_staging/admin");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Courses List")).click();
		driver.findElement(By.xpath("/html/body/div/section/div/div/section/div/div/div/table/tbody/tr[1]/td[2]/a[1]"))
				.click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		// alert.sendKeys("12345");
		// Thread.sleep(3000);
		// alert.dismiss();
		alert.accept();
		// driver.close();
		driver.close();
	}

}
