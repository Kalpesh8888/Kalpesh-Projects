package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//input[@name=\'q\']")).sendKeys("selenium");
		
	Thread.sleep(2000);
	
	List <WebElement> Autodropdown=driver.findElements(By.xpath("//li[@class=\"sbct\"]"));
	
	// Get All Text of all Auto Suessgion Options
	
	
	                                                                           
	for(int i=0;i<Autodropdown.size();i++)
                                                     	{
	  System.out.println(Autodropdown.get(i).getText());
    }

	
//	for(int i=0;i<Autodropdown.size();i++)
//	{
//		if(Autodropdown.get(i).getText().equalsIgnoreCase("Selenium Webdriver"))
//		{
//			Autodropdown.get(i).click();
//             break;
//		}
//		
//	}
//	driver.close();
}}
