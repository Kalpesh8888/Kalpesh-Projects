package Programming;

public class Prime_number {

	//prime Number Programming ( Prime number divised 1 & itself )
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		 int Num=17, count=0;
		
		for (int i=2;i<=Num;i++)
		{
			if(Num%i==0)
		{
			count++;
			}
		}
		
		if(count>0)
		{System.out.println("The Number is not prime Number");
		  }
		else
		{System.out.println("The Number is Prime Number");
	          }

} }
