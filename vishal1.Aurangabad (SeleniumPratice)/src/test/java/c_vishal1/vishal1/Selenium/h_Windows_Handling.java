package c_vishal1.vishal1.Selenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class h_Windows_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	    

	    driver.get("https://business.linkedin.com/marketing-solutions//");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//a[@class=\"primary-navigation-action more js-analytics-event at-element-click-tracking\"]")).click();
	    

	    Set<String> windows = driver.getWindowHandles();
	    

	    Iterator<String> itr = windows.iterator();
	    


	    String parent = (String)itr.next();
	    
	    String chiled = (String)itr.next();
	    
	    driver.switchTo().window(parent);
	    


	    System.out.println(driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).getText());
	    
	    driver.switchTo().window(chiled);
	    
         driver.switchTo().window(chiled).close();
	    
	    driver.quit();
	}

}
