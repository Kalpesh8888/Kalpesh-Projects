package JavaProgram;

public class PrimeNumarray {

	public static void main(String[] args) {
		int i,j;
		int a[]= {12,5,7,8,49,48,12,};
		
		int count=0;
		for (i=0;i<a.length;i++) {
			
			  // count=0;
			
			for (j=1;j<=a[i];j++) {
				if (a[i]%j==0) {
				count++;
					}
				
			}
		
			
			if (count==2) {
				System.out.print(+a[i]+" ");
			
				}
			count=0;
			}
		
		
	}
}

			
			
	


	
	

		
		

	

