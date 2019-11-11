package java_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_popup {
	@Test
	
	public void popup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(" https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	Alert alert=driver.switchTo().alert();
	Thread .sleep(2000);
	String msg=alert.getText();
	System.out.println(msg);
	Assert.assertEquals(msg, "Please enter a valid user name", "first test case is fail");
	alert.accept();
	
	driver.findElement(By.id("login1")).sendKeys("deepika.agr1987");
	driver.findElement(By.name("proceed")).click();
	
	Alert alert2=driver.switchTo().alert();
	Thread.sleep(2000);
     msg=alert2.getText();
	System.out.println(msg);
	Assert.assertEquals(msg, "Please enter your password", "second test case is fail");
	alert.accept();
	
	driver.findElement(By.id("password")).sendKeys("deepika.agr");
	driver.findElement(By.name("proceed")).click();
	
	Thread .sleep(2000);
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl() );
	boolean chk=driver.findElement(By.linkText("Logout")).isDisplayed();
	Assert.assertTrue(chk,"third test is failed" );
	driver.close();
	
	}

}
