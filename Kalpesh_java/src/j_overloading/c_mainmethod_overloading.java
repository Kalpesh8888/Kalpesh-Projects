package j_overloading;

public class c_mainmethod_overloading {
	 //3) main method overloading:- yes main method overloading static or non static both
	public static void main(String[] args) {
		
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
