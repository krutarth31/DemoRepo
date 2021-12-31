package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.name("identifier")).sendKeys("dfgdfgdfggggjghuj");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		String expected = "Couldn’t find your Google Account";
		
		if(actual.equals(expected)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
	}

}
