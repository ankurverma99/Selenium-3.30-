package Org.testngDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadData {

	@DataProvider
	public static String[][] read() throws Exception {
		String[][] st;
		FileInputStream fis = new FileInputStream("./Data/Demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		st = new String[sh.getPhysicalNumberOfRows() - 1][sh.getRow(0).getLastCellNum()];
		for (int i = 1; i < sh.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sh.getRow(0).getLastCellNum(); j++) {
				Cell cl = sh.getRow(i).getCell(j);
				st[i - 1][j] = cl.toString();
			}
		}
		return st;
	}

}
