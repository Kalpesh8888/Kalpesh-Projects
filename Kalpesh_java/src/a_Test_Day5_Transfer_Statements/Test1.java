package a_Test_Day5_Transfer_Statements;

public class Test1 {

	public static void main(String[] args) {
	/*	Transfer Statements orFlow Control or Jump Statements
		1)  break  
		2) continue
		3) return
		4) tRY,CATCH,FINALLY    */

		// Transfer Statements- 1) Break
		
		  for (int a=1; a<=10; a++)
		    {  if (a==8)
		    {break;}
		    	System.out.println(a);}

	System.out.println("_______________________");
	
	 for (int a=10; a<=100; a+=10)
	    {  if (a==50)
	    {break;}
	    	System.out.println(a);}
	
	
	 System.out.println("_______________________");
	 
	  int k=50;
		 while (k<=500)
		 { if (k==410) 
		 { break;} 
		 System.out.println(k);
		 k+=20;}
		
	
	
	
	
	}

}
