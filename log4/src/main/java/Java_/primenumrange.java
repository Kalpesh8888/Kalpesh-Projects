package Java_;

public class primenumrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		for( i=0;i<100;i++) {
			for( j=2;j<i;j++) {
				
				if(i%j==0) {
					break;
				}
			
			}
			if(i==j) {
				System.out.println(i);
			}
		}

	}

}
