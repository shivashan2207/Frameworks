package org.combined;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateExcelWorkbook {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("country-list"));
		
		Select select = new Select(findElement);
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frameworks\\Excel\\Test.xlsx");
	//	FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		//to get the select number of country(options.size to change----->number(12)
		for (int i = 0; i < options.size(); i++) {
			
			Row createRow = sheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(options.get(i).getText());
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);
		}
	

	}

}
