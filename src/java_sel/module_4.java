package java_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class module_4 extends Browserlaunch{


	WebDriver driver;
	
	@Test
	public void mouseMovement() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.spicejet.com/");//launching spicejet website
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
			Thread.sleep(4000);
			driver.findElement(By.linkText("Hot Meals")).click();
			Thread.sleep(5000);
			String current_url=driver.getCurrentUrl();
			if(current_url.equals("https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true"))
					{
				System.out.println("Our mouse movement is successful");
			        }
			else
			{
				System.out.println("Our mouse movement is unsuccessful");
	        }
driver.close();
}
}
