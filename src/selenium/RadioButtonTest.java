package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		List<WebElement> dairy = driver.findElements(By.name("group1"));
		System.out.println(dairy.size());
		
		for(WebElement a:dairy) {
			System.out.println(a.getAttribute("value")+"     "+a.isSelected());
		}
		
		dairy.get(0).click();
		
		for(int i=0;i<dairy.size();i++) {
			System.out.println(dairy.get(i).getAttribute("value")+"      "+dairy.get(i).isSelected());
		}
	}
	 
	
	
	

}
