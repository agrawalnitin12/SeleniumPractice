package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustLogin {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.gcrit.com/build3/login.php");
	driver.findElement(By.name("email_address")).sendKeys("abc@ab.com");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.id("tdb5")).click();
	try {
	
	if (driver.findElement(By.linkText("Log Off")).isDisplayed() == true)
		System.out.println("Login Successful");
	
	} catch(NoSuchElementException e1) {
		System.out.println("Login Failed");
		System.out.println(driver.findElement(By.className("messageStackError")).getText());
		}
		}
}
