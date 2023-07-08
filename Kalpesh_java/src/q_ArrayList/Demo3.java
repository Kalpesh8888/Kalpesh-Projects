package q_ArrayList;

import java.util.HashMap;

/*Java HashMap -
Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
 If you try to insert the duplicate key, it will replace the element of the corresponding key.

1)Java HashMap contains values based on the key.
2) Java HashMap contains only unique keys.
3) Java HashMap may have one null key and multiple null values.
4) Java HashMap is non synchronized.
5) Java HashMap maintains no order.

*/
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 HashMap hm =new HashMap();
		
	hm.put(101, "jim");
	hm.put(102, "Edwin");
	hm.put(103, "yucai");
	hm.put(104,"Abhishek");
	
	// System.out.println(hm.get(101));
	//  System.out.println(hm.get(102));
		
	for (Object A:hm.keySet())	  //only keys return
	{System.out.println(A);}
	
  for (Object B:hm.values())    //only Values return
  {System.out.println(B);}

  
  for (Object C:hm.entrySet())  //Both key & value
	  
  {System.out.println(C);}
  
  
 System.out.println(hm.containsKey(105));
 
 System.out.println(hm.containsKey(104));
 
 System.out.println(hm.containsValue("jim"));
 
 hm.remove(104);

 for (Object C:hm.entrySet())
	  
  {System.out.println(C);}
	}

}
