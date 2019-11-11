package selenium;

import org.openqa.selenium.WebDriver;

public class Functions {

	WebDriver driver;
	
	public Functions(WebDriver driver) {
		this.driver = driver;
	}
	public void startBrowser() {
		driver.get("http://gcrit.com/build3/admin/");
	}
	public void closeBrowser() {
		driver.quit();
	}
	
	public void login(String uid, String pwd) {
		driver.findElement(LoginPage.uname).sendKeys(uid);
		driver.findElement(LoginPage.pwd).sendKeys(pwd);
		driver.findElement(LoginPage.clickBtn).click();
	}
}
