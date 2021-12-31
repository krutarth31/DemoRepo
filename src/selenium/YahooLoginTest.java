package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	
	driver.get("https://mail.yahoo.com/?.intl=ca&.lang=en-CA&pspid=2142623533&activity=ybar-mail");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.name("username")).sendKeys("fdgfdgdfgfghgfhgfh");
	driver.findElement(By.id("login-signin")).click();
	
	String exp = "Sorry, we don't recognize this email.";
	String act = driver.findElement(By.id("username-error")).getText();
	System.out.println(act);
	if(exp.equals(act)) {
		System.out.println("test pass");
	}else {
		System.out.println("test fail");
	}
	
	
	}

}
