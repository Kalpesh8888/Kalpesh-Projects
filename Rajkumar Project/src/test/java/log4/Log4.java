package log4;



import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4 {

	public static void main(String[] args) throws Exception {
		
	org.apache.logging.log4j.Logger logs =LogManager.getLogger(Log4.class.getName());
	
		
	int d=10;
		System.out.println(d);
		
		
		WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 int a=10,b=20;
	 System.out.println(a+b);
	 String s="rajkumar";
	 System.out.println(s);
	 logs.info("hii how r you");
	 logs.info("test case is pass");
	 
	 
	 if(a>b) {
		 System.out.println("a is greater");
	
		 }
	 else {
		 System.out.println("b is greater");
	 }
	 
	 }
	

	}


