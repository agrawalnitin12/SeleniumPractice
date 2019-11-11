package selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\lgeil\\Desktop\\InputData.xlsx");
		FileInputStream fls = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fls);
		XSSFSheet sh = wb.getSheetAt(0);
		int rowscount = sh.getLastRowNum();
		for (int j=0;j<2;j++) {
		for (int i=0;i<=rowscount;i++) {
			String data = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		}
		wb.close();
		}

}
