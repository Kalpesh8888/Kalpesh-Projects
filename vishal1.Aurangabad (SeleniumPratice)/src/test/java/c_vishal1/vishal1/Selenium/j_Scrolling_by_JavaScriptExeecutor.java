package c_vishal1.vishal1.Selenium;
//Scrolling window and mouse handling
/*
 * JavaScriptExecutor is used to perform operations on a web page.
 * 
 * JavaScriptExecutor methods are as follows
  1)executeAsyncScript
  2)executeScript
 * 
 * 
 * 
 */
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j_Scrolling_by_JavaScriptExeecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    WebDriverManager.edgedriver().setup();
		    WebDriver driver = new EdgeDriver();
		    
		    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		    driver.manage().window().maximize();
		    

		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    
		    js.executeScript("window.scrollBy(0,1600)");
		    
            js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,100)");
            
          /* 
            Scenario #1: To Type Text in a Text Box
            js.executeScript("document.getElementById('some id').value='someValue';");
            js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
	 
           Scenario #2: To Click on a Button
            js.executeScript("document.getElementById('enter your element id').click();");
            or
          // js.executeScript("arguments[0].click();", loginButton);
            
           Scenario #3: To Handle Checkbox
	      js.executeScript("document.getElementById('enter element id').checked=false;");
	
	      Scenario #4: To generate Alert Pop window in selenium
	     js.executeScript("alert('Welcome To SoftwareTestingMaterial');");
	
	     Scenario #5: To refresh browser window using Javascript
	      js.executeScript("history.go(0)");
	
	    Scenario #6: To get innertext of the entire webpage in Selenium
	  String sText =  js.executeScript("return document.documentElement.innerText;").toString();
         System.out.println(sText);
	
	  Scenario #7: To get the Title of our webpage
       String sText =  js.executeScript("return document.title;").toString();
       System.out.println(sText);
	
	  Scenario #8: To get the domain
     String sText =  js.executeScript("return document.domain;").toString();
      System.out.println(sText);
      
      Scenario #9: To get the URL of a webpage
      String sText =  js.executeScript("return document.URL;").toString();
      System.out.println(sText); 
      
      Scenario #10: To perform Scroll on an application using  Selenium
	  /Vertical scroll - down by 500  pixels
      js.executeScript("window.scrollBy(0,500)");
     // for scrolling till the bottom of the page we can use the code like
     //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	Scenario #11: To click on a SubMenu which is only visible on mouse hover on Menu
    js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");
	
	Scenario #12: To navigate to a different page using Javascript
    js.executeScript("window.location = 'https://www.softwaretestingmaterial.com"); 
	
	Scenario #13: To find a hidden element in selenium using JavaScriptExecutor
    js.executeScript("arguments[0].click();", element);
	
	
	*/
	}

}
