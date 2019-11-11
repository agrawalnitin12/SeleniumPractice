package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExistence {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	try {
	boolean linkPresent = driver.findElement(By.linkText("Yahoo")).isDisplayed();
	if(linkPresent == true)
		System.out.println("Gmail link exists - PASS");
	}catch(NoSuchElementException e1) {
	System.out.println("Gmail link not exists - Fail");
	}
	driver.close();
	}
}
