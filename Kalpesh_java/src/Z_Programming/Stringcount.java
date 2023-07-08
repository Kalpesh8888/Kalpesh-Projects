package Z_Programming;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A =" ram ram "; 
		int count= 0;
		 
		for (int i=0; i<A.length(); i++)
		
		{
		    if(A.charAt(i)!=' ')
		
		    {   count++;	}
		
		}
		
		System.out.println(count);
		
  
		// Space consider
		
	  String B =" ram ram "; int count1= 0; 
		 
		for (int i=0; i<B.length();i++)
		{
		   count1++;
		   
			}
		
		System.out.println(count1);
		
		
		
		
	}

}
