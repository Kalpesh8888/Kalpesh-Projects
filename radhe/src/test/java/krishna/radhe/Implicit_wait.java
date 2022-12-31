package krishna.radhe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
	
   driver.get("https://www.easemytrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=14425253924&utm_content=128139253122&utm_term=easy%20my%20trip&utm_campaign=14425253924&utm_source=g_c&utm_medium=cpc&utm_term=e_easy%20my%20trip&adgroupid=128139253122&gclid=CjwKCAjwzeqVBhAoEiwAOrEmzf46");
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
	
//	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	
	 driver.findElement(By.xpath("//*[@id='FromSector_show']")).click();
	
	 driver.findElement(By.xpath("//*[@id=\'spn3\']")).click();
	 
	 driver.findElement(By.id("Editbox13_show")).click();
	 driver.findElement(By.xpath("//*[@id=\"toautoFill\"]/div/div/ul/li[1]")).click();
	 
	 driver.findElement(By.id("ddate")).click();
	 driver.findElement(By.xpath("//*[@id=\'fiv_4_30/06/2022\']")).click();
	driver.findElement(By.xpath("//*[@id='frmHome']/div[5]/div/div[3]/div[1]/div[5]/div/a")).click();
	
	for (int i=0;i<4;i++)
    {
		driver.findElement(By.xpath("//*[@id=\"myDropdown_n\"]/div/div[1]/div[2]/div/div[3]/input")).click();
       }
	driver.findElement(By.xpath("//*[@id=\'traveLer\']")).click();
	
	driver.findElement(By.xpath("//*[@id=\'search\']/input")).click();
	
	  //Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"ResultDiv\"]/div/div/div[4]/div[1]/div[1]/div[1]/div[6]/button[1]")).click();
	
	}

}
