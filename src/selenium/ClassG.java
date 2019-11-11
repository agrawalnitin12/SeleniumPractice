package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassG {
	WebDriver driver;
	
	  @Test (groups= {"sanity", "regression"}, priority=1)
	  public void launchBrowser() {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  @Test(groups= {"regression"}, priority=2)
	  public void verifyYahoo() {
		  driver.get("https://in.yahoo.com/");
		  String pagetitle = driver.getTitle();
		  Assert.assertEquals(pagetitle, "Yahoo");
		   }
	  @Test(groups= {"sanity", "regression"}, priority=3)
	  public void verifyGcrit() {
		  driver.get("http://www.gcrit.com/build3/admin/login.php");
		  String pagetitle = driver.getTitle();
		  Assert.assertEquals(pagetitle, "GCR Shop");
		   }
	    @Test(groups= {"sanity"}, priority=4)
	  public void verifyGoogle() {
		  driver.get("https://www.google.com/");
		  String pagetitle = driver.getTitle();
		  Assert.assertEquals(pagetitle, "Google");
		   }
	    @Test(groups= {"regression"}, priority=5)
		  public void verifyBOFA() {
			  driver.get("https://www.bankofamerica.com/");
			  String pagetitle = driver.getTitle();
			  Assert.assertEquals(pagetitle, "Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");
			   }
		  @Test(groups= {"regression"}, priority=6)
		  public void verifyICICI() {
			  driver.get("https://www.icicibank.com/");
			  String pagetitle = driver.getTitle();
			  Assert.assertEquals(pagetitle, "Personal Banking, Online Banking Services - ICICI Bank");
			   }
	  @Test (groups= {"sanity", "regression"}, priority=7)
	  public void closeBrowser() {
		  driver.close();
	  }
}
