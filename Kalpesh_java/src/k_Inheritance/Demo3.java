package k_Inheritance;
/* Hierarchical Inheritance-
 * When more than one classes inherit a same class then this is called hierarchical inheritance.
 *  For example class B, C and D extends a same class A. 
     or
 Hierarchical Inheritance is one of the types of inheritance where multiple child classes inherit the methods and properties of the same parent class.
*/
class A  //parent class
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class B extends A  //child class 1
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
} 
class C extends A   // child class2
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class D extends A  // child class 3
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B obj1 = new B();
	     C obj2 = new C();
	     D obj3 = new D();
	     
	     //All classes can access the method of class A
	     obj1.methodA();
	     obj2.methodA();
	     obj3.methodA();
	}

}
