package org.combined;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadGetExcelSheet {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frameworks\\Excel\\Data.xlsx");
		
		// get the object from file
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//workBook
		Workbook wrk = new XSSFWorkbook(fileInputStream);
		
		// sheet
		Sheet sheet = wrk.getSheet("Dask");
		
		// row
		Row row = sheet.getRow(1);
		
		// cell
		Cell cell = row.getCell(13);
		Cell cell2 = row.getCell(6);
		
		// cell type
		
		org.apache.poi.ss.usermodel.CellType type = cell.getCellType();
		
					// checking if it is string
		switch (type){
		case STRING:
			String value = cell.getStringCellValue();
			System.out.println(value);
			String value2 = cell2.getStringCellValue();
			System.out.println(value2);
			break;
			
					// checking if it is numeric
		case NUMERIC:
//			double numericCellValue = cell.getNumericCellValue();
//			double numericCellValue2 = cell2.getNumericCellValue();
//			BigDecimal bigDecimal = BigDecimal.valueOf(numericCellValue);
//			BigDecimal bigDecimal2 = BigDecimal.valueOf(numericCellValue2);
			
					// change the numeric to string
//			String string = bigDecimal.toString();
//			System.out.println(string);
//			String string2 = bigDecimal2.toString();
//			System.out.println(string2);
//			break;

//			long round = Math.round(numericCellValue);
//			if (numericCellValue==round) {
//				String valueOf = String.valueOf(numericCellValue);
//			} else
//			{
//				String valueOf = String.valueOf(round);
//			}
			if (DateUtil.isCellDateFormatted(cell)) {
					 java.util.Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/YYYY");
					String format = dateFormat.format(dateCellValue);
					System.out.println(format);
			
			}	else{
					
					double numericCellValue = cell.getNumericCellValue();
				    BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
					String string = valueOf.toString();
					System.out.println(string);
			}
					
			if (DateUtil.isCellDateFormatted(cell2)) {
				java.util.Date dateCellValue1 = cell2.getDateCellValue();
				SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MMM/YYYY");
				String format1 = dateFormat1.format(dateCellValue1);
				System.out.println(format1);
		
			} else {


				double numericCellValue1 = cell2.getNumericCellValue();
				BigDecimal valueOf1 = BigDecimal.valueOf(numericCellValue1);
				String string1 = valueOf1.toString();
				System.out.println(string1);
			}		
			
		default:
			break;		
		
			}
		
	}
}
