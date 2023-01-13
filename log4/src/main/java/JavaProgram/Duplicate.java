package JavaProgram;

import java.util.Arrays;
import java.util.HashMap;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Duplicate d= new Duplicate();
		String n="hii my name is rajkumar";
		char[] c = n.toCharArray();
		Arrays.sort(c);
		//int a[]= {1,2,1,3,2,4,5,1};
	
		int count=0;

		
		for( int i=0;i<n.length();i++) {
			count=1;
			for(int j=i+1;j<n.length();j++) {
				if (c[i]==c[j]) {
					count++;
				}
				else {
					break;
				}
			}
			if(count>1 && c[i]!=' ') {
			System.out.println(c[i]+" ="+count);
			}
			i+=count-1;
			
	
		
	}
		
	}
	
	
	public Duplicate() {
		  int a[]= {10,20,30,40,40,50,40};
		   for (int i=0;i<a.length;i++) {
			   
			   for(int j=i+1;j<a.length;j++) {
				   
				   if(a[i]==a[j]) {
					   
					   System.out.println(a[i]);
					   break;
					   
					   
				   }
				   
				   
				   
				   
			   }
			   
		   }
			   
		   

	}
    
 

   
   
		
		
	


}



