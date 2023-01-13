package JavaProgram;

public class PrimenumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		for ( i=1;i<=100;i++) {
			for( j=2;j<i;j++) {
				if (i%j==0) {
					break;
					
				}
				
			}
			
			if (i==j) {
				System.out.print(i+" ");
			}
		}


	}

}
