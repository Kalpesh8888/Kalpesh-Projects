package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar {

	public static void main(String[] args) {
		
	String name="hii guys how are yhou";
	Map<Character ,Integer> hmap= new HashMap<Character,Integer>();
	
	char StrArray[]=name.toCharArray();
	boolean flag = false;
	for(char c:StrArray) {
		if(c!=' ')
		if(hmap.containsKey(c)) {
			hmap.put(c, hmap.get(c)+1);
			flag=true;
			
			
		}
		else {
			hmap.put(c, 1);
			
			flag=false;
		}
		
		
		
	}
		System.out.println(name+" :"+hmap);
		
	
		
		

}
}
