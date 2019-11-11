package java_sel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_login {
	WebDriver driver;
	Properties prop;

	@BeforeMethod
	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		prop = new Properties();
		FileInputStream fls = new FileInputStream(
				"D:\\Java Test Program\\seleniumpractice\\src\\java_sel\\config.properties");
		prop.load(fls);
	}

	@Test 
	public void login() {
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("facebookid"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("facebookpass"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("1st test complete");
	}

	@Test 
	public void post() throws InterruptedException {
		Thread.sleep(4000);
		boolean b = driver.findElement(By.xpath("//div[contains(text(),'Deepa Agrawal')]")).isDisplayed();
		Assert.assertTrue(b,"element not found");
		driver.findElement(By.xpath("//div[@id='placeholder-adesm']")).sendKeys("Hello world");
		
		driver.findElement(By.xpath("//div[@class='_6c0o']/button")).click();
		System.out.println("msg post:Hello world");
	}
}
