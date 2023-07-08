package n_try_catch_block;

//finally bolck always execute

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	System.out.println("Program is Started ");
		
		try 
		{ String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{System.out.println("this is null pointer exception ");}
		finally
		{System.out.println("i am always executed");
		
		System.out.println("End of the program");	
		}
	
	}
}
