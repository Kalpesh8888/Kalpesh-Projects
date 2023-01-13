package Java_;

public class Fabonasssi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,sum=0;
		
		for(int i=0;i<10;i++) {
			sum=a+b;
			a=b;
			
			b=sum;
			
			
			System.out.println(sum);
			
		}

	}

}
