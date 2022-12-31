package Test_Day3;

public class Demo1 {

	Demo1()
	{System.out.println(" i am Constructor");}
		
	Demo1(int a,int b)
	{System.out.println("the value of a is:"+a);
	
	System.out.println("Tha addition a & b is:"+(a+b));
	System.out.println("Tha addition a & b is:"+a+b);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Demo1 d = new Demo1();
  Demo1 d1 = new Demo1(74,85);
	}

}
