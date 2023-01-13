package JavaProgram;

public class SingleCharO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="my name is rajkumar";
		int total_count  = name.length();
		int after_remove = name.replace("a", "").length();
		int count=total_count-after_remove;
		System.out.println("Total count of a = "+count);

	}

}
