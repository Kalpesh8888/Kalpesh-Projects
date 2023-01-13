package JavaProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="rajkumar";
		String temp=name;
;		String rev="";
		
		StringBuffer sb = new StringBuffer(name);
		rev=rev+sb.reverse();
		System.out.println(rev);
		
	

	}

}
