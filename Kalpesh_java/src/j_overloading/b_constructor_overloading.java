package j_overloading;

public class b_constructor_overloading {
	
	//constructor overloading
	
  b_constructor_overloading(int i)
  {System.out.println(i);
  for (i=0;i<=20;i++)
	  System.out.println(i);}
  
  b_constructor_overloading (int a,int b)
  {System.out.println(a+b);}
  
  b_constructor_overloading(String name)
  {System.out.println(name);
	  System.out.println(" Rupali dagde");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  b_constructor_overloading d1= new b_constructor_overloading(20);
  b_constructor_overloading d2= new b_constructor_overloading(30,40);
  b_constructor_overloading d3= new b_constructor_overloading ("Kalpesh patil");	
 
	}
}
