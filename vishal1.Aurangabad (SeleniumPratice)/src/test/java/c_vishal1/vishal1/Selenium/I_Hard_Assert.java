package c_vishal1.vishal1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
/*Assertions:- Assertion determines the state of the application whether it is the same what we are expecting or not.
 *  If the assertion fails, then the test case is failed and stops the execution.
 *
 *There are two types of Assertion: 
 * 1) Hard Assertion
   2) Soft Assertion
 * 
 * Hard asseration;-
 * Hard Assertions are ones in which test execution is aborted if the test does not meet the assertion condition.
 *  The test case is marked as failed. In case of an assertion error, it will throw the “java.lang.AssertionError” exception.
 * 
 * Assertion contains the following methods:
 * 1) AssertEquals
   2) AssertNotEquals
   3) AssertTrue
   4) AssertFalse
   5) AssertNull
   6) AssertNotNull
 */



public class I_Hard_Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    

	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/#\"");
	    driver.manage().window().maximize();
	    
	    WebElement s = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
	    
	    s.isSelected();
	    System.out.println(s.isSelected());
	    
	    //1
	    // Assert.assertTrue(s.isSelected());
         Assert.assertFalse(s.isEnabled(),"condition is false");
	
	   driver.findElement(By.xpath("//div[@class=\"paxinfo\"]")).click();
	    
	    for (int i = 1; i < 4; i++)
	    {
	      driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
	    }
	    

	    driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	    
       //2
	    Assert.assertEquals("4 Adult", driver.findElement(By.xpath("//div[@class=\"paxinfo\"]")).getText());
	    
	    System.out.println(driver.findElement(By.xpath("//div[@class=\"paxinfo\"]")).getText());
	    
	}

}
