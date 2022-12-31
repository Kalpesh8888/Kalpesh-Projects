package Intro_Testng_framework003;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo02 {

	@Test
	public void method01()
	{System.out.println("method01");}

	@Test
	public void method02()
	{System.out.println("method02");}
	
	@Test
	public void method03()
	{System.out.println("method03");}
}
