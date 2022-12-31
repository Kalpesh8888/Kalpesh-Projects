package abtractclass;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("program is started");
		int a[]= new int [3];
		
		try
		{
			a[0]=10;
			a[1]=20;
			a[2]=30;
			a[3]=40;
		}
		catch(Throwable e)
		{System.out.println("Arrayoutof bounds exception got handle");
	}
		System.out.println("End of program");

}}
