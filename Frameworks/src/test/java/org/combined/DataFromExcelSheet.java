package org.combined;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelSheet {
	public static void main(String[] args) throws IOException {
		// mention path of the file
		
				File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frameworks\\Excel\\Data.xlsx");
				
				// get the object from file
				
				FileInputStream fileInputStream = new FileInputStream(file);
				
				// create workbook
				
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				
				// sheet name
				
				Sheet sheet = workbook.getSheet("Dask");
				
				// row name
				
				//Row row = sheet.getRow(0);

				// cell name
				
			//	Cell cell = row.getCell(1);
				
				//System.out.println(cell);
				
				// to count the rows
				
//				int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//				System.out.println(physicalNumberOfRows);
//				
				// to count the cells
//				
//				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//				System.out.println(physicalNumberOfCells);
				
				//to print all the cells in one row
			
				for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
					 Row row1 = sheet.getRow(i);
				
				for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
					Cell cell1 = row1.getCell(j);
					
					System.out.println(cell1);
				}	 
	}}
}
