package c_method;

public class Demo5 {
/*
	method -1) Single parameterzed method 
	        2) Multiple parameterzed method 
	 */
	//1) Single parameterzed method 

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
      show(11);

	}
	public static void show (int x)
	{ System.out.println(x);
	 System.out .println("good evening");
     create('A',15);}
	
	//2) Multiple parameterzed method 

	public static void create(char grade,int Z)
	{System.out.println(grade);
	System.out.println(Z);
	System.out.println("Good afternoon");
       dispaly(25,'A',"vicky",true);
	}
  
	public static void dispaly(int age,char grade,String name,boolean a)
	{System.out.println("age of ram is:"+age);
	System.out.println("a grede of the ram is:"+grade);
	System.out.println("name of ram's friend is :"+name);
	System.out.println("nature of ram is :"+a);
	
	}
}

