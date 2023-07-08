package a_test_Selenium_002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*What is Selenium WebDriver Interface?
 * Selenium WebDriver is an interface that defines a set of methods.
 *  However, implementation is provided by the browser specific classes. 
 *  Some of the implementation classes are AndroidDriver, ChromeDriver, FirefoxDriver, InternetExplorerDriver, IPhoneDriver, SafariDriver etc. 
 * 
 * Selenium WebDriver Methods
 * SearchContext is the topmost interface in Selenium API which has two methods - 
 * 1)findElement() and
 * 2) findElements(). 
 * Selenium WebDriver interface has many abstract methods like 
 * 3)get(String url), 4) quit(), 5) close(), 6) getWindowHandle(), 7) getWindowHandles(),8) getTitle() etc.
 *  WebDriver has nested interfaces like Window, Navigation, Timeouts etc. These nested interfaces are used to perform operations like back(), forward() etc.

 * 
 */

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		
		System.out.println((driver.getCurrentUrl()));
		
		driver.close();
	
		
		driver.quit();
		
		
		
	
	
	
	
	}}
	
