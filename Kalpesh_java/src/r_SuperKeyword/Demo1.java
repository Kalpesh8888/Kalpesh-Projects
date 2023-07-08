package r_SuperKeyword;
/*Super Keyword in Java ;-
 * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 * 
 * Usage of Java super Keyword
1)super can be used to refer immediate parent class instance variable.
2)super can be used to invoke immediate parent class method.
3)super() can be used to invoke immediate parent class constructor.
 * 
 * 
 * 
 */
class Vehicle {
    int maxSpeed = 120;

void message()
{
    System.out.println("This is person class\n");
}
}
//sub class Car extending vehicle
class Car extends Vehicle {
 int maxSpeed = 180;
 
 void message()
 {
     System.out.println("This is student class");
 }
 void display()
 {
     // print maxSpeed of base class (vehicle)
     System.out.println("Maximum Speed: " + super.maxSpeed);
     
     // will invoke or call current
     // class message() method
     message();

     // will invoke or call parent
     // class message() method
     super.message();
     
 }
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car small = new Car();
        small.display();
	}

}
