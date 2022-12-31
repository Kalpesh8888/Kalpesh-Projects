package overloading;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method overloading
  Methodoverloading d=new Methodoverloading();
	 d.display();
  d.display(20);
	 d.display(30,40);
	 d.display("rupali");
    
	}
	public void display ()
	{System.out.println("vicky");
		
	}
	public void display(int x)
	{System.out.println(x);
	System.out.println("kalpesh");
	}
	public void display(String name)
	{System.out.println(name);
	System.out.println("kalpesh patil is automation testing done perfectly");
	
	}
	public void display (int X,int y)
	{System.out.println(X+y);}
	
	
	
	
	

}
