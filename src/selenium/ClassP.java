package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ClassP {
	static WebDriver driver;
	
	  @BeforeTest
	  public void launchBrowser() {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  @AfterTest
	  public void closeBrowser() {
		  driver.quit();
	  }
}
