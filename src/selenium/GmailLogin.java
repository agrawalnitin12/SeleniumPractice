package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lgeil/Desktop/Table.html");
		WebElement table = driver.findElement(By.tagName("table"));
		List <WebElement> rows = table.findElements(By.tagName("tr"));
		int rowscount = rows.size();
		System.out.println(rowscount);
		System.out.println(rows);
		
		List <WebElement> cells = table.findElements(By.tagName("td"));
		int cellscount = cells.size();
		System.out.println(cellscount);
		
		String cellvalue = table.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(cellvalue);
		System.out.println(cellscount/rowscount);
	 	 }
}
