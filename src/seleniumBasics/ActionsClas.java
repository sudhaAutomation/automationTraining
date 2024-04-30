package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClas {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(
				By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
		Actions act = new Actions(driver);
		// Actions class will help to handle the mouse activities

		WebElement dragMe = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement dropHere = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.moveToElement(dragMe).contextClick(); // act.clickAndHold(dragMe).moveToElement(dropHere).build().perform();
		act.dragAndDrop(dragMe, dropHere).build().perform(); // fileUpload();
		driver.switchTo().parentFrame();
		getScreenShot(driver, "jquery");

	}

	public static void fileUpload() {
		driver.get("https://swhizz.com/site_staging/admin");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Courses List")).click();
		driver.findElement(By.linkText("ADD COURSE")).click();
		WebElement chooseFile = driver.findElement(By.xpath(
				"//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/input[1]"));

		chooseFile.sendKeys("C:\\Users\\SWHIZZ TECHNOLOGIES\\Pictures\\Screenshots\\addcategory.png");
	}

	public static void getScreenShot(WebDriver driver, String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("screenShots\\" + fileName + ".png"));

	}

}
