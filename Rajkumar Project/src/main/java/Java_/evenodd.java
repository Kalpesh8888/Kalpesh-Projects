package Java_;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,4,5,7,12,8,1,2,3};
		int count=0;
		int count1=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count ++;
			}
			else {
			count1++;
			}
		}
		System.out.println("even number in array  "+count);
		System.out.println("odd number in array  "+count1);

	}

}
