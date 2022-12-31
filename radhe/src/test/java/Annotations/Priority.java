package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
	@Test
	public void method01()
	{System.out.println("method01");}

	@Test (priority =1)
	public void method02()
	{System.out.println("method02");}
	
	@Test (priority =2)
	public void method03()
	{System.out.println("method03");}
	
	@Test (priority = 3)
	public void method04()
	{System.out.println("method04");}
	
	@Test (priority =-10)
	public void method05()
	{System.out.println("Method Start");}

	@Test (priority =0)
	public void method06()
	{System.out.println("Method ");}
	
}
