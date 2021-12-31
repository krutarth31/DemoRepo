package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(links.size());
		
		for(WebElement a:links) {
			System.out.println(a.getText());
		}
		
		WebElement searchOptions = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(searchOptions);
		s.selectByVisibleText("Baby");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("food");
		driver.findElement(By.id("nav-search-submit-button")).click();
		

	}

}
