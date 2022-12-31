package krishna.radhe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_file001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	Properties P = new Properties();
	
	FileInputStream Fi = new FileInputStream("C:\\Users\\Right Click\\eclipse-workspace\\radhe\\src\\test\\java\\File001.properties");
	
	P.load(Fi);
	System.out.println(P.getProperty ("browser"));
	System.out.println(P.getProperty("Url")); 
	

  FileOutputStream Fil = new FileOutputStream("C:\\Users\\Right Click\\eclipse-workspace\\radhe\\src\\test\\java\\File001.properties");
	P.store(Fil, null);
  
	P.setProperty("browser", "Microsoft Edge");
    
	System.out.println(P.getProperty ("browser"));
	
	}

}
