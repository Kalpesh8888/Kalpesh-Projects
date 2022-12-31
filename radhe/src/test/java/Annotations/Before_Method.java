package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_Method {
	
	@Test
	public void method01()
	{System.out.println("method01");}

	@Test
	public void method02()
	{System.out.println("method02");}
	
	@Test
	public void method03()
	{System.out.println("method03");}
	
	@Test
	public void method04()
	{System.out.println("method04");}
	
	@BeforeMethod
	public void method05()
	{System.out.println("Method Start");}

	@AfterMethod
	public void method06()
	{System.out.println("Method End");}
	
}
