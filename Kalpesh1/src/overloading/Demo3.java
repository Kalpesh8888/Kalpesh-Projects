package overloading;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method calling
     show(10);
     show(15,25);
     show("java is case sencestive");
	}
	
	public static void show(int x)
	{System.out.println(x);}
	
	 public static void show ( int a,int b)
	 {System.out.println(a*b);}
	 
	  public static void show (String y )
	  {System.out.println(y);}
	
	
	

}
