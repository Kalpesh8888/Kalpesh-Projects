package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_AfterClass {

	
	
	@AfterClass
	public void patil()
	{System.out.println("Good Night");}
	
	
	
	@Test
	public void Gopiraj()
	{System.out.println("Good Evening");}
	
	@Test
	public void Don()
	{System.out.println("Good Day");}

	@BeforeTest
	public void vicky()
	{System.out.println("Good Moring");}
}
