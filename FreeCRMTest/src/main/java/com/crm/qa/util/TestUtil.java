package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{

	public TestUtil() throws IOException {
		
	}

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
		
	}
	
//	public static String TESTDATA_SHEET_PATH = "C:\\Users\\lenovo\\eclipse-workspace\\"
	//		+ "FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCrmTestData.xlsx";
	
//	static Workbook book;
//	static Sheet sheet;

		
}
