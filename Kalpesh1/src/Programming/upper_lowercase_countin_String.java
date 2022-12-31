package Programming;

import java.util.Scanner;

public class upper_lowercase_countin_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
		
		   String B="KalpeshPatil";
		    
		    int UpperCount=0 ;
		    int Lowercount=0;
		   
		    for(int i=0;i<B.length();i++)
		   
		    {  if(B.charAt(i)>=65 && B.charAt(i)<=90)
		    {  
		    	UpperCount++;
		    }
		    	
		    else 
		    {
		    	Lowercount++;
		    }
		    }
		
		System.out.println("count of Uppercase="+UpperCount);
		
		System.out.println("count of Lowercase="+Lowercount);
		
			}
	}

