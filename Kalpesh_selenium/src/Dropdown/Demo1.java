package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
                       // Static DropDown Handle By Select class 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		 driver.manage().window().maximize();
	
//   WebElement Staticdropdown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
//	 
//	         Select d = new Select(Staticdropdown);
//	 
//	         d.selectByVisibleText("INR");
// 
//          System.out.println(d.getFirstSelectedOption().getText());
//
//          d.selectByValue("AED");
// 
//         System.out.println(d.getFirstSelectedOption().getText());
//
//          d.selectByIndex(3);
//		 
//		   System.out.println(d.getFirstSelectedOption().getText());
		 
		// OR 
		 
		 
		 //Selecting Options from Dropdown without methods
 		
 	 WebElement   Bdropdown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")); 
	 
            Select d = new Select(Bdropdown);

      List <WebElement>   alloptions=d.getOptions();

     for(WebElement option:alloptions)
     { 
   
     if(option.getText().equals("USD"))
     	{  
  		option.click();
 		System.out.println(option.getText());
  		break;
   	}
   
    
		
		
	}
	}

}
