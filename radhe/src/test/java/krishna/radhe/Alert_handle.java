package krishna.radhe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	
	
      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      driver.manage().window().maximize();
	//case1
	 driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/button")).click();
	  
	System.out.println(driver.switchTo().alert().getText());   
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	//case2
	
	driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[2]/button")).click();
	System.out.println( driver.switchTo().alert().getText());  
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	//case3 
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	driver.switchTo().alert().sendKeys("kalpesh");
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	  //OR
	
 driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	
	 Alert A= driver.switchTo().alert();
	 A.sendKeys("vicky");
	 System.out.println(A.getText());
    A.accept();
	
	
	}

}
