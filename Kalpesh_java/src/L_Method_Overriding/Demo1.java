package L_Method_Overriding;
/*Method Overriding-
 * If subclass (child class) has the same method as declared in the parent class,
 * it is known as method overriding in Java.

Rules for Java Method Overriding
1) The method must have the same name as in the parent class
2) The method must have the same parameter as in the parent class.
3) There must be parent child relationship which means inheritance must be there.
4)If return type of parent class method is a primitive type, then child class method must also have the same return type. 
For example if return type of parent class method is int, then child class method's return type must also be int. Using any other return type would result in compilation error.
*/
class parent {  //parent class
	
	//defining a method  
	  void diaplay()
	  {System.out.println("Automation testing ");}  }  

public class Demo1 extends  parent { //child class
	  //defining the same method as in the parent class  
	  void diaplay()
	  {System.out.println("manual testing");}  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj = new Demo1();    //creating object  
		  obj.diaplay();              //calling method  
	}

}
