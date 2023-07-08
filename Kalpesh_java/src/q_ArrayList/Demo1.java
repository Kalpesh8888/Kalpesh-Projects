package q_ArrayList;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

/*What is Collection framework
The Collection framework represents a unified architecture for storing and manipulating a group of objects. 
It has:1)Interfaces and its implementations, i.e., classes 
2)Algorithm 
collection framework:- 1) collection(I) --- 1) List(I)--ArrayList(C)
                                            2) Set(I)---HashSet(C)
                       2) map(I)--- -----1) HashMap(C)  
*                      3)iterator(I)
*
*
*/
                
/*  1) Array List- Java ArrayList class uses a dynamic array for storing the elements. 
//                   It is like an array, but there is no size limit. We can add or remove elements anytime.
//                    1)  Java ArrayList class can contain duplicate elements.
                      2)Java ArrayList class maintains insertion order.(iteration order is perserved)
                      3) Java ArrayList class is non synchronized.  */
public class Demo1 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ArrayList aL=new ArrayList();
	
	aL.add(500);
	aL.add('C');
	aL.add("java");
	aL.add(500);
	aL.add(10.25);
	aL.add(true);
	
	 System.out.println(aL.get(0));
	 System.out.println(aL.get(1));
	
	 aL.remove(2);
	
	System.out.println(aL.get(2));
	
	aL.removeAll(aL);
	System.out.println(aL.getClass());
	
System.out.println(aL.get(0));
	
	
/*	for(int i=0; i<aL.size();i++)
	
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
	
	System.out.println(aL.isEmpty());*/

	}
	
	
}
