package k_Inheritance;
/*2) Multilevel inheritance-
When a class extends a class, which extends anther class then this is called multilevel inheritance. 
For example class C extends class B and class B extends class A then this
 type of inheritance is known as multilevel inheritance

*/

class Car{
	   public Car()  //constructor
	   {
		System.out.println("Class Car");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}
	class Maruti extends Car{
	   public Maruti()  //constructor
	   {
		System.out.println("Class Maruti");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}

public class Demo2 extends  Maruti{
	
	public Demo2()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		   Demo2 obj=new Demo2();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
	}