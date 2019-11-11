package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindow {

	@Test
	public void handleWindow() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		Set<String> allWindows=driver.getWindowHandles();
		
		int count = allWindows.size();
		System.out.println("total window"+count);
		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
					driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
					driver.close();
				}
		}
		driver.switchTo().window(parent);
		driver.close();
	}
}
