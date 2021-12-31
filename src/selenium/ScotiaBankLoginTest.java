package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=FhepceyiY0M&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiRmhlcGNleWlZME0iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzMDI2OTQ5OSwiaWF0IjoxNjMwMjY4Mjk5LCJqdGkiOiIzYzFmZTY5Yi1mZTU0LTRhYTQtYTAzMy1jNmU4YTBhZDYxNjQiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.m5dqosJLbN-ZXuJGFi3BRz-HwTOmpF-1sHG8lBzNfeReVO-gYn2A6VwmU9FH6BFJ__4MWNQbbPPzXG5yEq_1eWZIDswXhv9vRvBr4APInUDEyR4CRvg76BdO7pZXq9rGxpxir7KwEsbmuEwHpdoEZgGDNjDCe59vdwM4Xhy-8ANUVnEOFUZNjHFqcautvAQxoloOxGAVSC3tp9v4W38zT8vSWvdeZrbrYY9UEY2qI2JSQBDUUeRnO3G4ocWYhm7smGrpvPF9IdXcbMM6gQlpUp-3EBinQA07jGLi1EC5LnSZ8zdH1kC8n5k1xtm_1ERxJ3Fr0UdvvfVAMEcgcGwVYw&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("fgdfgdfg");
		driver.findElement(By.name("password")).sendKeys("fdgdfg");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		String expected = "Please check your card number / username or password and try again.";
		
		String actual = driver.findElement(By.xpath("//div[contains(text(),'Please check your card number / username or password and try again.')]")).getText();
		System.out.println(actual);
		if(expected.equals(actual)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
	}

}
