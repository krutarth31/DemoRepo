package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://cee-trust.org/portal/lambton-moodle-login/");
		
		driver.findElement(By.id("oficialsite")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> iter = allWindows.iterator();
		String parentWindow = iter.next();
		String childWindow = iter.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
