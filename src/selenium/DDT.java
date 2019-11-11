package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {
	
  @Test (dataProvider = "TestData")
  public void f(String uname,String pwd) {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://gcrit.com/build3/admin");
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.id("tdb1")).click();
	  driver.close();
  }
  
  @DataProvider (name = "TestData")
  public Object[][] readData() throws Exception{
	  ExcelDataConfig config = new ExcelDataConfig("D:\\Java Test Program\\Selenium 3.0\\TestData\\InputData.xlsx");
	  int row = config.getRow(0);
	  String inputData[][] = new String [row][2];

	  for (int i=0;i<row;i++)
	  {
		  inputData[i][0] = config.getData(0, i, 0);
		  inputData[i][1] = config.getData(0, i, 1);
	  }
	  return inputData;
  }
  
}
