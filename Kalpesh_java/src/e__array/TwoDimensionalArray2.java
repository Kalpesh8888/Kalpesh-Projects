package e__array;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		
		// Two Dimensional Array (2nd Approach)

		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

		System.out.println(myNumbers.length);  // Outputs 2
		System.out.println(myNumbers[0].length); // Outputs 4 
		System.out.println(myNumbers[1].length); //Outputs 3
		System.out.println(myNumbers[1][2]); // Outputs 7
		
		System.out.println("----------------");
		
		 for (int i = 0; i < myNumbers.length; ++i) 
		 {
		      for(int j = 0; j < myNumbers[i].length; j++)
		      {
		        System.out.print(myNumbers[i][j]+ "  ");  
                                }
		      System.out.println("  ");
}
		 }}