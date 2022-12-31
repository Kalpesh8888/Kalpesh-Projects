package Intro_Testng_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_reports {

	 ExtentReports  extent ;
	  
	 @BeforeTest
	  public void configuration()
	  {
	    String path = System.getProperty("user.dir")+"//reports//index.html";
	    
	    ExtentSparkReporter Report = new ExtentSparkReporter(path);
	    
	    Report.config().setReportName("Automation Testing");
	    Report.config().setDocumentTitle("Results");
	    
	    extent = new ExtentReports();
	    extent.attachReporter(Report);
	    extent.setSystemInfo("TesterName","Kalpesh Patil");
	  
	  }
	  
	  @Test
	  public void initialDemo()
	  {
	    ExtentTest Test = extent.createTest("initialDemo");
	    
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/?");
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	   
	    extent.flush();
	  }
	  }
