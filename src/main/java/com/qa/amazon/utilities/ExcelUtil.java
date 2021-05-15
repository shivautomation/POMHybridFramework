package com.qa.amazon.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelUtil {
	public WebDriver driver;
	private static Workbook book;
	private static Sheet sheet;
	

	
public static Object[][] getRegistrationTestData(String SheetName) {
		
		String sheetpath= "./src/main/java/com/qa/amazon/testdata/TutorialNinja_TestData.xlsx";
		
		Object[][] data=null;
		
		
		try {
			FileInputStream ip=new FileInputStream(sheetpath);
			book= WorkbookFactory.create(ip);
			sheet=book.getSheet(SheetName);
			
			 data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for (int i=0;i<sheet.getLastRowNum();i++) {
				for (int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					data[i][j]= sheet.getRow(i+1).getCell(j).toString();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return data;
		

}
}
