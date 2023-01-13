package JavaProgram;

public class palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 121;
		int temp = num;
		int rev = 0;
		int rem;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println(rev);

		if (temp ==   rev) {
			System.out.println("number is palidrome");
		} else {
			System.out.println("num  is not palidrome");
		}
	}

}
