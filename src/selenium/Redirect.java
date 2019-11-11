package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redirect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gcrit.com/build3/admin/");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/"))
		System.out.println("Verification 1: Redirecting to user interface from Admin");
		else
			System.out.println("Verification 1: Not Redirecting to user interface from Admin");
		
		
		  driver.navigate().to("http://gcrit.com/build3/admin/");
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin@1234");
		  driver.findElement(By.id("tdb1")).click(); 
		  url = driver.getCurrentUrl(); 
		  if (url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			  System.out.println("Admin Login Successful");
			  driver.findElement(By.linkText("Online Catalog")).click();
		  }
		  url=driver.getCurrentUrl();
		  if(url.equals("http://www.gcrit.com/build3/"))
			  System.out.println("Verification 2: Redirecting to user interface from Admin" ); 
		  else 
			  System.out.println("Verification 2: Not Redirecting to user interface from Admin");
	}

}
