package c_vishal1.vishal1.Selenium;

import java.util.Scanner;

public class scannerclass {
   //scanner Java class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner obj= new Scanner(System.in);
	
	System.out.println(" Enter your name ");
	
	String name=obj.next();
	
	System.out.println(" Enter your Age ");
	
	String age=obj.next();
	
	
	System.out.println(" Enter your Mobile NUmber ");
	
	String   Mobile=obj.next();
	
	
	
	System.out.println("Your name is " +name);
	System.out.println("Your age" +age);
	System.out.println("Your Mobile Number is" +Mobile);
	
	
	}

}
