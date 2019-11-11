package selenium;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataAddition {
	
@Test (dataProvider="testData")
public void addition(String num1, String num2, String num3, String num4) {
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = Integer.parseInt(num3);
		int d = Integer.parseInt(num4);
		int result = (a+b+c+d);
        Assert.assertEquals(result, a+b+c+d);
}
		
@DataProvider (name ="testData")
public Object[][] readExcel () throws BiffException, IOException{
	File f = new File("C:\\Users\\lgeil\\Desktop\\input.xls");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet("Sheet2");
	
	int columns = s.getColumns();
	int rows = s.getRows();
	
	String input [][] = new String [rows] [columns];
	for (int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			Cell c =s.getCell(j,i);
			input[i][j]=c.getContents();
		}
	}
	return input;
	}
}
