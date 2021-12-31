package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionList {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.name("p")).sendKeys("canada");
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class='_yb_1djf0']/li"));
		System.out.println(sugg.size());
		for(WebElement a:sugg) {
			System.out.println(a.getText());
		}
		
		
		
	}

}
