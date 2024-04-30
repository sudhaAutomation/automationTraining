package seleniumBasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "bins\\chromedriver.exe");
		driver = new ChromeDriver();// launch the chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.keralartc.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector(
				"div.content-body.bg-gray:nth-child(2) section.home-banner-section div.container.banner-text div.banner-title > a.btn-theme:nth-child(3)"))
				.click();// book now button
		driver.findElement(By.xpath("//header/section[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();// more
		driver.findElement(By.linkText("Tenders")).click();// tenders
		String currentWin = driver.getWindowHandle();
		System.out.println(currentWin);

		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins);
		Thread.sleep(2000);
		driver.switchTo().window(wins.toArray()[1].toString());
		tenders();
		Thread.sleep(2000);
		driver.switchTo().window(wins.toArray()[2].toString());
		bookNow();
		// System.out.println(driver.getWindowHandle());
		driver.quit();
	}

	public static void bookNow() throws InterruptedException {
		System.out.println("book Now window tests");

		driver.findElement(By.xpath("//a[contains(text(),'x')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.ignoring(ElementClickInterceptedException.class)
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(
						By.xpath("//body/div[2]/section[1]/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]"))))
				.click();

		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);

	}

	public static void tenders() throws InterruptedException {
		System.out.println("tenders window tests");
		driver.findElement(By.linkText("Purchase")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/a[1]")).click();
		System.out.println(driver.getWindowHandle());
	}

}
