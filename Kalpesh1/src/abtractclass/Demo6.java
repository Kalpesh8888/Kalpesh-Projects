package abtractclass;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class Demo6 {

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
