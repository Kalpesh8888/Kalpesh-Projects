package Z_Programming;

 public class reversenumber {
	
	// Reverse Number programming

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A=122, rev=0, rem,temp=A;
	 	
		while (temp!=0)
		
		{
		   rem= temp%10;
		   rev= rev*10+rem;
		   temp=temp/10;
		}
		
		System.out.println(rev);
	
	}

}
