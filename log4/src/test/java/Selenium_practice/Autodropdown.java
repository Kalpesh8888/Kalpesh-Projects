package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.xpath("//div[@class='eb_widget_header_close']")).click();
		WebElement fromcity = driver.findElement(By.xpath("//input[@id='FromSector_show']"));
		fromcity.click();
		fromcity.sendKeys("del");
	
	List<WebElement> elements = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div/span"));
       for(int i=0;i<elements.size();i++) {
    	   
    	  String text = elements.get(i).getText();
    	  if(text.equalsIgnoreCase("deline")){
    			  elements.get(i).click();
    			  break;
    	   
    	   
       }
	
    	   }
       
	driver.close();

	}
}
