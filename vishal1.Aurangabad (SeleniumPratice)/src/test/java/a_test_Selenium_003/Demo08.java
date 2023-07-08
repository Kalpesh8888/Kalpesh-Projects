package a_test_Selenium_003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Locators;-
 * A locator is a way to identify elements on  webpage.
 *  It is the argument passed to the Finding element methods.
 * 
 * Types of Locators in Selenium WebDriver
 *1) ID
2) Name
3) ClassName
4) TagName
5) LinkText
6) PartialText
7) CSS
8) Xpath
 
 */
public class Demo08 {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
   driver.get("https://www.facebook.com/login/");  
   
   
  driver.findElement(By.id("email")).sendKeys("kalpesh@123");
  
   driver.findElement(By.name("pass")).sendKeys("12345");

 //driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("12345");
  
  driver.findElement(By.tagName("button")).click();
  
 //  driver.findElement(By.linkText("Forgotten account?")).click();
  
  
   //driver.findElement(By.partialLinkText("Sign up for ")).click();
    
    
    driver.close();
    
    
    
    
    
    
    
	}

}
