package Java_;

import java.util.Arrays;

public class occuranceForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,1,3,2,4,5,1};
		Arrays.sort(a);
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					count++;
				}
				else {
					break;
				}
			}
			System.out.println(a[i]+" ="+count);
			i+=count-1;
			
		}
	}

}
