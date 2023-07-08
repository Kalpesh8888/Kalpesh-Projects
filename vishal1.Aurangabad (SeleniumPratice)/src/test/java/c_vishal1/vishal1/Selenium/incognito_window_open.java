package c_vishal1.vishal1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class incognito_window_open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     WebDriverManager.chromedriver().setup();

		// Initialize browser

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver=new ChromeDriver(options);
		
		// Open facebook
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	
	
	
	
	
	
	
	
	
	}

}
