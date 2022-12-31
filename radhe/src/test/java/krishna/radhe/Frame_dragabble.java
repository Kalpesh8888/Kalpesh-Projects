package krishna.radhe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_dragabble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=\'demo-frame\']")));
	
	Actions A = new Actions(driver);
		
   WebElement Source1 = driver.findElement(By.id("draggable"));
   WebElement Target1 = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	
	//A.dragAndDrop(Source1, Target1).build().perform();	
	A.dragAndDropBy(Source1, 500,100).build().perform();
	
	
	}

}
