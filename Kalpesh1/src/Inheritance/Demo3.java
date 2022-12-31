package Inheritance;



class kalpesh
{ static  int a=10, b=20;

   public void display()
   {System.out.println("hi all");
   }
   class Nilesh extends kalpesh
   { int x=15;
      void show()
      {System.out.println("Data base");}
   }

public class Demo3 extends Nilesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo3 d= new Demo3 () ;
		 
			System.out.println(d.a);
			System.out.println(d.b);
			System.out.println(d.a*b);
			d.display();
	}

}}
