package vishal1.vishal1.Aurangabad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    
	     WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
	    
	    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();
	    
	     Actions A = new Actions(driver);
	    
	    WebElement Source1 = driver.findElement(org.openqa.selenium.By.xpath("//div[@id=\"box6\"]"));
	    
	    WebElement target1 = driver.findElement(org.openqa.selenium.By.xpath("//div[@id=\"box106\"]"));
	    
	    A.dragAndDrop(Source1, target1).build().perform();
	    
	    A.dragAndDropBy(Source1, 100, 100).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
