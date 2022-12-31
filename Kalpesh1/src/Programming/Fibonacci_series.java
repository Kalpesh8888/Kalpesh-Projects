package Programming;

public class Fibonacci_series {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A=0, B=1 , sum;
		
	System.out.print(A + "  "+ B);
	
	 for (int i=2 ;i<=10; i++)
	
	 {    sum=A+B;
	   
	     System.out.print(" "+sum);		
	    A=B;
	    B=sum;
	  
	 }
	
	
	}

}
