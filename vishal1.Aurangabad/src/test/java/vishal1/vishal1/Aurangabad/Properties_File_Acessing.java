package vishal1.vishal1.Aurangabad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_File_Acessing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		Properties p = new Properties();
	    
	    FileInputStream File = new FileInputStream("C:\\Users\\Right Click\\eclipse-workspace\\vishal1.Aurangabad\\src\\test\\java\\vishal1\\vishal1\\Aurangabad\\File001.properties");
	    
	    p.load(File);
	    System.out.println(p.getProperty("Browser"));
	    
	    System.out.println(p.getProperty("URL"));
	    
	    p.setProperty("Browser", "EdgeDriver");
	    System.out.println(p.getProperty("Browser"));
	    
	    FileOutputStream Outfile = new FileOutputStream("C:\\Users\\Right Click\\eclipse-workspace\\vishal1.Aurangabad\\src\\test\\java\\vishal1\\vishal1\\Aurangabad\\File001.properties");
	    
	    p.store(Outfile, null);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
