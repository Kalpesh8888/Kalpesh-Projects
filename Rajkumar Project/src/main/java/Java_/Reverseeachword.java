package Java_;

public class Reverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "my name is rajkumar ";
		String revstr="";
		String word="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}
			else {
				revstr=word+" "+revstr;
				word="";
			}
		}
		System.out.println(revstr);

	}

}
