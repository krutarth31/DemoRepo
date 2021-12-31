package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderList {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> header = driver.findElements(By.xpath("//ul[@class='_yb_ozcon _yb_1olmf']/li"));
		System.out.println(header.size());
		
		 for(WebElement a:header) {
			 System.out.println(a.getText());
		 }
		
	}

}
