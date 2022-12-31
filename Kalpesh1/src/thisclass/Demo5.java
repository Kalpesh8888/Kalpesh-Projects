package thisclass;

import java.util.HashMap;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm =new HashMap();
		
	hm.put(101, "jim");
	hm.put(102, "Edwin");
	hm.put(103, "yucai");
	hm.put(104,"Abhishek");
	
	// System.out.println(hm.get(101));
	//  System.out.println(hm.get(102));
		
	for (Object A:hm.keySet())	
	{System.out.println(A);}
	
  for (Object B:hm.values())
  {System.out.println(B);}

  
  for (Object C:hm.entrySet())
	  
  {System.out.println(C);}
  
  
 System.out.println(hm.containsKey(105));
 
 System.out.println(hm.containsKey(104));
 
 System.out.println(hm.containsValue("jim"));
 
 hm.remove(104);

 for (Object C:hm.entrySet())
	  
  {System.out.println(C);}
	}

}
