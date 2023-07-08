package j_overloading;
/*Overloading
 * If a class has multiple methods / constructor having same name but different in parameters,
 * it is known as Method / constructor Overloading.
 *
There are two ways to overload the methods / constructor in java

1) By changing number of arguments
2) By changing the data type
 * 
 * overloading-1) method overloading
 *             2)constructor overloading
 *             3) main method overloading
*/
public class a_Methodoverloading {

	public static void main(String[] args) {
	
		// Method overloading
		
  a_Methodoverloading d=new a_Methodoverloading();
	 d.display();
     d.display(20);
	 d.display(30,40);
	 d.display("rupali");
    
	}
	public void display ()
	{System.out.println("vicky");
		
	}
	public void display(int x)
	{
		System.out.println(x);
	    System.out.println("kalpesh");
	}
	public void display(String name)
	{
		System.out.println(name);
	    System.out.println("kalpesh patil is automation testing done perfectly");
	
	}
	public void display (int X,int y)
	{System.out.println(X+y);}
	
	
	
	
	

}
