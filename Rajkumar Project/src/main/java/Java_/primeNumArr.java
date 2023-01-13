package Java_;

public class primeNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,4,12,7,19,12};
		int count=0;
		int i;
		
		for( i=0;i<a.length;i++) {
			for(int j=1;j<=a[i];j++) {
				
			
			if(a[i]%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(a[i]);
		}
		count=0;

	}

}
}