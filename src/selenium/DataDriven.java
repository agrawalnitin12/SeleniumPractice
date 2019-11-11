package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	
	WebDriver driver;
	
	@Test (dataProvider = "testdata")
	public void adminLogin(String UName, String Pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(UName);
		driver.findElement(By.name("password")).sendKeys(Pwd);
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"http://www.gcrit.com/build3/admin/index.php");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@DataProvider (name = "testdata")
	public Object[] [] readExcel() throws BiffException, IOException {
		File f = new File("C:\\Users\\lgeil\\Desktop\\input.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getRows();
		int columns = s.getColumns();
		
		String input [][] = new String [rows][columns];
		
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				Cell c=s.getCell(j,i);
				input[i][j]=c.getContents();
			}
		}
		return input;
	}

}
