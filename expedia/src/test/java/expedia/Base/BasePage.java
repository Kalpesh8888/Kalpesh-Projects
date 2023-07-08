package expedia.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; // for logger

import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasePage {
	
	public static WebDriver driver;
    public static Logger logger;
    public static ResourceBundle rb;
    public static Properties p;

   
    @BeforeTest
    public void initializeBrowser () throws IOException  
    {
    	
          //Loading properties file (Approach1)
    	//rb = ResourceBundle.getBundle("Config");
    
    	// System.out.println("Message in " +": "+rb.getString("browserName")); 
    	
    	//rb=ResourceBundle.getBundle("config"); // name of properties file without extension
         
        //  String browser = rb.getString("browserName");
        
        //Loading properties file (Appraoch2)
       FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        p=new Properties();
        p.load(file);
         
        String browser =  p.getProperty("browserName");
       
        //log4j code
        logger=LogManager.getLogger(this.getClass());
         
        //System.out.println(rb.getBaseBundleName());
       // System.out.println(browser);
        
        //System.out.println("Running on --->" + browserName + "browser");

        if (browser.equals("chrome"))
        {
              WebDriverManager.chromedriver().setup();
             //driver=new ChromeDriver();
           ChromeOptions option =new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(option);
        }
        else if(browser.equals("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else if (browser.equals("safari"))
        {
            WebDriverManager.safaridriver().setup();
                  driver = new SafariDriver();
    } else if(browser.equals("firefox"))
        {   WebDriverManager.firefoxdriver().setup();
           driver=new FirefoxDriver();
    }else 
    {
		System.out.println(browser+ " Browser value is wrong, please pass the correct browser name....");
	}

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       // driver.get(rb.getString("url"));
       // driver.get(rb.getString("appURL"));   // local app URL
        //driver.get(p.getProperty("appURL"));   // local app URL  // getting URL from properties file
        //driver.get("https://demo.opencart.com/index.php");   // remote App URL
        driver.manage().window().maximize();
        driver.get(p.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
      
       
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public String randomeString()
    {
        String generatedString=RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }

    public String randomeNumber()
    {
        String generatedString=RandomStringUtils.randomNumeric(10);
        return generatedString;
    }

    public String randomAlphaNumeric()
    {
        String str=RandomStringUtils.randomAlphabetic(5);
        String num=RandomStringUtils.randomNumeric(3);

        return (str+"@"+num);
    }

    public String getScreenshot(String tname) throws IOException
    {

		/*Date dt=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMddhhmmss");
		String timeStamp=df.format(dt);
		*/
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());


        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
        try {
            FileUtils.copyFile(source, new File(destination));
        } catch (Exception e) {
            e.getMessage();
        }
        return destination;

    }

	

}
