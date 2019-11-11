package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBatch {

	public static WebDriver driver;
	static String url3;
	
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void adminLogin(String Uname, String Pwd) {
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(Pwd);
		driver.findElement(By.id("tdb1")).click();
	}
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	TestBatch obj = new TestBatch();
		
	//Test case 1: Verify Admin Login (Positive Test Case)
	obj.launchBrowser();
	obj.adminLogin("admin", "admin@123");
	String url = driver.getCurrentUrl();
	if(url.contains("http://www.gcrit.com/build3/admin/index.php"))
		System.out.println("Test Case 1: Admin Login Successful - PASS");
	else 
		System.out.println("Test Case 1: Admin login is unsuccessful - Failed");
	obj.closeBrowser();
		
	//Test Case 2: Verify “Error Message” in admin login functionality (Negative Test Case)
	obj.launchBrowser();
	obj.adminLogin("admin", "admin123");
	String errorMessage = driver.findElement(By.className("messageStackError")).getText();
	if(errorMessage.contains("Error: Invalid administrator login attempt."))
		System.out.println("Test Case 2: Admin Login Unsuccessful & showing correct Error Message - PASSED");
	else
		System.out.println("Test Case 2: Admin Login Successful/Unsuccessful & not showing correct Error Message - Failed");
	obj.closeBrowser();
	
	//Test Case 3: Verify Redirect Functionality (admin to user interface after login)
	obj.launchBrowser();
	obj.adminLogin("admin", "admin@123");
	String url2 = driver.getCurrentUrl();
	
	if (url2.contains("http://www.gcrit.com/build3/admin/index.php")) {
	 driver.findElement(By.linkText("Online Catalog")).click();
     url3 = driver.getCurrentUrl();
	}
	if (url3.equals("http://www.gcrit.com/build3/"))
	System.out.println("Test Case 3: Redirecting from Admin to user interface - Passed");
	else
		System.out.println("Test Case 3: Not Redirecting from Admin to user interface - Failed");
	driver.close();
	}	
}
