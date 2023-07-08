package a_test_Selenium_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
 System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	
	WebDriver driver = new InternetExplorerDriver();
	
	driver.get("https://www.google.com/");
	
	
	}

}
