package a_Test_Day2_Operators;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	/*	 logical operator  (&&)
	  A          B        Result
	  True      True  =    True
	  True      False  =   False
	  False     True  =    False
      False     False  =    False
	 
	 logical operator  (|| ) oR OPERATOR
		  A          B        Result
		  True      True  =    True
		  True      False  =   True
		  False     True  =    True
	      False     False  =    False
		 
		 LOGICAL NOT(!) operator 
		  A        Result  
		 True       False     //viseversa
		 
		 Note :- Relational & logical operator gives boolean value i.e true or false.
		 */
		
		// logical operator
	 int a=15;int b=10;int c=20;int d=25; boolean e=false;
	 
	  System.out.println(a>b && b<c);
	  System.out.println(a<b && b<c);
	  System.out.println(c>a || a<d);
	  System.out.println(c<a ||a<d);
	  System.out.println(!e);
	
	
	
	
	
	
	
	
	
	
	}

}
