package c_vishal1.vishal1.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*Implicit Wait in Selenium
The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”.
 The default setting is 0. Once we set the time, the web driver will wait for the element for that time before throwing an exception.
 * 
 * Implicit Wait syntax:
   driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60))
 * for whole script act it.
 * 
 * 1) implicitlyWait is applied to all the web elements on the web page.
   2)  It will throw "No Such Element Exception" after reaching the time. 
   3) Implicit wait stays in place for the entire duration for which the browser is open.
   4) The default value of implicit wait is 0.
   5) Implicit wait is applied for the lifetime of the Webdriver, it can extend the test execution times to a large value depending on the number of elements on which it is being called.
   6)When to use implicitlyWait? 
  It is recommended to use implicit wait only when you are in complete control of the script.

 * 
 */


public class b_Implicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.easemytrip.com/?");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	    
	    driver.findElement(By.xpath("//div[@id='myFunction4']")).click();
	    
	    for (int i = 1; i < 4; i++)
	    {
	      driver.findElement(By.xpath("(//button[@class=\"add plus_box1\"])[1]")).click();
	    }
	    
	    driver.findElement(By.xpath("//*[@id=\"traveLer\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
	    driver.findElement(By.xpath("//span[@id=\"spn12\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"Editbox13_show\"]")).click();
	    driver.findElement(By.xpath("(//span[@id=\"spn2\"])[2]")).click();
	    
	    driver.findElement(By.xpath("//button[@class=\"srchBtnSe\"]")).click();
	    
	    
	    driver.findElement(By.xpath("(//button[@class=\"btn book-bt-n ng-scope\"])[1]")).click();
	

	
	}

}
