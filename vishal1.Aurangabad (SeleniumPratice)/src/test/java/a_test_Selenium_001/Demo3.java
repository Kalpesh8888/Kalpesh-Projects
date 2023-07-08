package a_test_Selenium_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  //System.setProperty("webdriver.edge.driver","msedgedriver.exe");
	WebDriverManager.edgedriver().setup();
	
     WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.google.com/");
	
	 
	}

}
