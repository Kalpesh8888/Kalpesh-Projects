package Annotations;

import org.testng.annotations.Test;

public class DepensOnMethod {

@Test (dependsOnMethods = {"day1","day2"})
 public void Prassna()
 {System.out.println("Bye");}

 @Test(priority =0)		
public void day1()
{System.out.println("Day1");}
	
 @Test(priority =1)	
public void day2()
{System.out.println("Day2");}
	
@Test	(enabled = false)				
public void day3()
{System.out.println("Day3");}
		
@Test
public void day4()
{System.out.println("Day4");}
}
