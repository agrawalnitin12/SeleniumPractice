package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBatch2 {

    static String uName, Pwd;
    static int iteration = 0;

    public static void main(String[] args) {
	
    for (int i=1; i<=2; i++) {
		iteration = iteration + 1;
		
		if (i==1) {
			uName = "admin";
			Pwd = "admin@123";
		}
		else if (i==2) {
			uName = "abcdef";
			Pwd = "xyz123";
		}
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(uName);
		driver.findElement(By.name("password")).sendKeys(Pwd);
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
			System.out.println(iteration + ". admin login successful - PASS");
		else 
			System.out.println(iteration + ". admin login unsuccessful - Fail");
    driver.close();
	}
	}	
}
