package Java_;

import java.util.HashMap;

public class occurStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="my name is rajkumar ";
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				
			
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			
			else {
				hmap.put(ch, 1);
			}
		}
		}
		System.out.println(hmap);
		

	}

}
