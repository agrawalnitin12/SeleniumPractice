package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustReg {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://gcrit.com/build3/");
	driver.findElement(By.linkText("create an account")).click();
    driver.findElement(By.xpath("//*[@id=\'bodyContent\']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
    driver.findElement(By.name("firstname")).sendKeys("abc");
    driver.findElement(By.name("lastname")).sendKeys("123");
    driver.findElement(By.id("dob")).sendKeys("06/12/1984");
    driver.findElement(By.name("email_address")).sendKeys("abc@ab.com");
    driver.findElement(By.name("street_address")).sendKeys("aceit");
    driver.findElement(By.name("suburb")).sendKeys("platinum");
    driver.findElement(By.name("postcode")).sendKeys("123456");
    driver.findElement(By.name("city")).sendKeys("GNO");
    driver.findElement(By.name("state")).sendKeys("UPW");
    Select dropDown = new Select(driver.findElement(By.name("country")));
    dropDown.selectByVisibleText("India");
    driver.findElement(By.name("telephone")).sendKeys("1234567890");
    driver.findElement(By.name("newsletter")).click();
    driver.findElement(By.name("password")).sendKeys("abc1234");
    driver.findElement(By.name("confirmation")).sendKeys("abc123");
    driver.findElement(By.id("tdb4")).click();
    String confirmation = driver.findElement(By.tagName("h1")).getText();
    System.out.println(confirmation);
		try {
	   if(confirmation.equals("Your Account Has Been Created!"))
		System.out.println("Customer Registration successful - Passed"); 
		}catch(UnhandledAlertException e1) {
	    	System.out.println("Customer Registration unsuccessful - Incomplete form");
		  Alert popup = driver.switchTo().alert(); 
		  System.out.println(popup.getText());
		  popup.accept(); 
		  } 
	driver.close();
	}
	}
	

