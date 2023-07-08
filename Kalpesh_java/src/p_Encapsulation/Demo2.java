package p_Encapsulation;
/*Encapsulation ;-
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 
In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. 
Therefore, it is also known as data hiding. Ex.findBy method

1) Use the access modifier ‘private’ to declare the class member variables.
2) To access these private member variables and change their values, 
we have to provide the public getter and setter methods respectively.

*/
//  Encapulstion by Get & set method
class ABC
{
	private String name;
  
  void SetName(String company)
  { 
      name = company;
  }
void getname()
{
System.out.println(name);
}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC a = new ABC();
	
		a.SetName("radhe");
       a.getname();
	
	}

}
