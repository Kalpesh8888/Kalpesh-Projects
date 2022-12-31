package Selenium_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
//driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5\']/div[1]/form/div[1]/input")).sendKeys("kalpesh1223");
//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("123458");
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Iphone13");
	
	
	
	
	}

}
