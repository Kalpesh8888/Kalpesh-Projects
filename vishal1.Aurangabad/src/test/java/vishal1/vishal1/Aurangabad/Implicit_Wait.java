package vishal1.vishal1.Aurangabad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.easemytrip.com/?");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	    
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
	    
	    
	    driver.findElement(By.xpath("(//button[@class=\"btn book-bt-n ng-scope\"])[1]")).click();
	

	
	}

}
