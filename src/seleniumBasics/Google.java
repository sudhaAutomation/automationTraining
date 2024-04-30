package seleniumBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.id("APjFqb")).sendKeys("what is software testing");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("APjFqb")))).click();
		// driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("Images")).click();
		int noofLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(noofLinks);
		ActionsClas.getScreenShot(driver,"google");

	}

}
