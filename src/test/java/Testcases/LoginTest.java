package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soniyaa\\Selenium Automation\\Selenium Pre-requisite\\BrowserExecutables\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://www.zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".zh-login")).click();
		driver.findElement(By.cssSelector("#login_id")).sendKeys("soniyaa0501@yahoo.com");
		driver.findElement(By.cssSelector("button.btn:nth-child(6)")).click();
		driver.findElement(By.cssSelector("#password")).sendKeys("S0niy@@0501");
		driver.findElement(By.cssSelector("button.btn:nth-child(6)")).click();
				
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
