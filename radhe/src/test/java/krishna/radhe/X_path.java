package krishna.radhe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("WebDriver.chromedriver.driver","Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	 //Absoulte X-path
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("kalpesh");
	
	//relative X-path
	//driver.findElement(By.xpath("//div[@class=\"clearfix _5466 _44mg\"]/div/div/input")).sendKeys("12345");
	
	//contains -method
	
	//driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("Vicky");
	
	//Or & and Method
	
	driver.findElement(By.xpath("//input[@name='email' or @class='clearfix _5466 _44mg']")).sendKeys("kalpu");
	
	driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("kalpesh");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
