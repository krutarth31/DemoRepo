package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement category = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
		Select s = new Select(category);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("1305");
		Thread.sleep(2000);

		s.selectByVisibleText("Toys & Hobbies");
		System.out.println(driver.findElement(By.xpath("//select[@aria-label='Select a category for search']")).getAttribute("value"));
	}

}
