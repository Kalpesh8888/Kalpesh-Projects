package JavaProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandle2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rajku\\OneDrive\\Documents\\ExcelTestData1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetCount = workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetCount;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("SheetA")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				
				Row firstRow = rows.next();
					
				Iterator<Cell> cells = firstRow.iterator();
				
				int c = 0;
				
				int columnpostion = 0;
				
				while(cells.hasNext()) {
					
					Cell cell = cells.next();
					
					if(cell.getStringCellValue().equalsIgnoreCase("tests")){
						
						columnpostion = c;
						
						
					}
					
					c++;
					
			
					
				}
			
				 
				
				while(rows.hasNext()) {
					
					Row row = rows.next();
					
					Cell cell = row.getCell(columnpostion);
					
					if(cell.getStringCellValue().equalsIgnoreCase("Register")) {
						
						Iterator<Cell> citr = row.iterator();
						
						while(citr.hasNext()) {
							
							
							System.out.print(citr.next().getStringCellValue()+" ");
							
						}
						
					}
					
				}
				
			workbook.close();
			
				
					
				}
				
		}
	}
}

