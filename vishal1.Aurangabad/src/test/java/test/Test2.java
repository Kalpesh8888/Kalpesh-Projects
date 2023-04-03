package test;

public class Test2 {

	@Test
	public int solution(int N) {
        // Implement your solution here
  if (N >= 1 && N <= 2147483647) {
	            return true;
	        } 
	        else { return false;
	    }

public  int main(String[] args)  {
	        int N = 100;
	        if (solution (N))
	        
	        {
	            System.out.println(N + " is within the range [1, 2,147,483,647]");} 
            else { System.out.println(N + " is NOT within the range [1, 2,147,483,647]"); }
	    }
}
	 
		 
}