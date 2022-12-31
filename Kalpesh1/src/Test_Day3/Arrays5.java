package Test_Day3;

public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] a= new String[3];
		  
		  a[0]="kalpesh";
		  a[1]="vicky";
		  a[2]= "kunal";
		  
		    for (String x:a)
		    { System.out.println(x);}
		  
		    System.out.println("----------");*/
		   
		    String b[][]= {{"prassna","vishal","ashish","laxmikant","tushar"},
		    		
		    		{"rupali","vidya","vishkaha","vidya1","Vidya2"}};
		  
			for(int C=0; C<b.length;C++)
			{
		     for (int d=0; d<b[0].length;d++)
		    
			{System.out.println(b[C][d]);}
			 System.out.println(" ____ ");
			}
		    
		    
		    
		 /* for (String x[]:b) 
			{
				for (String y:x)
			
			 {
			System.out.print(y+"---");
		  }
			System.out.println(" ______  "); 
			}*/
	}

}
