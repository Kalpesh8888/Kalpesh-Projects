package JavaProgram;

public class ReverseThewordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="my name is rajkumar ";
		String word="";
		String Revsen="";
		String s="";
		
		for(int i=0;i<name.length();i++) {
			
			char ch=name.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;;
			}
			else {
			
				
				Revsen=word+ "  "+Revsen;
				word="";
			}
			
		}
		System.out.println(Revsen);

	}

}
