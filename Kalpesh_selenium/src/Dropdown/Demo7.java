package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		 
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
			
		    driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//div[@id=\'divpaxinfo\']")).click();
		 
		 Thread.sleep(2000);
		 
	 driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
		 int  i=1;
		 while(i<5)
		 {driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
	           i++;       }

	//for(int i=1;i<5;i++)
	//{driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();}
		 
		 
		 driver.findElement(By.xpath("//input[@value=\'Done\']")).click();  
		
	}

}
