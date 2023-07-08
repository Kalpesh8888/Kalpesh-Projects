package c_vishal1.vishal1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*Action Class;-Actions class is an ability provided by Selenium for handling keyboard and mouse events. 
 * 
 The methods of ActionChains class are listed below −
click − It is used to click a webelement.
click_and_hold − It is used to hold down the left mouse button on a webelement.
double_click − It is used to double click a webelement.
context_click − It is used to right click a webelement.
drag_and_drop_by_offset − It is used to first perform pressing the left mouse on the source element, navigating to the target offset and finally releasing the mouse.
drag_and_drop − It is used to first perform pressing the left mouse on the source element, navigating to the target element and finally releasing the mouse.
key_up − It is used to release a modifier key.
key_down − It is used for a keypress without releasing it.
move_to_element − It is used to move the mouse to the middle of a webelement.
move_by_offset − It is used to move the mouse to an offset from the present mouse position.
Perform − It is used to execute the queued actions.
move_to_element_by_offset − It is used to move the mouse by an offset of a particular webelement. The offsets are measured from the left-upper corner of the webelement.
Release − It is used to release a held mouse button on a webelement.
Pause − It is used to stop every input for a particular duration in seconds.
send_keys − It is used to send keys to the present active element.
reset_actions − It is used to delete all actions that are held locally and in remote.
 * 
 * 
 */
public class a_Action_Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	    

	    driver.get("https://www.amazon.com/s?i=merchant-items&me=A1MMH070OTFSD0");
	    driver.manage().window().maximize();
	    
	    Actions p = new Actions(driver);
	    
	    WebElement A = driver.findElement(By.id("nav-link-accountList"));
	    
	    p.moveToElement(A).build().perform();
    
	    WebElement B = driver.findElement(By.id("twotabsearchtextbox"));
	    

   p.moveToElement(B).click().keyDown(Keys.SHIFT).sendKeys(new CharSequence[] { "real" }).keyUp(Keys.SHIFT).sendKeys(new CharSequence[] { "me" }).build().perform();
    
	    p.doubleClick(B).build().perform(); //
	    
	    p.contextClick().build().perform(); //right Click of mouse

	



	
	
	
	
	
	
	
	
	}

}
