package krishna.radhe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
  //  case1
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
     driver.manage().window().maximize();
	 
	 Actions A = new Actions (driver) ;
	 
	 WebElement Source1 = driver.findElement(By.id("box5"));
	  WebElement Target1= driver.findElement(By.id("box106"));
	  
	 A.dragAndDrop(Source1, Target1).build().perform();
	
	 
    A.dragAndDropBy(Source1,100, 100).build().perform(); 
	 
	/* case2 (not Run)
	
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	driver.manage().window().maximize();
	
	Actions A = new Actions (driver);
	
	WebElement B= driver.findElement(By.xpath("//*[@id='fourth']/a[2]"));
	WebElement C = driver.findElement(By.xpath("//*[@id=\'loan\']/li"));
	
           A.dragAndDrop(B, C).build().perform(); */
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
