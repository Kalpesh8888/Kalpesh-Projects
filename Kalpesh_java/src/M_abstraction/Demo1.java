package M_abstraction;
/* Abstraction - 
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * 
 * Ways to achieve Abstraction
     There are two ways to achieve abstraction in java

1) Abstract class (0 to 100%)
2) Interface (100%)
 
 *Abstract class-
 *A class which is declared with the abstract keyword is known as an abstract class in Java. 
 * It can have abstract and non-abstract methods (method with the body).


*/
// abstract class
abstract class testing
{
	static void display()
	 
	 {System.out.println("this  is non static method");}
	 
	 abstract void show();
	
	 
}

public class Demo1 extends testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Demo1 X = new Demo1();
        
        X.display();
        X.show();

	}

	

		
	


	void show()
	{System.out.println("this is implemented Method");}
	
		
	}


