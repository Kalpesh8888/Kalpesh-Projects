package Z_Programming;

public class palindromenumer {
     
	      //Palindrom Number Programming 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int A=121, rev=0,rem,temp =A;   //Revere number also number same is called pelimdrom number
	
	while (temp !=0)
	{
	   rem= temp%10;
	   rev= rev*10+rem;
	   temp=temp/10;
	
	}
	
	if(A==rev)
	{ System.out.println("This is pelindrom Number");}
	else
	{ System.out.println("This is not pelindrom number");}
	
	
	}

}
