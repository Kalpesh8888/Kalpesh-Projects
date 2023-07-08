package c_vishal1.vishal1.Selenium;
/*Fluent wait
Fluent wait is similar to Explicity wait 
It takes an additional argument frequency i.e., polling time. 
frequency number tells the WebDriver to keep on checking for the element at regular time intervals wait till the maximum of "Duration.ofSeconds"
If the element becomes avaialble earlier, we proceed with the  test execution and finish quickly. 
Example: 
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
  .withTimeout(Duration.ofSeconds(30))
  .pollingEvery(Duration.ofSeconds(5))
  .ignoring(NoSuchElementException.class);

Maximum waiting time is 30 seconds 
polling time is 5 seconds 
WebDriver keeps on checking for the element for every 5 seconds to a maximum of 30 seconds ignoring will ignore the exception NoSuchElementException while the driver finds the element in the maximum time.
 * 
 * syntax;-
 * 
 *Wait wait = new FluentWait(WebDriver reference)
.withTimeout(timeout, SECONDS)
.pollingEvery(timeout, SECONDS)
.ignoring(Exception.class);
 * 
 * 
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;
public class D_Fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		 
		
		  // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
		 
}
}