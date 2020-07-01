package Parameteization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadWriteExcel {
	
	
	@Test
	public void writingExcel() throws IOException {
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet0 = workbook.createSheet("firstSheet");
		
		Row row0 = sheet0.createRow(0);
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("first Cell");
		cellB.setCellValue("second Cell");
		
		
		// Conecting streams
		File f= new File("C:\\ECLIPSE DRIVERS\\usernamePasswrd2.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);
		fo.close();
		
		System.out.println("File Created");
	}

}
