package JavaProgram;

public class EevnAndodd {

	public static void main(String[] args) {
		
		
		int a[]= {10,4,5,7,48,47,50};
		int even=0;
		int odd=0;
		
		for (int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
System.out.println("even count in arry ="+even);
System.out.println("odd cout in array ="+odd);

		
		
		

	}

}
