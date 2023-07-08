package M_abstraction;
 /*2) interface - An interface in Java is a blueprint of a class. It has static constants and abstract methods.
  * The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
     In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
  * Since Java 8, we can have default and static methods in an interface.
    Since Java 9, we can have private methods in an interface.
    -interface method are static,abstarct & final
*/
  interface Abc
  {
	  void show();
	  void display();
	  void create();
	  
  }
public class Demo2 implements Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d = new Demo2();
		d.show();
		d.display();
		d.create();
	}

	@Override
	public void show()
	{
		System.out.println("manual testing");
		
	}

	@Override
	public void display() 
	{ System.out.println("Automation testing");
		
	}

   @Override
   public void create() {
	// TODO Auto-generated method stub
	System.out.println("Api tetsing");
}

}
