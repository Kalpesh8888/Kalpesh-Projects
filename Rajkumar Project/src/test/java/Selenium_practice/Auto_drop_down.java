package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement p = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		p.sendKeys("in");
		p.click();
	//System.out.println(	p.getText());
	 List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	 for(int i=0;i<options.size();i++) {
		 if(options.get(i).getText().equalsIgnoreCase("india")) {
			 options.get(i).click();
			 break;
		 }
	 }
			 
	
	}
}
