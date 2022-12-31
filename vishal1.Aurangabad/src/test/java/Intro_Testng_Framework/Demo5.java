package Intro_Testng_Framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 {


	 
	  @DataProvider
	  public Object[][] dataget()
	  {
	    Object[][] data = { { "firstuser", "firstpass" }, { "seconduser", "secondPass" } };
	    return data;
	  }
	  

	  @Test(dataProvider="dataget")
	  public void test1(Object usernames, Object pass)
	  {
	    System.out.println("test1");
	    System.out.println(usernames);
	    System.out.println(pass);
	  }
	  
	  @Test
	  public void test2() {
	    System.out.println("test2");
	  }













}
