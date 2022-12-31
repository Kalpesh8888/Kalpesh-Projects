package vishal1.vishal1.Aurangabad;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	    

	    driver.get("https://www.amazon.com/s?i=merchant-items&me=A1MMH070OTFSD0");
	    driver.manage().window().maximize();
	    
	    Actions p = new Actions(driver);
	    
	    WebElement A = driver.findElement(By.id("nav-link-accountList"));
	    
	    p.moveToElement(A).build().perform();
    
	    WebElement B = driver.findElement(By.id("twotabsearchtextbox"));
	    

   p.moveToElement(B).click().keyDown(Keys.SHIFT).sendKeys(new CharSequence[] { "real" }).keyUp(Keys.SHIFT).sendKeys(new CharSequence[] { "me" }).build().perform();
    
	    p.doubleClick(B).build().perform();
	    
	    p.contextClick().build().perform();

	



	
	
	
	
	
	
	
	
	}

}
