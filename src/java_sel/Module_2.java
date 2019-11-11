package java_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("  http://www.gcrit.com/build3/admin");
		driver.findElement(By.linkText("Online Catalog")).click(); 
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Deepika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Agrawal");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("10/29/1987");
		driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys("deepika.agr@gmail.com");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Savan");
		driver.findElement(By.xpath("//input[@name='street_address']")).sendKeys("20,Shakuntala Puri");
		driver.findElement(By.xpath("//input[@name='suburb']")).sendKeys("Thatipur");
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("474011");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Gwalior");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("M.P.");
		Select dd=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dd.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9425123456");
		driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("07512231345");
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("deepika123");
		driver.findElement(By.xpath("//input[@name='confirmation']")).sendKeys("deepika123");
		driver.findElement(By.xpath("//button[@id='tdb4']")).click();
		
		
		
	}

}
