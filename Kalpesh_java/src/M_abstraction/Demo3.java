package M_abstraction;

//abstract class constructor calling

abstract class XYZ
{
	void display()
	{System.out.println("this is normal method");}

  XYZ()
  {System.out.println("this is constructor");}

  abstract void testing();

}

public class Demo3 extends XYZ {
	 
	Demo3()
	{System.out.println("constructor");}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo3 d = new Demo3();
		d.testing();
		d.display();
	}

	void testing()
	{ System.out.println("this is implemented method");}

}
