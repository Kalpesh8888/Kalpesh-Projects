import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datafeach1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		FileInputStream fis = new FileInputStream("E://KALPESH//KALPESH//selenium//Excrl1.xlsx");
				
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				
		           int	sheets = workbook.getNumberOfSheets();
		         
		         for(int i=0; i<sheets ; i++)
		         {
		        	 if(workbook.getSheetName(i).equalsIgnoreCase("New01"))
		        	 {
		        		XSSFSheet sheet =workbook.getSheetAt(i);
		        		
		        		Iterator<Row> rows= sheet.iterator();
		        		
		        	 Row	firstrow =rows.next();
		        	
		        	
		       // Row	secondrow =rows.next();
		        	
		        	Iterator<Cell>  cel = firstrow.iterator();
		        	
		        	int j = 0;
		        	int column = 0;
		        	while(cel.hasNext())
		        	
		        	{
		        	 Cell  value =cel.next();
		        	 if(value.getStringCellValue().equalsIgnoreCase("Test"))
		        	
		        	 {column = j;}
		        	 
		        	 j++;
		        	}
		        	System.out.println(column);
		        	
		        /*	while(rows.hasNext())
		        	{
		        Row	r	= rows.next();
		       if(r.getCell(column).getStringCellValue().equalsIgnoreCase(name))
		       {
		    	
		    	Iterator<Cell> s = r.cellIterator();
		    	
		    	while(s.hasNext())
		    	{
		    		System.out.println(s.next().getStringCellValue()); */
		    	}
		    	
		       }
	}
		        	 
		         
			
	

}
