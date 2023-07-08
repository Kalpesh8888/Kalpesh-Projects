package c_vishal1.vishal1.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class L_Properties_File_Acessing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		Properties p = new Properties();
	    
	    FileInputStream File = new FileInputStream("C:\\Users\\Right Click\\eclipse-workspace\\vishal1.Aurangabad (SeleniumPratice)\\src\\test\\java\\c_vishal1\\vishal1\\Selenium\\File001.properties");
	    
	    p.load(File);
	    System.out.println(p.getProperty("Browser"));
	    
	    System.out.println(p.getProperty("URL"));
	    
	    p.setProperty("Browser", "EdgeDriver");
	    System.out.println(p.getProperty("Browser"));
	    
	    FileOutputStream Outfile = new FileOutputStream("C:\\Users\\Right Click\\eclipse-workspace\\vishal1.Aurangabad (SeleniumPratice)\\src\\test\\java\\c_vishal1\\vishal1\\Selenium\\File001.properties");
	    
	    p.store(Outfile, null);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
