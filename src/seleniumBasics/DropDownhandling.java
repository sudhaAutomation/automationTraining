package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		// driver.get("https://swhizz.com/site_staging/admin");
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		// driver.findElement(By.name("password")).sendKeys("123456");
		// driver.findElement(By.name("submit")).click();
		// driver.findElement(By.linkText("Courses List")).click();
		// driver.findElement(By.linkText("ADD COURSE")).click();
		//
		// new
		// Select(driver.findElement(By.name("category_id"))).selectByVisibleText("Java
		// Fullstack");
		// driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys("Java");
		driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
		// driver.navigate().refresh();
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();

		WebElement textbox = driver.findElement(By.xpath("//textarea[@id='textbox']"));

		WebElement generateFileBtn = driver.findElement(By.xpath("//button[@id='createTxt']"));

		WebElement downloadLink = driver.findElement(By.xpath("//a[@id='link-to-download']"));
		System.out.println("all webelements are displayed are not");
		System.out.println(textbox.isDisplayed());
		System.out.println(generateFileBtn.isDisplayed());
		System.out.println(downloadLink.isDisplayed());

		System.out.println("all webelements are enabled are not");
		System.out.println(textbox.isEnabled());
		textbox.sendKeys("Sample Text");

		System.out.println(generateFileBtn.isEnabled());
		generateFileBtn.click();
		System.out.println(downloadLink.isEnabled());
		System.out.println(
				"after generate file clicked down th edownload link displyed is " + downloadLink.isDisplayed());

		// downloadLink.click();

		// conditional methods in selenium
		// isDisplayed,isSelected,isEnabled

	}

}
