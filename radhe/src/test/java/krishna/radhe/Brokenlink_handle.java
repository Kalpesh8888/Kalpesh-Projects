package krishna.radhe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink_handle {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
          
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
  
        
     /* case 1
   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
   driver.manage().window().maximize();
   
   String url=driver.findElement(By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[2]/ul/li[2]/a")).getAttribute("href");

	
	HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
	
	con.setRequestMethod("HEAD");
	con.connect();
	
	int rescode=con.getResponseCode();
	
	System.out.println(rescode); */
        
	// case2
	
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
List<WebElement> links= driver.findElements(By.xpath("//li[@class=\'gf-li\']/a"));
	
	for( WebElement link:links)
	{ String url=link.getAttribute("href");

	HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
	
	con.setRequestMethod("HEAD");
	con.connect();
	
	int respcode=con.getResponseCode();
	
	System.out.println(respcode);
	
	/*case3
	 if(respcode>400)
	 {
		 System.out.println("link-"+link.getText()+"code"+ respcode);
		 
	 }*/

	//case4
	 if(respcode>400)
	 {
		 System.out.println("link-"+link.getText()+" code-"+ respcode);
		 Assert.assertTrue(false);
	 }
	
	}}

}
