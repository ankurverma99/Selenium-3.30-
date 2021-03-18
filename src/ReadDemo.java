import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDemo {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./Data/Demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rCount = sh.getPhysicalNumberOfRows();
		int cCount = sh.getRow(0).getLastCellNum();
		System.out.println("Row count:" + rCount + " col count: " + cCount);
		for (int i = 0; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.print(cl.toString() + "  ");
			}
			System.out.println();
		}
	}

	public static String readCellValue(String sheet, int row, int col) throws Exception {
		FileInputStream fis = new FileInputStream("./Data/Demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Cell cl = sh.getRow(row).getCell(col);
		String val = cl.toString();
		return val;

	}

}
