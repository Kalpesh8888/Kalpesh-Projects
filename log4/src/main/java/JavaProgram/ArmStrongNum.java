
package JavaProgram;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp1=num;
		int temp2=num;
		int armnum=0;
		int rem=0;
		int len=0;
		
		while(temp1!=0) 
		{
			temp1=temp1/10;
			len++;
			
		}
		System.out.println(len);
		
		while(temp2!=0) {
			rem=temp2%10;
			int mul=1;
			for(int i=1;i<=len;i++) {
				mul=mul*rem;
			}
			
			armnum=armnum+mul;
			temp2=temp2/10;
			
		}
		
		if (num==armnum) {
			System.out.println("number is armstrong num");
		}
		else {
			System.out.println("num is not armstrong");
		}

	}

}
