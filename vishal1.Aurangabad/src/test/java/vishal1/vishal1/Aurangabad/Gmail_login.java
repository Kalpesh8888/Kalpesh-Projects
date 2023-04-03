package vishal1.vishal1.Aurangabad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*WebDriverManager.edgedriver().setup();
		  WebDriver driver= new EdgeDriver(); */
		
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver= new ChromeDriver();
			 
		    driver.get("https://accounts.google.com/");
		
	      driver.findElement(By.xpath("//input[@class=\'whsOnd zHQkBf\']")).sendKeys("patilkalpesh1709@gmail.com");
		 driver.findElement(By.xpath("(//span [@class=\"VfPpkd-vQzf8d\"])[2]")).click();
		 
	
	}

}
