package vishal1.vishal1.Aurangabad;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_by_JavaScriptExeecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    WebDriverManager.edgedriver().setup();
		    WebDriver driver = new EdgeDriver();
		    
		    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		    driver.manage().window().maximize();
		    

		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    
		    js.executeScript("window.scrollBy(0,1600)");
		    
            js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,100)");
            
		
	
	
	
	
	
	}

}
