package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-email")).sendKeys("fffdgfdg");
		driver.findElement(By.id("login-password")).sendKeys("fghfghfgh");
		driver.findElement(By.id("login-password")).sendKeys(Keys.ENTER);

	}

}
