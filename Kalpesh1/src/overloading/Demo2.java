package overloading;

public class Demo2 {
	//constructor overloading
	
  Demo2(int i)
  {System.out.println(i);
  for (i=0;i<=20;i++)
	  System.out.println(i);}
  
  Demo2 (int a,int b)
  {System.out.println(a+b);}
  
  Demo2(String name)
  {System.out.println(name);
	  System.out.println(" Rupali dagde");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Demo2 d1= new Demo2(20);
  Demo2 d2= new Demo2(30,40);
  Demo2 d3= new Demo2 ("Kalpesh patil")
;	}
}
