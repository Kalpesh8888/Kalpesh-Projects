package vishal1.vishal1.Aurangabad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handles {

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
