package abtractclass;
 //interface 
  interface Abc
  {
	  void show();
	  void display();
	  void create();
	  
  }
public class Demo2 implements Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d = new Demo2();
		d.show();
		d.display();
		d.create();
	}

	@Override
	public void show()
	{
		System.out.println("manual testing");
		
	}

	@Override
	public void display() 
	{ System.out.println("Automation testing");
		
	}

	@Override
	public void create()
	{
	System.out.println("ApI testing");
	}

}
