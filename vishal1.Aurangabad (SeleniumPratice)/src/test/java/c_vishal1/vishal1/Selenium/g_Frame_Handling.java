package c_vishal1.vishal1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class g_Frame_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
	    

	    Actions A = new Actions(driver);
	    
	    WebElement Source1 = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	    WebElement Target1 = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	        
	        A.dragAndDrop(Source1, Target1).build().perform();
          // A.dragAndDropBy(Source1,100,50).build().perform();   
	
	
	}

}
