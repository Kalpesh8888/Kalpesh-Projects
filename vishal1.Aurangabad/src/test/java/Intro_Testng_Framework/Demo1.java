package Intro_Testng_Framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	  @Parameters({"url"})
	  @Test 
	  public void Gopiraj(String Urlname)
	  {
	    System.out.println("Good Morning");
	   System.out.println(Urlname);
	  }
	  
	  @Test
	  public void patil()
	  {
	    System.out.println("Hi");
	  }
	  
	  @Test
	  public void method2()
	  {
	    System.out.println("method2");

	  }
	

}
