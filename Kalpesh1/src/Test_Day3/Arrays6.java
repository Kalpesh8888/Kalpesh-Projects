package Test_Day3;

import org.testng.annotations.Test;

public class Arrays6 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
 @Test
	public void main() {
	Object [] a = {8,8.25,"java",'A',true };
	 
	System.out.println("The Size of array is:"+a.length);
	System.out.println("vlue of index at o is;"+a[0]);
	
	System.out.println("=======================");
	
	for(int b=0;b<a.length;b++)
	{System.out.println(a[b]);}
	System.out.println("=======================");
	
	for (Object C:a)
	
	{System.out.println(C);}
	
	}

}
