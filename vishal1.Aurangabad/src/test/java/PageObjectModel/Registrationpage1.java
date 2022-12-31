package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Registrationpage1 {

	WebDriver driver;
	
	  By RegLink = By.linkText("REGISTER");
	  By firstName = By.name("firstName");
	  By lastName = By.name("lastName");
	  By Phone = By.xpath("//input[@name='phone']");
	  By Email = By.name("userName");
	  By address = By.name("address1");
	  By city = By.xpath("//input [@name='city']");
	  By State = By.xpath("//input[@name='state']");
	  By postalcode = By.name("postalCode");
	  By country = By.cssSelector("select[name='country']");
	  By username = By.xpath("//input[@name='email']");
	  By password = By.cssSelector("input[name='password'] ");
	  By confirmPassword = By.name("confirmPassword");
	  By submit = By.name("submit");
	  

	  Registrationpage1(WebDriver d)
	  {
		 // this.driver=driver;
	    driver = d;
	    }
	  

	  public void clickRegLink()
	  {
	    driver.findElement(RegLink).click();
	  }
	  
	  public void setFirstName(String Firstname) {
	    driver.findElement(firstName).sendKeys(new CharSequence[] { Firstname });
	  }
	  
	  public void setLastName(String Lastname) {
	    driver.findElement(lastName).sendKeys(new CharSequence[] { Lastname });
	  }
	  
	  public void setPhoneNumber(String PhoneNo)
	  {
	    driver.findElement(Phone).sendKeys(new CharSequence[] { PhoneNo });
	  }
	  
	  public void setEmail(String Emailid)
	  {
	    driver.findElement(Email).sendKeys(new CharSequence[] { Emailid });
	  }
	  
	  public void setAdress(String Adress)
	  {
	    driver.findElement(address).sendKeys(new CharSequence[] { Adress });
	  }
	  
	  public void setcity(String City)
	  {
	    driver.findElement(city).sendKeys(new CharSequence[] { City });
	  }
	  
	  public void setState(String state)
	  {
	    driver.findElement(State).sendKeys(new CharSequence[] { state });
	  }
	  
	  public void setPostalCode(String Code) {
	    driver.findElement(postalcode).sendKeys(new CharSequence[] { Code });
	  }
	  
	  public void setCountry(String Country) {
	    driver.findElement(country).sendKeys(new CharSequence[] { Country });
	  }
	  
	  public void setUserName(String UserName)
	  {
	    driver.findElement(username).sendKeys(new CharSequence[] { UserName });
	  }
	  
	  public void setPassword(String Password) {
	    driver.findElement(password).sendKeys(new CharSequence[] { Password });
	  }
	  
	  public void setConfirmPassword(String ConfirmPassword)
	  {
	    driver.findElement(confirmPassword).sendKeys(new CharSequence[] { ConfirmPassword });
	  }
	  
	  public void ClickoOnSubmit()
	  {
	    driver.findElement(submit).click();
	  }

}
