package JavaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class FileHandel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream path = new FileInputStream("C:\\Users\\rajku\\OneDrive\\Documents\\ExcelTestData1.xlsx");
                 XSSFWorkbook wb = new  XSSFWorkbook(path);
                int sheets = wb.getNumberOfSheets();
                
               for (int i=0;i<sheets;i++) {
            	   if(wb.getSheetName(i).equalsIgnoreCase("SheeetA")) {
            		  XSSFSheet sheet = wb.getSheetAt(i);
            		  
            		  Iterator<Row> rows = sheet.rowIterator();
            		 Row firstrow = rows.next();
            		Iterator<Cell> cells = firstrow.iterator();
            		
            		int  c=0;
            		int position=0;
            		
            		while(cells.hasNext()) {
            			Cell cell = cells.next();
            			if(cell.getStringCellValue().equalsIgnoreCase("data1")) {
            				
            				position=c;
            				
            			}
            			c++;
            			}
            		System.out.println(position);
            		 
            		   }
            	   
            	   
               }
             
		
		
	}

}
