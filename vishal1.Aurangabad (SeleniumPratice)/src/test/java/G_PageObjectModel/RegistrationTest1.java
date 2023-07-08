package G_PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest1 {

	  @Test
	  public void VerifyFlightReg()
	  {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    Registrationpage1 RegPage = new Registrationpage1(driver);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://demo.guru99.com/test/newtours/");
	    driver.manage().window().maximize();
	    
	    RegPage.clickRegLink();
	    RegPage.setFirstName("Kalpesh");
	    RegPage.setLastName("patil");
	    RegPage.setPhoneNumber("8888334028");
	    RegPage.setEmail("Patilkalpesh8888@gamil.com");
	    RegPage.setAdress("Bhagyoday Colony Camp");
	    RegPage.setcity("Malegaon");
	    RegPage.setState("Maharastra");
	    RegPage.setPostalCode("423105");
	    RegPage.setCountry("India");
	    RegPage.setUserName("KalpeshPatil8888");
	    RegPage.setPassword("Kalpesh@8888");
	    RegPage.setConfirmPassword("Kalpesh@8888");
	    RegPage.ClickoOnSubmit();
	    

	    //validation
	    
	    
	    if (driver.getPageSource().contains("Thank you for registering"))
	    {
	      System.out.println("Your Registration Succesful Done- Test passed");
	    }
	    else {
	      System.out.println("Your Registration is not Succesful - Test Failed");
	    }
	  }
}
