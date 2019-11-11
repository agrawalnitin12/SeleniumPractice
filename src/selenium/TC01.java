package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 {

	@Test
	public void loginToApp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Functions fnc = new Functions(driver);
		fnc.startBrowser();
		fnc.login("admin","admin@123");
		fnc.closeBrowser();
	}
}
