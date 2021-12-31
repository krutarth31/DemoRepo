package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.adidas.ca/en/account-login");
		driver.findElement(By.id("login-email")).sendKeys("dfgfdgfdg");
		driver.findElement(By.id("login-password")).sendKeys("fdgfdgdfg");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		String expected = "The email address is invalid.";
		String actual = driver.findElement(By.xpath("//div[@class='gl-form-hint gl-form-hint--error']")).getText();
		if(expected.equals(actual)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test pass");
		}
		

	}

}
