package Test_Day3;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] X= new String[4];
		  X[0]="Aurangabad";
		  X[1]="Nashik";
		  X[2]= "pune";
		  X[3]="Beed";
		  
		    for (String a:X)
		    System.out.println(a);
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
