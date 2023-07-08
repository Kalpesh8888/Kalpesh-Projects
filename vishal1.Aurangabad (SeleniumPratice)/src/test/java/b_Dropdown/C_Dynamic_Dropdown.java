package b_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Dynamic_Dropdown {

	//Dynamic Drop Down 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@text=\"Delhi (DEL)\"]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		
		
		
		
		
		
	}

}
