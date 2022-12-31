package vishal1.vishal1.Aurangabad;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink_handle_Single {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    
	    String url = driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[3]/a")).getAttribute("href");
	    
	    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	    

	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    int responsecode = conn.getResponseCode();
	    
	    System.out.println(responsecode);
	
	
	
	
	
	
	
	
	
	}

}
