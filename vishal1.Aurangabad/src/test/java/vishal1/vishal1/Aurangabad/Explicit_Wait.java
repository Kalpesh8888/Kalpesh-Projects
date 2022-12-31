package vishal1.vishal1.Aurangabad;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.easemytrip.com/?");
	    driver.manage().window().maximize();
	    
	    WebDriverWait W = new WebDriverWait(driver, Duration.ofMinutes(1));
	    

	    driver.findElement(By.xpath("//div[@id='myFunction4']")).click();
	    
	    for (int i = 1; i < 4; i++)
	    {
	      driver.findElement(By.xpath("(//button[@class=\"add plus_box1\"])[1]")).click();
	    }
	    
	    driver.findElement(By.xpath("//*[@id=\"traveLer\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
	    driver.findElement(By.xpath("//span[@id=\"spn12\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"Editbox13_show\"]")).click();
	    driver.findElement(By.xpath("(//span[@id=\"spn2\"])[2]")).click();
	    
	    driver.findElement(By.xpath("//button[@class=\"srchBtnSe\"]")).click();
	    


	    W.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\\\"btn book-bt-n ng-scope\\\"])[1]")));
	    
	    driver.findElement(By.xpath("(//button[@class=\"btn book-bt-n ng-scope\"])[1]")).click();
	
	

	
	}

}
