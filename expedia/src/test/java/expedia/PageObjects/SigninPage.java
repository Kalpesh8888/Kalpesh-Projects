package expedia.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SigninPage {
	
	
	    public static WebDriver driver;
	    public SigninPage (WebDriver driver) {

	        this.driver=driver;
	        //driver=driver;
	        PageFactory.initElements(driver,this);  // method will create Webelement
	    }

	    @FindBy( xpath = "//div[contains(text(),'Sign in')]")
	    WebElement Signin;

	    @FindBy(xpath = "//a[normalize-space()='Sign in']")
	    WebElement SinginButton;

	    @FindBy (xpath = "(//a[normalize-space()='Create a free account'])[1]")
	    WebElement Create_a_free_account;

	    @FindBy(id = "social-auth-provider-siwg-google-web")
	    WebElement Sign_with_google;

	    @FindBy ( xpath = "//input[@id='loginFormEmailInput']")
	    WebElement email;

	    @FindBy ( xpath = "//button[@id='loginFormSubmitButton']")
	    WebElement ContinueButton ;

	    public WebElement clickSignin() {
	        return Signin;}

	    public WebElement clickSigninButton() {
	        return SinginButton;}

	    public WebElement click_Create_a_free_account() {
	        return Create_a_free_account;}

	    public WebElement click_Sign_with_google() {
	        return Sign_with_google;}

	    public WebElement  setEmail(String Email) {
	        return email;}
	    public WebElement  ClickContinueButton() {
	        return ContinueButton;}



}
