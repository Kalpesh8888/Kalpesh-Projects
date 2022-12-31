package thisclass;

import java.util.ArrayList;

//Array List
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList aL = new ArrayList();
	
	aL.add(500);
	aL.add('C');
	aL.add("java");
	aL.add(500);
	aL.add(10.25);
	aL.add(true);
	
	// System.out.println(aL.get(0));
	// System.out.println(aL.get(1));
	
	// aL.remove(2);
	
	// System.out.println(aL.get(2));
	
	//aL.removeAll(aL);
	//System.out.println(aL.getClass());
	
	//System.out.println(aL.get(0));
	
	
	for(int i=0; i<aL.size();i++)
	
	{System.out.println(aL.get(i));
	}
	System.out.println("the size of Arraylist :"+aL.size());
	
	aL.add("ruby");
	aL.add(1,"pearl");
	
	aL.remove(10.25);
	
	for(Object X:aL)
	{System.out.println(X);}
	
	
	System.out.println(aL.contains("java"));
	
	aL.clear();
	
	System.out.println(aL.isEmpty());

	}
	
	
}
