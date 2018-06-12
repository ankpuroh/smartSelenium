package com.test.automation.selenium.testScripts.tokenManager;

//import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

//import org.apache.poi.xssf.usermodel.XSSFCell;           
//import org.apache.poi.xssf.usermodel.XSSFRow;           
//import org.apache.poi.xssf.usermodel.XSSFSheet;   
import org.apache.poi.xssf.usermodel.XSSFWorkbook;            
//import org.apache.poi.hssf.usermodel.HSSFCell;           
//import org.apache.poi.hssf.usermodel.HSSFRow;           
//import org.apache.poi.hssf.usermodel.HSSFSheet;   
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadCardToken {    
	
	/*private static XSSFWorkbook xlsxExcelWBook;                
	private static XSSFSheet xlsxExcelWSheet;
	private static XSSFRow xlsxRow;
	private static XSSFCell xlsxCell;
	private static HSSFWorkbook xlsExcelWBook;                
	private static HSSFSheet xlsExcelWSheet;
	private static HSSFRow xlsRow;
	private static HSSFCell xlsCell;*/ 
	private static Workbook excelWBook = null;
	private static Sheet excelWSheet = null;
	private static Row row = null;
	private static Cell cell0 = null;
	private static Cell cell1 = null;
		
	public Map getCardToken(String filename, String sheetname) throws Exception
	
	{
		//String fileName = System.getProperty("user.dir") + File.separatorChar+"Driver.xlsx";
		//ArrayList<String> tokenList = new ArrayList<String>();
		HashMap<String,String> hm=new HashMap<String,String>();  
		FileInputStream ExcelFile = null;
		String tokenno = null;
		String cardno = null;
		ExcelFile = new FileInputStream(filename);
		String fileExtension = filename.substring(filename.indexOf("."));
		
		if(fileExtension.equals(".xls"))
		{
			excelWBook = new HSSFWorkbook(ExcelFile);
			
		}
		
		else if(fileExtension.equals(".xlsx"))
		{
			excelWBook = new XSSFWorkbook(ExcelFile);
		}
				                   
		excelWSheet = excelWBook.getSheet(sheetname);
		int rowCount = excelWSheet.getLastRowNum();
				
		for(int i=1; i<rowCount; i++){
			
			row = excelWSheet.getRow(i);
			cell0 = row.getCell(0);
			cardno = cell0.getStringCellValue();
			cell1 = row.getCell(1);
			tokenno = cell1.getStringCellValue();
			hm.put(cardno, tokenno);
		}
		
		
		return (hm);

	}
	
			
}
	
