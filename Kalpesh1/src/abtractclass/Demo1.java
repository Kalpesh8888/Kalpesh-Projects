package abtractclass;

// abstract class
abstract class testing
{
	static void display()
	 
	 {System.out.println("this  is non static method");}
	 
	 abstract void show();
	
	 
}

public class Demo1 extends testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Demo1 X = new Demo1();
        
        X.display();
        X.show();

	}

	

		
	


	void show()
	{System.out.println("this is implemented Method");}
	
		
	}


