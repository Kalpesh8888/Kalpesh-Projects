package krishna.radhe;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_window_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("Webdriver.Chrome.driver", "Chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		
	driver.get("https://brand.linkedin.com/policies?trk=seo-authwall-base_footer-brand-policy\"");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/header/div/div/nav/ul/li[3]/a")).click();
	
	Set <String> Windows = driver.getWindowHandles();
	
	Iterator<String> A = Windows.iterator();
	
	String parent = A.next();
	String child1 = A.next();
	
	driver.switchTo().window(child1);
	driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/form[2]/button")).click();
	driver.switchTo().window(parent);
	driver.switchTo().window(child1).close();

	}
}
