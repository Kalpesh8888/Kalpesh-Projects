package Selenium_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C://selenium//Drivers/geckodriver.exe");
 
 WebDriver driver = new FirefoxDriver();

	driver.get("https://www.facebook.com/");
	driver.close();
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
	
	
	}

}
