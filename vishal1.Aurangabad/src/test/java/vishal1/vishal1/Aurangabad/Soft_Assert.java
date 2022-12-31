package vishal1.vishal1.Aurangabad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Soft_Assert {

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
