package JavaProgram;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13245124;
		
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int rem;

		while (num != 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}
		//System.out.println(sum);

		if (sum < 10) {

			System.out.println(sum);

		}
		else {
	    while (sum != 0) {
				rem = sum % 10;
				sum1 = sum1 + rem;
				sum = sum / 10;

			}
		if (sum1 < 10) {
				System.out.println(sum1);
			}
		else {
		while (sum1 != 0) {
					rem = sum1 % 10;
					sum2 = sum2 + rem;
					sum1 = sum1 / 10;

				}
				System.out.println(sum2);

			}

		}

	}
}
