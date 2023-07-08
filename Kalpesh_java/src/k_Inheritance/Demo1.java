package k_Inheritance;
/*Inheritance -Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
 * It is an important part of OOPs (Object Oriented programming system).
Types of inheritance in java;-
1)simple / Single-level inheritance
2) Multi-level Inheritance  
3)Hierarchical Inheritance
4)Multiple Inheritance
4)Hybrid Inheritance - Hybrid & multiple are not possible due to diamond ambiquite problem

  */

//simple / Single-level inheritance -  a sub-class is derived from only one super class.
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
	
	
	


