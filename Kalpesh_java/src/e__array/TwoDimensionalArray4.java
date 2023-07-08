package e__array;

public class TwoDimensionalArray4 {

	public static void main(String[] args) {
		
		// More example of single & Two Dimensional Array
		
		String[] X= new String[4];
		  X[0]="Aurangabad";
		  X[1]="Nashik";
		  X[2]= "pune";
		  X[3]="Beed";
		  
		    for (String a:X)  // for each loop
		 { 
		   System.out.println(a);}
		    
		  System.out.println("----------");
		   
 String Z[][]= {{"manual","automation","java","database","API"},
		     {"sanity","smoke","black box testing"}};
		  
		for (String x[]:Z) 
		{
		for (String y:x)
		 {
			System.out.print(y+"-----");
		}
		System.out.println("  ");
			}
	}
}
