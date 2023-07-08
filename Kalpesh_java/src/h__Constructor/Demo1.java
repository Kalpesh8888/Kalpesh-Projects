package h__Constructor;
/* constructor :- 
Constructor is a block of codes similar to the method. 
It is called when an instance of the class is created. 
At the time of calling the constructor, memory for the object is allocated in the memory.
 It is a special type of method that is used to initialize the object.
 Every time an object is created using the new() keyword, at least one constructor is called.

constructor are  automatically called when an object is created for the class.

Rules for creating Java constructor
 1) Constructor name must be the same as its class name
 2) A Constructor must have no explicit return type (no return type)
 3) A Java constructor cannot be abstract, static, final, and synchronized

There are two types of constructors in Java:
1) Default constructor (no-arg constructor)
2) Parameterized constructor

*/
public class Demo1 {

	Demo1()                       //Default constructor (no-arg constructor)

	{System.out.println(" i am Constructor");}
		
	Demo1(int a,int b)               //Parameterized constructor
	{System.out.println("the value of a is:"+a);
	
	System.out.println("Tha addition a & b is:" +(a+b));
	System.out.println("Tha addition a & b is:" +a+b);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Demo1 d = new Demo1();
        Demo1 d1 = new Demo1(74,85);
	
	
	}

}
