package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage2 {

	WebDriver driver;
	 
	 public Registrationpage2 (WebDriver driver) {
		  
		this.driver=driver;
		//driver=driver;
	 PageFactory.initElements(driver, this);  // method will create Webelement
		
	 }
	
	

	@FindBy( how=How.LINK_TEXT, using = "REGISTER")  //1St Syntax
	WebElement RegLink;
	
	@FindBy(name = "firstName") //2nd Syntax
	WebElement FirstName;
	
	@FindBy (name = "lastName")
	WebElement lastName;
	
	@FindBy (xpath = "//input[@name=\'phone\']")
	WebElement Phone;
	
	@FindBy (id = "userName")
	WebElement Email;
	
	@FindBy (name = "address1")
	WebElement address;
	
	@FindBy (xpath = "//input[@name=\'city\']")
	WebElement City;
	
	@FindBy (css = "input[name=\'state\']")
	WebElement State;
	
	@FindBy (name = "postalCode")
	WebElement postalCode;
	
	@FindBy (css = "select[name=\"country\"]")
	WebElement country;
	
	@FindBy (id="email")
	WebElement username;
	
	@FindBy (xpath = "//input [@name=\'password\']")
	WebElement password;
	
	@FindBy (name = "confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy (name = "submit")
	WebElement Submit;
	
	
	
	public WebElement clickRegLink() {
		 
	 return RegLink;}
	
	
	public WebElement setFirstname() {
		
	return FirstName;}
	
	public WebElement setlastname() {
		
		return lastName;}
	
	public WebElement setPhoneNumber()  
	{
		return Phone;
	}
	   
	public WebElement setEmail()  
	{
		return Email;
	}
	  
	public WebElement setAdress() 
	{
		return address;
	}
	   
	public WebElement setcity() 
	{
	  return City;
	}
     
	public WebElement setState()
	{
		return State;
	}
	public WebElement setPostalCode()
	{
		return postalCode;
	}
	public WebElement setCountry()
	{
	   return country;
	}
	
	public WebElement setUserName()
	{
		return username;
	}
	public WebElement setPassword()
	{
		return password;	
	}
	
	public WebElement setConfirmPassword()
	{
	          return ConfirmPassword;	
	}
	
	public WebElement ClickOnSubmit() 
	 
	{
		return Submit;
	    }
	 


}
