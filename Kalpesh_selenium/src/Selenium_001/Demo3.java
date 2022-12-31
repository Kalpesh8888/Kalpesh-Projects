package Selenium_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.setProperty("webdriver.edge.driver","C://selenium//Drivers/msedgedriver.exe");
	
  WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.google.com/");
	
	 
	}

}
