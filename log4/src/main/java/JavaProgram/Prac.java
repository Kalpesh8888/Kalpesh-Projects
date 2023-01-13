package JavaProgram;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num;
		int temp1=num;

		int armnum=0;
		int rem;
		int len=0;

		while(temp!=0)
		{ temp=temp/10;
		len++;

		}
		while(temp1!=0)
		{
		rem=temp1%10;
		int mul=1;

		for  (int i=1;i<=len;i++)
		{
		mul=mul*rem;
		}

		armnum=armnum+mul;
		temp1=temp1/10;
		}

		if(num==armnum)
		{
		System.out.println("number is armstrong");
		}
		else{

		System.out.println("number is not armstrong");
		}
		}
	
	



		




		}

	


