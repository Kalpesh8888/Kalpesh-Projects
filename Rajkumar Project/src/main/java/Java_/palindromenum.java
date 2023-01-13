package Java_;

public class palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=141;
int temp=num;
int rev=0;
int rem=0;

while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	
}if(rev==temp) {
	System.out.println("number is palidrome");
}
else {
	System.out.println("number is not palidrome");
}
	}

}
