package q_ArrayList;
//iterator 

import java.util.ArrayList;
import java.util.Iterator;

 /*  Java Iterator interface :- 
     The Iterator interface of the Java collections framework allows us to access elements of a collection.
      
  * 
  *  Methods of Iterator
The Iterator interface provides 4 methods that can be used to perform various operations on elements of collections.

1)hasNext() - returns in true or false  
2) next() - returns the next element of the collection
3) remove() - removes the last element returned by the next()
4) forEachRemaining() - performs the specified action for each remaining element of the collection

  *  
  *  
  *  
  *  
  *  
  */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList aL = new ArrayList();
		
		aL.add(500);
		aL.add('C');
		aL.add("java");
		aL.add(500);
		aL.add(10.25);
		aL.add(true);
		
	Iterator itr=aL.iterator();
			
	while (itr.hasNext())
	{
		System.out.println(itr.next());    }
				
		
	}

}
