package c_vishal1.vishal1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_Alert_Handles2 {
//Permission based PoPs
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ChromeOptions options = new ChromeOptions();
	    
	    options.addArguments(new String[] { "--disable-notifications" });
	    
	    WebDriverManager.chromedriver().setup();
	    
	    WebDriver driver = new ChromeDriver(options);
	    
	    driver.get("https://indiadesire.com/");
	    driver.manage().window().maximize();
	
	
	
	}

}
