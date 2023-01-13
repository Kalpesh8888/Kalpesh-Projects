package JavaProgram;

public class largestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 40, 4, 90, 60, 70 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < max) {
				max = a[i];
				
			}
			
		}
		System.out.println(max);
		ram();

	}

	public static void ram() {
		int b[] = { 10, 5, 4, 3, 1, 70, 8 };

		int min = b[0];
		for (int j = 0; j < b.length; j++) {
			if (b[j] < min) {
				min = b[j];
			}
		}
		System.out.println(min);
	}

}
