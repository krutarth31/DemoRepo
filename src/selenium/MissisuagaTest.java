package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissisuagaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://mississauga.ca/");
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(links.size());
		
		for(WebElement a:links) {
			System.out.println(a.getText());
			if(a.getText().equals("Jobs and volunteer")) {
				a.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		if(driver.findElement(By.xpath("//button[contains(text(),'Events and attractions')]")).isDisplayed()==false) {
			driver.switchTo().frame(driver.findElement(By.id("IPerceptionsEmbed")));
			driver.findElement(By.xpath("//button[contains(text(),'No, thank you')]")).click();
			
			
		}
		driver.findElement(By.xpath("//button[contains(text(),'Events and attractions')]")).click();
		List<WebElement> event = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(event.size());
		
		for(WebElement b:event) {
			System.out.println(b.getText());
			if(b.getText().equals("Marinas")) {
				b.click();
				System.out.println(driver.getTitle());
				break;
			}
		}
		driver.quit();
				
	}
	}
		
		

