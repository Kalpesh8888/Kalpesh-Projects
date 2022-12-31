package Selenium_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
//driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38652/ind-vs-rsa-2nd-t20i-south-africa-tour-of-india-2022");
 driver.manage().window().maximize();
 
 //Rurturaj

  //Aboulte Xpath
//driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/div[1]/a")).click();
// Relative X-path
 //driver.findElement(By.xpath("//*[@id=\'innings_1\']/div[1]/div[3]/div[1]/a")).click();
	
 //pooran
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/46604/pak-vs-wi-3rd-odi-rescheduled-match-west-indies-tour-of-pakistan-2021-22d");
//  driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[2]/div[2]/div[4]/div[6]/div[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\'innings_1\']/div[4]/div[6]/div[1]/a")).click();
	}

}
