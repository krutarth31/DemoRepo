package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebooksignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("krutarth");
		driver.findElement(By.name("lastname")).sendKeys("patel");
		driver.findElement(By.name("reg_email__")).sendKeys("krutarth@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("fdgfdg");
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(0);
		WebElement date = driver.findElement(By.id("day"));
		
		Select d = new Select(date);
		d.selectByVisibleText("31");
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("1996");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
		String expected = "Please re-enter your email address.";
		String actual = driver.findElement(By.xpath("//div[contains(text(),'Please re-enter your email address.')]")).getText();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
		
		
		
		

	}

}
