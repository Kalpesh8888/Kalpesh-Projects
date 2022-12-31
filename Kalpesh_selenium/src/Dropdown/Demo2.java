package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo2 {

	// Static DropDown by select Class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	     
	 WebDriver driver = new ChromeDriver();

	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  
	 WebElement d = driver.findElement(By.xpath("//*[@id=\'drop1\']"));

	  Select S = new Select(d);
	 
	  S.selectByIndex(2);  
	  
	  System.out.println(S.getFirstSelectedOption().getText());
	  
	  S.selectByVisibleText("doc 3");
	 
	  System.out.println(S.getFirstSelectedOption().getText());
	   
	  S.selectByValue("mno");
	 
	  System.out.println(S.getFirstSelectedOption().getText());


		//S.deselectAll();
	 
		
		
		
	}

}
