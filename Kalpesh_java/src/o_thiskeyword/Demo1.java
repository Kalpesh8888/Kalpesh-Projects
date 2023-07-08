package o_thiskeyword;
/* this keywords- Here is given the 6 usage of java this keyword.

1)this can be used to refer current class instance variable.
2)this can be used to invoke current class method (implicitly)
3)this() can be used to invoke current class constructor.
4)this can be passed as an argument in the method call.
5)this can be passed as argument in the constructor call.
6)this can be used to return the current class instance from the method. */


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
