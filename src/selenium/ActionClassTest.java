package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement motors = driver.findElement(By.linkText("Fashion"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(motors).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("(//nav[@class='hl-cat-nav__sub-cat-col'])[3]/ul/li"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		
		}
	}
	
}

		
	
	
	


