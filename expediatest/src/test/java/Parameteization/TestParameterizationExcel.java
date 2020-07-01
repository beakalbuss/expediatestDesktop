package Parameteization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class TestParameterizationExcel{
	
	public static ExcelReader excel = null;
	
	
	@Test(dataProvider = "getData")
	public void testData(String username, String password, String is_correct) {
		System.out.println(username+"......"+ password+"......"+ is_correct+".....");
		
	}
	
	
 @DataProvider
	public static Object[][] getData(){
	
	 
	 	if (excel == null) {
	 		excel = new ExcelReader("c:\\ECLIPSE DRIVERS\\usernamePasswrd.xlsx");
	 	}
	 	
	 	String sheetName = "LoginTest";
	 	int rows = excel.getRowCount(sheetName);
	 	int colms = excel.getColumnCount(sheetName);
	 	
		Object[][] data = new Object[rows-1][colms];	
		for(int rowNum = 2; rowNum<=rows; rowNum++) {
			
			for(int colNum =0; colNum<colms; colNum++) {
		data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
		}
		
		}
		return data;

 }
}
 

// File f= new File("C:\\ECLIPSE DRIVERS\\usernamePasswrd.xlsx");
// FileInputStream fi = new FileInputStream(f);