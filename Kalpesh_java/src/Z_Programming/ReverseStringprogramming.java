package Z_Programming;

public class ReverseStringprogramming {
  
	  // Reverse String  Programming 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String A ="Kalpesh";
		
		for ( int i=A.length()-1 ;i>=0 ; i--)
			
		{
			System.out.print(A.charAt(i));
		}
		*/
		
		
		 //orrr             IMPORAMTAT sTRING REVERSE PROGRAM
		
		String str = "Hello world i am kalpesh ";

         String revString = "";

		  for (int i = str.length()- 1; i >= 0; --i)
		  {
		   revString += str.charAt(i);
		  }
		  
		  System.out.println(revString);
		
		
		
		
		
		
	}

}
