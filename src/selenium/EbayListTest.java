package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> head = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(head.size());
		
		for(WebElement a:head) {
			System.out.println(a.getText());
		}
		
	}

}
