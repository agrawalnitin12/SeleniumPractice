package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    Thread.sleep(3000);
    Actions builder = new Actions(driver);
    
    WebElement ele = driver.findElement(By.partialLinkText("Hello,"));

    builder.moveToElement(ele).build().perform();
    //builder.click(ele).build().perform();
    driver.findElement(By.xpath("//*[@id=\'nav-flyout-ya-signin\']/a/span")).click();
	driver.findElement(By.id("ap_email")).sendKeys("9953790460");
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("ap_password")).sendKeys("LGsoft123");
    driver.findElement(By.id("signInSubmit")).click();
    WebElement ele2 = driver.findElement(By.partialLinkText("Account & Lists"));
    builder.moveToElement(ele2).build().perform();
    driver.findElement(By.linkText("Sign Out")).click();
    }

}
