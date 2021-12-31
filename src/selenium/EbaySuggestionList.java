package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(suggestion.size());
		
		for(WebElement a:suggestion) {
			System.out.println(a.getText());
			if(a.getText().equals("iphone 12 pro max")) {
				System.out.println("Test pass");
			}else {
				System.out.println("Test fail");
			}
			break;

			
		}
	}

}
