package G_PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest2 {

	 @Test
	  public void VerifyFlightReg()
	  {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
    

	 Registrationpage2 RegPage2 = new Registrationpage2(driver);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://demo.guru99.com/test/newtours/");
    driver.manage().window().maximize();
    

    RegPage2.clickRegLink().click();
    RegPage2.setFirstname().sendKeys("Kalpesh");
    RegPage2.setlastname().sendKeys("Patil");
    RegPage2.setPhoneNumber().sendKeys( "88888334028");
    RegPage2.setEmail().sendKeys( "Patilkalpesh8888@gamil.com" );
    RegPage2.setAdress().sendKeys( "Bhagyoday Colony camp");
    RegPage2.setcity().sendKeys("Malegaon");
    RegPage2.setState().sendKeys( "Maharastra");
    RegPage2.setPostalCode().sendKeys( "423105");
    RegPage2.setCountry().sendKeys( "India");
    RegPage2.setUserName().sendKeys( "KalpeshPatil8888");
    RegPage2.setPassword().sendKeys( "Kalpesh@8888");
    RegPage2.setConfirmPassword().sendKeys( "Kalpesh@8888");
    RegPage2.ClickOnSubmit().click();
    
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