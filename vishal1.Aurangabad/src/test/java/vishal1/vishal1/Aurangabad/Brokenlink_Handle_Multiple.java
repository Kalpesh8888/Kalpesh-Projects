package vishal1.vishal1.Aurangabad;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink_Handle_Multiple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    
	    List<WebElement> links = driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));
	    
	    for (WebElement link : links)
	    {
	      String Url = link.getAttribute("href");
	      
	      HttpURLConnection Conn = (HttpURLConnection)new URL(Url).openConnection();
	      
	      Conn.setRequestMethod("HEAD");
	      Conn.connect();

           int responsecode = Conn.getResponseCode();
	      
	      System.out.println(responsecode);
	      
	      if (responsecode > 400)
	      {
	        System.out.println("The link is "+ link.getText() + "Responsecode is" + responsecode);
	       
	        Assert.assertTrue(false);
	      }
	    }
	
	
	}

}
