package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	// Auto_Suggestion Drop Down
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
	 driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
	 driver.manage().window().maximize();
		
	 WebElement p = driver.findElement(By.id("autosuggest"));
		
	 p.sendKeys("in");
		
    Thread.sleep(3000);
		
   List<WebElement> options = driver.findElements(By.xpath("//*[@class='ui-menu-item']/a"));
	                	 
    for(WebElement option :options)
		{
		if(option.getText().equalsIgnoreCase("india"))
		
		{
		option.click();
		break;
		
		}
		 } 
		
		
		
		
		
		
		
	}

}
