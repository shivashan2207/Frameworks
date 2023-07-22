package org.combined;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellData {
	public static void main(String[] args) throws IOException {
		String file = "Data.xlsx";
		Workbook wrk = new XSSFWorkbook(file);
		Sheet sheetAt = wrk.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		for (int i = 0; i < args.length; i++) {
			Cell cell = row.getCell(1);
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
	}
}
}