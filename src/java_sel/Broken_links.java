package java_sel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Broken_links {
	WebDriver driver;
	List<WebElement> links;
	List<WebElement> activelinks;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");// launching spicejet website
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void link_count() {
		links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));

		// for(int i=0;i<links.size();i++)
		// {
		// System.out.println(links.get(i).getAttribute("href"));
		// }
		System.out.println(links.size());
	}

	@Test(priority = 1)
	public void avoid_null() {

		activelinks = new ArrayList<WebElement>();
		System.out.println("hello*****");
		for (int i = 0; i < links.size(); i++) {

			if (links.get(i).getAttribute("href") != null && (!links.get(i).getAttribute("href").contains("javascript"))
					&& (!links.get(i).getAttribute("href").contains("mailto")))

				activelinks.add(links.get(i));

		}
		System.out.println("total active links are:" + activelinks.size());

	}

	@Test(priority = 2)
	public void ckeck_connection() throws MalformedURLException, IOException {
		for (int i = 0; i < activelinks.size(); i++) {
			HttpURLConnection connect = (HttpURLConnection) new URL(activelinks.get(i).getAttribute("href"))
					.openConnection();
			connect.connect();
			String msg = connect.getResponseMessage();
			connect.disconnect();
			System.out.println(activelinks.get(i).getAttribute("href") + "==>" + msg);
		}
		System.out.println("checked all connection");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
