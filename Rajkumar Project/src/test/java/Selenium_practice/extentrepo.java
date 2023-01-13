package Selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentrepo {
	ExtentReports extent;
	ExtentSparkReporter reporter;
	@BeforeMethod
	public void ext() {
		
		
		String path = System.getProperty("user.dir")+"//report//repo.html";
	 reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("rajkuamr");
		reporter.config().setDocumentTitle("demo");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		}
	
	@Test
	public void browserint() {
		
		ExtentTest ext = extent.createTest("brower  int");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		ext.info("browser int");
		driver.get("https://www.amazon.com");
		ext.info("open amazon");
		driver.close();
		ext.info("browser.close");
		extent.flush();
		
		
		
	}

}
