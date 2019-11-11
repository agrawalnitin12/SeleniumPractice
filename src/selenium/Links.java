package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Create account")).click();
    Thread.sleep(2000);
    String currentURL = driver.getCurrentUrl();
    if(currentURL.contains("ICICIBANK"))
    	System.out.println("Internal Link-Pass");
    else
    	System.out.println("External link-Fail");
    
    driver.navigate().back();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("www.seleniumhq.org")).click();
    currentURL = driver.getCurrentUrl();
    if(currentURL.contains("wikipedia.org"))
    	System.out.println("External Link-Pass");
    else
    	System.out.println("Internal link-Fail");
    driver.navigate().back();
    driver.close();
	}

}
