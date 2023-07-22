package org.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Object value;
	public static  void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	// 1. get Url
	public static void geturl(String url) {
		driver.get(url);
	
	}
	
	//2.Maximize Window
	public static void maximizewindow() {
	 driver.manage().window().maximize();
	}
	
	// 3. Insert value In textBox
	public void insertvaluetextbox(WebElement element ,String value) {
		element.sendKeys(value);
		}
	
	// 4. Click
	public void elementclick(WebElement element) {
		element.click();
	}
	
	// 5. get Tittle
	public String gettitle() {
		String title = driver.getTitle();
		return title;

	}
	
	// 6. Find Elementby Id 
	public WebElement findElementById(String value) {
		WebElement element = driver.findElement(By.id(value));
		return element;

	}
	
	// 7. Find Elementby Name
	public WebElement findelementbyname(String value) {
		WebElement element = driver.findElement(By.name(value));
		return element;
		}
	
	// 8. Ok Alert
	public void okAlert(Alert a) {
		a.accept();
		
	}
	
	// 9. Cancel Alert
	public void canelAlert(Alert b) {
		b.dismiss();
	}
	
	// 10. Get Text from WebPage
	public static String textWebPage(WebElement element ) {
		String text = element.getText();
		return text;
	}
	
	// 11. Get Value From TextBox
    public String valueFromTextbox(WebElement element, String value) {
	String attribute = element.getAttribute(value);
	return attribute;
}
    
    // 12. Close All Window
    public void closeAllWindow() {
	driver.quit();

}
    
    // 13. Close Current Window
    public void closeCurrentWindow() {
	driver.close();
}
    
    // 14. Get Current Url
    public String entredUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;

}
    
    // 15. Select Dropdown By Text
    public void selectByText( WebElement element,String text) {
    	Select s = new Select(element);
	s.selectByVisibleText(text);
        
}
    
    // 16. Select By Index
    public void selectByIndex(WebElement element,int index) {
    	Select s = new Select(element);
	s.selectByIndex(0);

}
    
    // 17. Select By Value
    public void selectByValue(WebElement element,String value) {
    	Select s = new Select(element);
    	s.selectByValue(value);

}
    
    // 18. Deselect by Index
    public  void deselectByIndex(WebElement element,int index) {
	Select s = new Select(element);
    	s.deselectByIndex(index);

}
    
    // 19. Deselect by Visible Text
    public void deselectByVisibleText(WebElement element,String data) {
	 Select s = new Select(element);
    	s.deselectByVisibleText(data);
}
    
    // 20. DeSelect by Value
    public void deselectByvalue(WebElement element,String value) {
    	Select s = new Select(element);
    	s.deselectByValue(value);

}
 
    // 21. Get Option By Dropdown Attribute
    public List<WebElement> optionByDropDownAttribute(WebElement element,String value) {
	Select s = new Select(element);
    List<WebElement> options = s.getOptions();
	for (WebElement webElement : options) {
	String attribute = webElement.getAttribute(value);
	System.out.println(attribute);
	}
	return options;
} 
    
    // 22. Insert Value by Java Script
    public WebElement insertValueByJavaScript(String value,WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','+greens+')", element);
	return element;	
}
    
    // 23. Click Using Java Script
    public WebElement clickUsingJs(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", element);
 	return element;
}
    
    // 24. Switch to Child Window
    public String switchToChildWindow(WebElement element,int index) {
	String windowHandle = driver.getWindowHandle();
	Set<String> allwindowHandles = driver.getWindowHandles();
	List<String>li = new ArrayList();
	li.addAll(allwindowHandles);
	String childWindowId = li.get(index);
	driver.switchTo().window(childWindowId);
	return childWindowId;                                                                                                                      
}
    
    // 25. Switch to Frame By Index
    public void frameByIndex(int i) {
	driver.switchTo().frame(i);
	
}
    
    // 26. Switch To Frame By Id
    public void frameById(String value) {
	driver.switchTo().frame(value);
	
}
    
    // 27. Find Locator By Id
    public WebElement locatorById(String value) {
	WebElement findElement = driver.findElement(By.id(value));
	return findElement;
}
    
    // 28. Find Locator By Name
    public WebElement locatorByName(String value) {
	WebElement element = driver.findElement(By.name(value));
	return element;
}
    
    // 29. Find Locator By ClassName
    public WebElement locatorByClassName(String value) {
	WebElement element = driver.findElement(By.className(value));
	return element;
}

    // 30. Find Locate By Xpath
    public static WebElement locatorByXpath(String attributevalue) {
	WebElement element = driver.findElement(By.xpath(attributevalue));
	return element;
}
    
    // 31. Get Option From Dropdown As Text
    public List<WebElement> optionFromDropDownAsText(WebElement element ) {
    	Select s = new Select(element);
    List<WebElement> options = s.getOptions();
    for (WebElement eachoptions : options) {
    String text = eachoptions .getText();
   	System.out.println(text);
	
}
	return options;

}
    
    // 32. First Select Option Text From Dropdown
    public WebElement firstSelectedoptionTextFromDropDown(WebElement element,String Value) {
    	Select s = new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	String text = firstSelectedOption.getText();
	return firstSelectedOption;
}
    
    // 33.Multi Select Option
    public boolean multiSelectOption(WebElement element) {
    	Select s = new Select(element);
	boolean multiple = s.isMultiple();
	return multiple;
}
    
    // 34. Implicit Wait
    private void implicitWait() {
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);	

}
    
    // 35. Explicit Wait Visibility Of
    public void explicitWaitVisibityof(WebDriverWait w,WebElement element) {
	w.until(ExpectedConditions.visibilityOfElementLocated((By) element));
}
    
    // 36. Parent Window
    public String parentWindow() {
	String parentwindowHandle = driver.getWindowHandle();
	return parentwindowHandle;
}
    
    // 37. Clear 
    public void clearBox(WebElement element) {
	element.clear();
	
}
    
    // 38. Refresh Page
    public void refreshPage() {
	driver.navigate().refresh();
}
    
    // 39. All Windows
    public Set<String> allwindow() {
	Set<String> allwindowId = driver.getWindowHandles();
	List<String> li = new ArrayList();
	li.addAll(allwindowId);
	return allwindowId;
} 
    
    // 40. Double Click
    public void doubleClick(Actions a,WebElement element) {
	a.doubleClick(element).perform();
}
    
    // 41. Take ScreenShot
    public File takeScreenShot(String pathname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(pathname);
	FileUtils.copyFile(src, dest);
	return src;
}
    
    //42. Right Click
    public void rightlick(Actions a) {
	a.contextClick().perform();
}
    
    // 43. Single Option
    public void singleOption(Actions a,WebElement element) {
	a.moveToElement(element).perform();
}
    
    // 44. Drag And Drop
    public void dragAndDrop(Actions a,WebElement element) {
	a.dragAndDrop(element,element).perform();
}
    
    // 45. Insert Value
    public void insertValue(WebElement element,String value) {
	element.sendKeys(value+Keys.ENTER);

}
    
    // 46. Navigate To
    public void navigateTo(String url) {
	driver.navigate().to(url);
	
}
    
    // 47. Navigate Back
    public void navigateBack() {
	driver.navigate().back();
}
    
    // 48. Navigate Forward
    public void navigateForward() {
	driver.navigate().forward();	
}
    
    // 49. Take ScreenShot for Element
    public static File screenShotForElement(WebElement element,String pathname) throws IOException  {
	TakesScreenshot ts = (TakesScreenshot)element;
	File elementsrc = ts.getScreenshotAs(OutputType.FILE);
	File elementdest = new File(pathname);
	FileUtils.copyFile(elementsrc, elementdest);
	return elementdest;
}

    // 50. Read Cell Data From Excel Sheet
    public static String readCellData(String sheetname,int index1,int Index2) throws IOException {
	String res="";
	File file = new File("C:\\Users\\Gowtham\\eclipse-workspace\\FrameWork\\ExcelSheeet\\Data.xlsx");
	FileInputStream fileInputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(index1);
	Cell cell = row.getCell(Index2);
	CellType cellType = cell.getCellType();
	
	switch (cellType) {
	
	case STRING:
     res= cell.getStringCellValue();
     
     break;
     
	case NUMERIC:
		if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
			res = dateFormat.format(dateCellValue);
			
		} else {
			double numericCellValue = cell.getNumericCellValue();
			BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
			long round = Math.round(numericCellValue);
			res = valueOf.toString();

		}break;
		default: break;
	}
	return res;
	}
    
    //update value in your excel 
    public static void updateCellData(String sheetname,int rownum,int cellnum,String oldData,String newdata) throws IOException {
    	File f = new File("C:\\\\Users\\\\Gowtham\\\\eclipse-workspace\\\\FrameWork\\\\ExcelSheeet\\\\Details.xlsx");
    	FileInputStream fileInputStream = new FileInputStream(f);
    	Workbook wrk = new XSSFWorkbook(fileInputStream);
    	Sheet sheet = wrk.getSheet(sheetname);
    	Row row = sheet.getRow(rownum);
    	Cell cell = row.getCell(cellnum);
    	String stringCellValue = cell.getStringCellValue();
    	
    	if (value.equals(oldData)) {
			cell.setCellValue(newdata);
		}
    	FileOutputStream fileOutputStream = new FileOutputStream(f);
    	wrk.write(fileOutputStream);	
    }
    //to insert cell data
    	public void writeCellData(String sheetname,int rownum,int cellnum,String data) throws IOException {
    		File f = new File("C:\\\\Users\\\\Gowtham\\\\eclipse-workspace\\\\FrameWork\\\\ExcelSheeet\\\\Data.xlsx");
        	FileInputStream fileInputStream = new FileInputStream(f);
        	Workbook wrk = new XSSFWorkbook(fileInputStream);
        	Sheet sheet = wrk.getSheet(sheetname);
        	Row row = sheet.getRow(rownum);
        	Cell cell = row.createCell(cellnum);
        	cell.setCellValue(data);
        	FileOutputStream fileOutputStream = new FileOutputStream(f);
        	wrk.write(fileOutputStream);	  
    	}
        	 // Get Attribute Value
        	public static String getAttribute(WebElement element) {
    			String attribute = element.getAttribute("value");
    			return attribute;


	}
    
}
