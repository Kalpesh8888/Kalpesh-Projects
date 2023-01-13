package JavaProgram;

public class arm {

	public static void main(String[] args) {
		int num=151;
		int temp=num;
		int temp1=num;
		int arms=0;
		int leng=0;
		int rem;
		
		while(temp!=0) {
			temp=temp/10;
			leng++;
			
		}
		while(temp1!=0) {
			int mul=1;
			
			rem=temp1%10;
			for(int i=1;i<=leng;i++) {
				
				mul=mul*rem;
				
				
				
				
			}
			arms=arms+mul;
			temp1=temp1/10;
			
		
			}
		if(arms==num) {
			System.out.println("armstrong num");
		}
		else {
			System.out.println("number is not ");
		}
		

	}

}
