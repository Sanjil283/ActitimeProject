package com.ACtitime.GenereicLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this is a generic library class which contains all the generic methods
 * @author user
 *
 */

public class FileLibrary {
	/**
	 * This is a generic method which is used to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */

	public String readFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/commondata1.property");
		Properties p=new Properties();
		p.load(fis);
		p.getProperty(key);
		
		return key;
		
		
	}
	
	public String ReadDatafromExcel(String sheet,int row,int column) throws EncryptedDocumentException, IOException
	{
	/**
	 * This method is a generic method which is used to read the data from excel sheet
	 */
		FileInputStream fis=new FileInputStream("./testdata/xyz.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value=wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		
		return value;
		
		
		
		
	}
	
	
}
