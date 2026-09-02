package ExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import BrowserPage.chromeBrowser;
 

public class TestScenario extends  chromeBrowser {

	public static FileInputStream fis;

	public static XSSFWorkbook wb;

	public static XSSFSheet ws;

	public static HashMap<String, String> ExcelData(String excelcases) throws IOException {

		fis = new FileInputStream("src\\test\\resources\\AnotherExcelpage\\masterClass\\MasterData.xlsx");

		wb = new XSSFWorkbook(fis);

		ws = wb.getSheet("Sheet1");

		ArrayList<Row> ExcelRow = TestCasesData(ws, excelcases);

		HashMap<String, String> Hmap = new HashMap<String, String>();

		for (int i = 0; i < ExcelRow.size(); i++) {
			int noOfRows = ExcelRow.get(i).getLastCellNum();

			for (int j = 1; j < noOfRows; j++) {
				Hmap.put(ExcelRow.get(0).getCell(j).getStringCellValue(),
						ExcelRow.get(1).getCell(j).getStringCellValue());
			}
		}

		return Hmap;

	}

	private static ArrayList<Row> TestCasesData(XSSFSheet ws, String excelcases) {

		ArrayList<Row> testRow = new ArrayList<Row>();

		for (int i = 0; i <= ws.getLastRowNum(); i++) {
			if (ws.getRow(i) != null) {
				testRow.add(ws.getRow(i));

			}
		}

		ArrayList<Row> testcolumn = new ArrayList<Row>();

		for (int i = 0; i < testRow.size(); i++) {
			if (testRow.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(excelcases)) {
				testcolumn.add(testRow.get(i));
			}
		}

		return testcolumn;

	}

}
