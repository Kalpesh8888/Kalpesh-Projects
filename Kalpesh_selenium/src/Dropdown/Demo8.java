package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
           // calender Programming
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			
	     WebDriver driver = new ChromeDriver();
		 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	    driver.manage().window().maximize();
		 
		driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[1]")).click();
		
		driver.findElement(By.xpath("(//td[@data-event=\"click\"]/a)[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[2]")).click();

		
		
      List <WebElement>	datecount =driver.findElements(By.xpath("//td[@data-handler=\'selectDay\']"));
	
		for(int i=0;i<datecount.size();i++)
		{
			if(datecount.get(i).getText().equalsIgnoreCase("30"))
			{ datecount.get(i).click();
         		break;
			}
      		}

	
	}

}
