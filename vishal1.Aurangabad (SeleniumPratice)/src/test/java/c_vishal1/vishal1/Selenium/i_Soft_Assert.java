package c_vishal1.vishal1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
/*Soft Assertions;- 
 * Soft asserts are the asserts which continue the execution even after the Assert condition fails. 
 * Soft asserts are mainly used to verify certain test conditions in the code.
 * It is used in a case when the passing of one test condition is not necessary to execute the upcoming tests.
 * It is not included by default in TestNG, In order to use the soft assert, we have to import package from TestNG.
 * 
 * Creating Instance for Soft Assert:
      
      softAssert softAssert = new SoftAssert();
 * 
 *   - assertAll() method that is used to throw the exceptions and results at the end of the test.
 * 
 * Soft Assert also supports all the methods used by Hard Asserts such as,
  1) AssertEquals
  2) AssertTrue
  3) AssertFalse
  4) AssertNotEquals
 * 
 */

public class i_Soft_Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
	     WebDriver driver = new EdgeDriver();
	    

	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/#\"");
	    driver.manage().window().maximize();
	    
	    WebElement s = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
	    
	    s.isSelected();
	   
	    System.out.println(s.isSelected());
	    

	    SoftAssert softassert = new SoftAssert();
	    
	    softassert.assertTrue(s.isSelected());
	    
	    driver.findElement(By.xpath("//div[@class=\"paxinfo\"]")).click();
	    
	    for (int i = 1; i < 4; i++)
	    {
	      driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	    }
	    
	    
	    driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	    


	    softassert.assertEquals("3Adult", driver.findElement(By.xpath("//div[@class=\"paxinfo\"]")).getText());
	    
	    System.out.println(driver.findElement(By.xpath("//div[@class=\"paxinfo\"]")).getText());
	    

	    softassert.assertAll();
	

	
	
	}

}
