package selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {
	static String errorMessage;

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		
		FileReader file = new FileReader("C:\\Users\\lgeil\\Desktop\\Input.txt");
		BufferedReader br = new BufferedReader(file);
		
		int count =0;
     	int iteration = 0;
		String line;
		while ((line=br.readLine())!=null){
			count = count +1;
			if(count>1)
			{
				iteration = iteration+1;
				String [] inputData = line.split(", ", 2);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.gcrit.com/build3/admin/login.php");
				driver.findElement(By.name("username")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.id("tdb1")).click();
//				
//				String url = driver.getCurrentUrl();
//				if(!url.contains("http://www.gcrit.com/build3/admin/index.php")) {
//		     	errorMessage = driver.findElement(By.className("messageStackError")).getText();
//					System.out.println(errorMessage);
//				}
				errorMessage = driver.findElement(By.className("messageStackError")).getText();
				if((iteration == 4) && errorMessage.contains("The maximum number of login attempts"))
					System.out.println(iteration + "Maximum number of login attempts has been reached - PASSED");
				else 
					System.out.println(iteration + "Maximum number of login attempts are not over - Done");
//				else if (errorMessage.contains("Error: Invalid administrator login attempt."))
//				System.out.println("Admin login unsuccessful, but showing correct error message - PASSED");
//				else 
//					System.out.println("Admin login is unsuccessful & not showing correct error message - Failed");
					driver.close();
			}
		}
		br.close();
		file.close();
		}
}