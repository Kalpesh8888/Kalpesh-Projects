package Selenium_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("kalpesh@gmail.com");
driver.findElement(By.id("pass")).sendKeys("kalpesh@123"); 
driver.findElement(By.id("loginbutton")).click();
  
  
  
  
  
  
}

	
		
	}
}
