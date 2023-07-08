package q_ArrayList;

import java.util.HashSet;

/*Hashset method -HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.

Difference between List and Set
A list can contain duplicate elements whereas Set contains unique elements only.
*/
public class Demo2 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		
		
		hs.add("Ram");
		hs.add("sham");
		hs.add('A');
		hs.add(56);
		hs.add(45.26);
		hs.add(true);
		hs.add("Ram");
		
	//	System.out.println(hs.size());
		
	//	for (Object s:hs)
		
	//	{System.out.println(s);}
		
	// hs.clear();
	//   System.out.println(hs.isEmpty());
		
	for (Object s:hs)
		
	 	{System.out.println(s);}
		
		
	
	}

}
