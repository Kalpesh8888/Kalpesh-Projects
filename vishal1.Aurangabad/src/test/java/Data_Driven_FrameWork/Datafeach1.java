package Data_Driven_FrameWork;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datafeach1 {

	public ArrayList<String> Exceldata(String name) throws Exception
	  {
	    ArrayList<String> a = new ArrayList();
	    
	    FileInputStream File = new FileInputStream("E://KALPESH//KALPESH//selenium//Excrl1.xlsx");
	    
	    XSSFWorkbook Workbook = new XSSFWorkbook(File);
	    
	    XSSFSheet sheet = Workbook.getSheet("New01");
	    

	    Iterator<Row> rows = sheet.iterator();
	    
	    Row firstrow = (Row)rows.next();
	    

	    Iterator <Cell> cells = firstrow.iterator();
	    
	    int j = 0;
	    int column = 0;
	    while (cells.hasNext())
	    {
	      Cell value = (Cell)cells.next();
	      if (value.getStringCellValue().equalsIgnoreCase("test"))
	      {
	        column = j; }
	      j++;
	    }
	    
	    System.out.println(column);
	    
	    while (rows.hasNext())
	    {
	      Row r = (Row)rows.next();
	      if (r.getCell(column).getStringCellValue().equalsIgnoreCase(name))
	      {

	        Iterator <Cell> s = r.cellIterator();
	        
	        while (s.hasNext())
	        {
	          Cell c = (Cell)s.next();
	          
	          if (c.getCellType() == CellType.STRING)
	          {

	            a.add(c.getStringCellValue());
	          }
	          else {
	            a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
	          }
	        }
	      }
	    }
	    
	    return a;
	  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
