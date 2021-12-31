package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		List<WebElement> drag = driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		 sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		 drag = driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		 sortable = driver.findElements(By.linkText("Sortable"));
			System.out.println(sortable.size());
			
			 drag = driver.findElements(By.id("draggable"));
			System.out.println(drag.size());
		
	}

}
