package d_Object;

/* 	1)	Object is an instance of a class.
   2)  Object is a real world entity such as pen, laptop, mobile, bed, keyboard, mouse, chair etc.
   3)  Object is a physical entity or real world entity.	
   4)Object is created through new keyword mainly e.g. Student s1=new Student();
   5) Object is created many times as per requirement.
   6)Object allocates memory when it is created.
   7)There are many ways to create object in java such as new keyword, newInstance() method, clone() method, factory method and deserialization.	

*/
public class demo1 {

	int a= 15;   //instance/golbal variable
	static String name= "kalpesh";   //Static variable
	
	public static void main(String[] args) {
		
		demo1 d= new demo1(); //object Creation
	System.out.println("value of a is :"+ d.a);
	System.out.println("name of tester "+ d.name);
	
	show();
	display();
	add(45,10);
	}
	public static void show()
	 
	{System.out.println("selenium");
	}
   
	public static void display()
	
	{System.out.println("welcome in java");}
	
     public static void add(int x,int y)
	
	{System.out.println(x+y);}
}
