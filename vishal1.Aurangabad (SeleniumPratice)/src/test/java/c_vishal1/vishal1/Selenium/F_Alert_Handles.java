package c_vishal1.vishal1.Selenium;
/*Aleret;-  Alert in Selenium is a small message box which appears on screen to give the user some information or notification. 
 * It notifies the user with some specific information or error, asks for permission to perform certain tasks and it also provides warning messages as well.
 * 
 * Types of Alerts in Selenium;-
 * 1) Simple Alert
 * 2) Prompt Alert/authorication pop - paasing with url
 * 3) Confirmation Alert/permission bases pops
 * 
 * methos of alerts;
 * accept,dissmiss,sendkeys, getText()
 * 
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_Alert_Handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		 System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    

		    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		    driver.manage().window().maximize();
		    

		    driver.findElement(org.openqa.selenium.By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		    driver.switchTo().alert().accept();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(org.openqa.selenium.By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		    driver.switchTo().alert().dismiss();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(org.openqa.selenium.By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		    System.out.println(driver.switchTo().alert().getText());
		    driver.switchTo().alert().sendKeys("Hi..Good Morning");
		    driver.switchTo().alert().accept();
	
	
	        driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
