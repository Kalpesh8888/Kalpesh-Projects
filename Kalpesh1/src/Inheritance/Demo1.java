package Inheritance;
 
  
class kalpesh 
 {  static int a=10, b=20;

     public static void display()
     {System.out.println("hi all");
     System.out.println(a);
 	System.out.println(b);
     }
 
 }
public class Demo1 extends kalpesh{
	

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
     Demo1 d = new Demo1();
     
	System.out.println(d.a);
	System.out.println(d.b);
	System.out.println(d.a*b);
	d.display();
	
	
	
	}}
	
	
	


