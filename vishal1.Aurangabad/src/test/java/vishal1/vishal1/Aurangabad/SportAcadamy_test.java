package vishal1.vishal1.Aurangabad;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SportAcadamy_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.sportsadda.com/");
	    driver.manage().window().maximize();
	    

	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0,800)", new Object[0]);
	    driver.findElement(By.xpath("(//*[@class='load'])[3]")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='card-list']/a")).click();
	    

	    driver.findElement(By.xpath("(//li[@class='tab-name'])[3]")).click();
	    
	    
	    driver.close();
	    driver.quit();
	}

}
