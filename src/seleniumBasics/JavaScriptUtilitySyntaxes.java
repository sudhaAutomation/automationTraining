package seleniumBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtilitySyntaxes {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		// driver.get("https://www.keralartc.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://html.com/input-type-file/'");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='fileupload']"));
		js.executeScript("arguments[0].scrollIntoView()", chooseFile);
		chooseFile.sendKeys("C:\\Users\\SWHIZZ TECHNOLOGIES\\Pictures\\Screenshots\\addcategory.png");
		js.executeScript("arguments[0].style.border='3px solid red'", chooseFile);
		Thread.sleep(2000);
		ActionsClas.getScreenShot(driver, "chooseFile");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
