package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 extends ClassP{

	  @Test(priority=4)
	  public void verifyBOFA() {
		  driver.get("https://www.bankofamerica.com/");
		  String pagetitle = driver.getTitle();
		  Assert.assertEquals(pagetitle, "Bank of America - Banking, Credit Cards, Home Loans and Auto Loans");
		   }
	  @Test(priority=5)
	  public void verifyICICI() {
		  driver.get("https://www.icicibank.com/");
		  String pagetitle = driver.getTitle();
		  Assert.assertEquals(pagetitle, "Personal Banking, Online Banking Services - ICICI Bank");
		   }
	    @Test(priority=6)
	  public void verifyHSBC() {
		  driver.get("https://www.hsbc.co.in/");
		  String pagetitle = driver.getTitle();
		  Assert.assertEquals(pagetitle, "HSBC India - Credit Cards, NRI Services, Loans, Mortgages");
		   }
}
