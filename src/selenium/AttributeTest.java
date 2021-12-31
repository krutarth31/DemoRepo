package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ebay.ca/");
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(driver.findElement(By.id("gh-ac")).getAttribute("value"));
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);
	}

}
