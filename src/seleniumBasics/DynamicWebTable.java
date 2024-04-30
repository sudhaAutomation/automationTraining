package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		driver.get("https://swhizz.com/site_staging/admin");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Upcoming Batches')]")).click();
		int page = 1;
		while (true) {
			System.out.println("table data of page " + page + " is");
			int rows = driver.findElements(By.xpath("//tbody/tr")).size();
			int cols = driver.findElements(By.xpath("//tbody/tr[1]/td")).size();
			System.out.println("rows  " + rows);
			System.out.println("cols  " + cols);

			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j < cols; j++) {
					String tdata = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText();
					System.out.print(tdata + "     ");
					if (tdata.equals("12/12/2024")) {
						driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[8]/a[1]")).click();
						driver.switchTo().alert().accept();
					}
				}
				System.out.println();
			}
			if (ElementUtils.isClickable(driver, driver.findElement(By.xpath("//a[@id='example_next']")))) {
				driver.findElement(By.xpath("//a[@id='example_next']")).click();
				page++;
			} else {
				break;
			}
 		}
	}

}
