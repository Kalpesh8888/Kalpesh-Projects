package Java_;

public class whilelopprev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="my name is rajkumar ";
		
		
		int i=0;
		int len = name.length();
		String word="";
		String rev="";
		
		while(i<len) {
			
			char c = name.charAt(i);
			if(c!=' ') {
				word=word+c;
			}
			
			else {
				rev=word+" "+rev;
				word="";
			}
			i++;
			//System.out.println(rev);
		}
		System.out.println(rev);
	
		
}

	}

