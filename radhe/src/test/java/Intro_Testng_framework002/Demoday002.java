package Intro_Testng_framework002;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoday002 {

	
	@AfterTest
	public void method01()
	{System.out.println("method01");}
	@BeforeTest
	public void method02()
	{System.out.println("method02");}
	@Test
	public void method03()
	{System.out.println("method03");}
	
	
	
	
	
	
	
	
}
