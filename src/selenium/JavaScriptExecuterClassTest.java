package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement career = driver.findElement(By.linkText("Careers"));
		
		//jse.executeScript("arguments[0].click()",career);
		//jse.executeScript("arguments[0].scrollIntoView(true)", career);
		
		jse.executeScript("window.scrollBy(0,5000)");
		career.click();
	}

}
