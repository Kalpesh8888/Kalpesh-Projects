
public class JavaP {

	public static void main(String[] args) {
		
		int a[]= {1,1,0,1,0,1,1,1,0,1};
		int count=0;
		int count1=0;
		int i;
		int j;
		for( i=0;i<a.length;i++) {
			count=0;
			for( j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				
				count++;
				
			}
			
			
			else if(a[i]!=a[j]) {
				break;
			}
			}
			
			//System.out.println(count);
			for( i=j;i<a.length;i++) {
				count1=0;
				for( j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					count1++;
					
				}
				
				
				else if(a[i]!=a[j]) {
					break;
				}
				
			//System.out.println(count1);
		}
				//System.out.println(count1);

		

	}
	

}System.out.println(count);
		System.out.println(count1);			
}
	}
