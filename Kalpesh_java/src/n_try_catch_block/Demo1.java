package n_try_catch_block;

// try catch bolck  //exception (class of Exception)
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is Started ");
		
		try 
		{ int a =10/0;
		System.out.println(a);
		}
		catch(Exception e)
		{System.out.println("Exception got handle ");}
		
		System.out.println("End of the program");	
		
	}
		
		
	}


