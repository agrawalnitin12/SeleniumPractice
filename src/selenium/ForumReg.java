package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumReg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcreddy.com/forum/");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("agreed")).click();
		driver.findElement(By.id("username")).sendKeys("nitin21");
		driver.findElement(By.id("email")).sendKeys("abcd@abc.com");
		driver.findElement(By.id("new_password")).sendKeys("abc123");
		driver.findElement(By.id("password_confirm")).sendKeys("abc123");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Confirmation code");
		String captcha = scan.nextLine();
		
		driver.findElement(By.id("confirm_code")).sendKeys(captcha);
		driver.findElement(By.id("submit")).click();
		try {
		String confirmation = driver.findElement(By.xpath("//*[@id=\'message\']/div/p")).getText();
		if (confirmation.contains("Your account has been created"))
			System.out.println("User Registration is successful - PASS");
		}
		catch(NoSuchElementException e1) {
			System.out.println("User Registration is unsuccessful - Fail");
		}
	}
}
