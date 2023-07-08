package e__array;

public class SingleDimensionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) Single Dimensional Array  (2nd Approach)
	
		int [] a = {15,20,25,30,35,40,45};
	  
        System.out.println(a.length);
	
        for (int b=1;b<a.length;b++)
   
	    System.out.print(a[b]+"___");
	
        System.out.println("-----------");
   
     for (int C=0;C<a.length;C+=2) {
	
	   System.out.print(a[C]+"___");}
	
	
     System.out.println("-----------");   //for each loop with Single Dimensional Array 
     
        for (int x:a)
	    { System.out.println(x + " ");}
	
	
	}

}
