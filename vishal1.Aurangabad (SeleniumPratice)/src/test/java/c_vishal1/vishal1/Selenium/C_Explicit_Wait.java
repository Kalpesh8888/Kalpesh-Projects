package c_vishal1.vishal1.Selenium;
/*Explicit Waits :- also known as Dynamic Waits because it is highly specific conditioned. 
 * It is implemented by WebDriverWait class. To understand why you need Explicit Wait in Selenium, you must go through the basic knowledge of the wait statements in a program.
 *  In simple terms, you must know some conditions. Such conditions have been created to give you a gist of the Explicit Waits and why they are important.
 * 
 * syntax;-
 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBox']")));
 *
 * 
 * The conditions available in the different language bindings vary, but this is a non-exhaustive list of a few:
 *1) alert is present
  2) element exists
  3) element is visible
  4)title contains
  5) title is
  6) element staleness
  7) visible text
 * 1) It is a conditional wait strategy 
   2) Wait until the the condition specified becomes true or the time duration is elapsed. 
    3)Explicit wait is only applied on the specified element. 
 * 
 * 
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_Explicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.easemytrip.com/?");
	    driver.manage().window().maximize();
	    
	    WebDriverWait W = new WebDriverWait(driver, Duration.ofSeconds(2));
	    

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
	    


	    W.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\\\"btn book-bt-n ng-scope\\\"])[1]")));
	    
	    driver.findElement(By.xpath("(//button[@class=\"btn book-bt-n ng-scope\"])[1]")).click();
	
	

	
	}

}
