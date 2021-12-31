package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://cee-trust.org/portal/lambton-moodle-login/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		

	}

}
