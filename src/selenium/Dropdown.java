package selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {
		
		@Test
		public void alertHandle ()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alt = driver.switchTo().alert();
		String actual_message = alt.getText();
		System.out.println(actual_message);
		Assert.assertEquals(actual_message, "Please enter a valid user name");
		alt.accept();
		//Thread.sleep(3000);
		//driver.quit();
		}
	}
