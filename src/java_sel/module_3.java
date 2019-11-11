package java_sel;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class module_3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("  https://www.facebook.com/");
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Java Test Program\\seleniumpractice\\src\\java_sel\\config.properties");
		prop.load(fis);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(prop.getProperty("f_name"));
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(prop.getProperty("l_name"));
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(prop.getProperty("mob_no"));
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(prop.getProperty("password"));
		Select ddd=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		ddd.selectByVisibleText(prop.getProperty("day"));
        Select ddm=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        ddm.selectByVisibleText(prop.getProperty("month"));
        Select ddy=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        ddy.selectByVisibleText(prop.getProperty("year"));
        driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		