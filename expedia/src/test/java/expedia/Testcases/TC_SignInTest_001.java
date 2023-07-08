package expedia.Testcases;

import org.testng.annotations.Test;

import expedia.Base.BasePage;
import expedia.PageObjects.SigninPage;

public class TC_SignInTest_001 extends BasePage {
	
	 @Test
	  public void LoginTest(){
		
	logger.info("test case start");
		SigninPage Signing= new SigninPage(driver);
		
	  Signing.clickSignin();
	  Signing.clickSigninButton();
	  Signing.click_Sign_with_google();
	
	  logger.info("test case End"); 
	 

	  }

	
	
	
	
	
}
