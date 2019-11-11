package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
	
	  @Test(groups = {"regression", "sanity"}, priority = 1)
	  public void launchBrowser() {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  @Test(groups = {"regression", "sanity"}, priority = 8)
	  public void closeBrowser() {
		  driver.quit();
	  }
	
	@Test(groups = {"regression"}, priority = 3)
	public void hsbcTitle() {
		driver.get("https://www.hsbc.co.in/");
		String title = driver.getTitle();
		Assert.assertEquals("HSBC India - Credit Cards, NRI Services, Loans, Mortgages", title);
	}

	@Test(groups = {"regression", "sanity"}, priority = 2)
	public void bofaTitle() {
		driver.get("https://www.bankofamerica.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Bank of America - Banking, Credit Cards, Loans and Investing", title);
	}

	@Test(groups = {"sanity"}, priority = 7)
	public void yesTitle() {
		driver.get("https://www.yesbank.in/");
		String title = driver.getTitle();
		Assert.assertEquals("Personal Banking & Corporate Banking Services in India – YES BANK", title);
	}

	@Test(groups = {"regression","sanity"}, priority = 6)
	public void googleTitle() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Google", title);
	}

	@Test(groups = {"sanity"}, priority = 5)
	public void gcrTitle() {
		driver.get("http://www.gcrit.com/build3/");
		String title = driver.getTitle();
		Assert.assertEquals("GCR Shop", title);
	}

	@Test(groups = {"regression"}, priority = 4)
	public void yahooTitle() {
		driver.get("https://in.yahoo.com/?p=us");
		String title = driver.getTitle();
		Assert.assertEquals("Yahoo India", title);
	}

}
