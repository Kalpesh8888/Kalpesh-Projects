package thisclass;
// this keywords
public class Demo1 
{
	int a=15;
	int b=52;
	
	void display()
	{ int a=25;
	  int b=20;
	  
	  System.out.println(this.a+this.b);
	  
	  System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Demo1 d = new Demo1();
     d.display();
		
		
	}

}
