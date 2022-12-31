package krishna.radhe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
 
   WebDriver driver = new ChromeDriver();
   
  driver.get("https://www.amazon.com/s?i=merchant-items&me=A1MMH070OTFSD0");
  driver.manage().window().maximize();
  Actions P = new Actions(driver) ;
  
//  case 1
//  driver.findElement(By.id("nav-link-accountList"));
//  P.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
//	
//    case 2
//  
	WebElement W =driver.findElement(By.id("nav-link-accountList"));
//	
      P.moveToElement(W).build().perform();
//	// P.click().build().perform();
//	 
    	WebElement T = driver.findElement(By.id("twotabsearchtextbox"));
         //P.moveToElement(T).click().sendKeys("iphone13").build().perform();
   //  P.moveToElement(T).click().keyDown(Keys.SHIFT).sendKeys("one plus7t").build().perform();  //ONE PLUS&T
//	P.moveToElement(T).click().keyDown(Keys.SHIFT).sendKeys("real").keyUp(Keys.SHIFT).sendKeys("me").build().perform(); // REALme
//	
//P.doubleClick(W).build().perform();
//	
	P.contextClick().build().perform();
	
	
	
	}

}
