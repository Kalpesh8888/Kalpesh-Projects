package a_test_Selenium_002;
//These nested interfaces are used to perform operations like back(), forward() etc.
//get & navigate() method

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 driver.navigate().to("https://www.mahatransco.in/");
	
	 driver.navigate().back();
	
	 driver.navigate().forward();
	
	 driver.navigate().refresh();
	 
	 Point p = new Point(100,100);
	 
    driver.manage().window().setPosition(p);
		
		Dimension d = new Dimension (100, 100);
		
		driver.manage().window().setSize(d);
		
		
		
		
		
		
	}

}
