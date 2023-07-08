package c_method;

public class Demo3 {
//3) Non-main method calling other methods.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    tech();
	}
	
	public static void tech()
	{System.out.println("techer is teching");
	  learn();
	  }
	
	public static void learn()
		{System.out.println("student are learning");
		empolyement();
		}
   public static void empolyement()
		{
	   String student="fun";
		if (student =="job")
			
		{System.out.println("you will get Job");}
		else 
		{System.out.println("need in trospection");
		}
	}

}
