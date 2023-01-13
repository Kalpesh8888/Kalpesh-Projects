package JavaProgram;

import java.util.Arrays;
import java.util.Collections;

public class ArrayAsending {

	public static void main(String[] args) {
		Integer a[]= {10,4,45,2,1,47,48};
		int temp=0;
		int i=0;
		int j=0;
		
		Arrays.sort(a,Collections.reverseOrder(
				));
		for(i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}
		
	}
	
	

}
