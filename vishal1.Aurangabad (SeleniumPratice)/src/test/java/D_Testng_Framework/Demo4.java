package D_Testng_Framework;

import org.testng.annotations.Test;

public class Demo4 {

	  @Test
	  public void method1() { System.out.println("Method1"); }
	  
	  @Test(groups={"sanity"})
	  
	  public void method2()
	  {
	    System.out.println("Method2");
	  }
	  
	  @Test (groups={"sanity"})
	  public void method3() {
	    System.out.println("Method3");
	  }
	  
	  @Test (priority=-2)
	  public void method4() {
	    System.out.println("Method4");
	  }
	
}
