package thisclass;
//iterator 

import java.util.ArrayList;
import java.util.Iterator;

  
public class Demo6 {

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
