package krishna.radhe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromiumdriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	 driver.manage().window().maximize();
	
	JavaScriptExecutor js = (JavaScriptExecutor)driver;
	
  js.executeScript("window.scrollBy(0,800)");
  
 
  Thread.sleep(2000);
  
  System.out.println(js.executeScript("window.scrollbars.visible"));
  
  
  js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,100)");//scrolling down
  

 
  
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
