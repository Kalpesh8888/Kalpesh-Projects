package c_vishal1.vishal1.Selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;



public class txtFileReader {
	public txtFileReader(File file) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("program is started");
		
    File file = new File("E:\\KALPESH\\KALPESH\\java//kalpesh.txt");
    
    FileReader fr= new FileReader(file);
    
    BufferedReader br = new BufferedReader(fr);
	 
	System.out.println(br.readLine());
		
		System.out.println("End of program");
}
}