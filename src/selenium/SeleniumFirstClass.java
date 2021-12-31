package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		  FirefoxDriver driver = new FirefoxDriver();
		  
		  driver.get("https://www.facebook.com");
		  
		  driver.findElement(By.id("email")).sendKeys("dfgfdgdfgfdg");
		  driver.findElement(By.id("pass")).sendKeys("fdgfdgfdg");
		  driver.findElement(By.name("login")).click();
		  
	}

}
