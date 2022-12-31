package krishna.radhe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

       System.setProperty("Webdriver.Chrome.driver", "Chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	
      driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
	  
	  File kp2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	FileUtils.copyFile(kp2,new File("E://KALPESH//KALPESH//selenium//Screenshot/kp5.jpeg"));
	  
	  
	  
	  
	driver.close();
	
	
	}

}
