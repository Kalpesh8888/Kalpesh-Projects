package JavaProgram;

import java.util.Arrays;
import java.util.HashMap;

public class whilelooop {

	public static void main(String[] args) {
		
		String name="my name is rajkumar ";
		
		
		int i=0;
		int len = name.length();
		String word="";
		String rev="";
		
		while(i<len) {
			
			char c = name.charAt(i);
			if(c!=' ') {
				word=word+c;
			}
			
			else {
				rev=word+" "+rev;
				word="";
			}
			i++;
			//System.out.println(rev);
		}
		System.out.println(rev);
	
		
}
}