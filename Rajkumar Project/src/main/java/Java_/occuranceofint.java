package Java_;

import java.util.HashMap;

public class occuranceofint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,5,7,1,3,2,4,1,2};
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(Integer b: a) {
			if(hmap.containsKey(b)) {
				hmap.put(b, hmap.get(b)+1);
			}
			else {
				hmap.put(b, 1);
			}
		}
		System.out.println(hmap);

	}

}
