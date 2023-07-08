package a_test_Selenium_002;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*What is a Selenium WebElement?
A WebElement, in this case, a WebElement in Selenium is essentially an HTML element on a website. 
HTML documents consist of HTML elements. Each HTML element consists of a start tag and an end tag. 
The content lies between the tags.

1) clear 2)submit   3) sendKeys  4) findElement 5) findElements 6)getAttribute
7)click  8) getText 9)isDisplayed 10) isEnabled 11) isSelected 12) getSize
13)getTagName  14) getLocation 16)getCssValue 

*/
public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");
		 driver.manage().window().maximize();
		 
   //     Dimension d= new Dimension(176,65);
		 
	//driver.manage().window().setSize(d);
		 
		 
		 WebElement Textfield =driver.findElement(By.xpath("//*[@id='FromSector_show']"));
		 

	      WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[3]/label/span"));
		
		 WebElement date = driver.findElement(By.xpath("//*[@id='ddate']"));
	
	 Textfield.click();
		 //click
		
	 Thread.sleep(2000);
		
		 Textfield.sendKeys("Mumbai");
		
		 //sendkeys
		
		 Thread.sleep(2000);
	
		 
		boolean e=Textfield.isEnabled();
		
		//isEnabled
		 
		System.out.println("is Enabled="+e);
		
	
		
	         boolean i= Checkbox.isSelected();
 	 //IsSelected
             System.out.println("isSelected = "+i);
 
            

   boolean z=date.isDisplayed();
	 //isDisplayed
		 
		 System.out.println("isDisplayed = "+z);

		 String t=date.getTagName();
//		 //tagname

		 System.out.println("Tagname = " +t);

         org.openqa.selenium.Dimension A=date.getSize();
		 	
           //size
		
		  System.out.println("Size = " +A);

		  String o =date.getAttribute("id");

		  //attribute

		  System.out.println("Attribute is = " +o);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
