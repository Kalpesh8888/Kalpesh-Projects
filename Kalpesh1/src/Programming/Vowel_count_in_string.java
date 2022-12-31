package Programming;

public class Vowel_count_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     String A="Kalpeshpatil";
	    
	    int Vcount=0;
	    int Scount=0;
	    
	    A=A.toLowerCase();
	    
	    for(int i=0;i<A.length();i++)
   
    {  if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'|| A.charAt(i)=='u')	    
         {  
	    	Vcount++;
	    }
    
       else // if(A.charAt(i)!='a'||A.charAt(i)!='e'||A.charAt(i)!='i'||A.charAt(i)!='o'|| A.charAt(i)!='u')
    {
    	Scount++;
    }
	    }
	
	System.out.println("count of vowel="+Vcount);
	
	System.out.println("count of Simple="+Scount);
	
	
	
	
      // vOWELS PRESENT OR NOT
	
     String  B ="Automation testing in Ninja Project ";
	 
     B=B.toLowerCase();
     
      int  VowelCCount=0;
  
     for (int i=0 ;i<B.length();i++)
          
     {  
    	 if(B.charAt(i)=='a'||B.charAt(i)=='e'||B.charAt(i)=='i'||B.charAt(i)=='o'|| B.charAt(i)=='u')	    
        
    	 {  VowelCCount++;} }
    
     if(VowelCCount>0)
     
     { System.out.println(" Vowel is present");}
     
     else {System.out.println("Vowel is not present");}
     
     System.out.println(VowelCCount);
 

}
}