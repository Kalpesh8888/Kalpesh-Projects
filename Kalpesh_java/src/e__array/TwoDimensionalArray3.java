package e__array;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// More example of single & Two Dimensional Array
		
		String[] a= new String[3];
		  
		  a[0]="kalpesh";
		  a[1]="vicky";
		  a[2]= "kunal";
		  
		  for (String x:a)
		 { System.out.println(x);}
		  
	System.out.println("*************************");
		   
	String b[][]= {{"prassna","vishal","ashish","laxmikant","tushar"},
		    		
		    		{"rupali","vidya","vishkaha"}};
		  
	 /*		for(int C=0; C<b.length;C++)
			{
		     for (int d=0; d<b[0].length;d++)
		    
			{System.out.println(b[C][d]);}
			 System.out.println(" ____ ");   
			}
		   
		   exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:Index 3 out of bounds for length 3
		  at e__array.TwoDimensionalArray3.main(TwoDimensionalArray3.java:29) 
		   due to  1st array 5 values & 2nd array 3 values so overcome we use for loop
		    
		    */
		  for (String x[]:b) 
			{
				for (String y:x)
			
			 {
			System.out.print(y+"---");
		  }
			System.out.println(" ______  "); 
			}
	}

}
