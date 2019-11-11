package selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelDataConfig(String excelPath) {
 		try {
			File src = new File(excelPath);
			FileInputStream fls = new FileInputStream(src);
			wb = new XSSFWorkbook(fls);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetNumber, int row, int column) {
		
		sh = wb.getSheetAt(sheetNumber);
		String data = sh.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
	public int getRow(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;
		return row;
	}
}
