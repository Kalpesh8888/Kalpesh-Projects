package g_Authentications_Types;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

/*Authentications Types
           1) Basic Authentication
           2) Digest Authentication
           3) Preemptive Authentication
           4)  Bearer tokan
           5)OAuth 1
           6)  OAuth 2
           7) API Key
                                                   */
public class a_Authentications_Types {

      @Test (priority = 1)
    void testbasicAuthentication() 
   {

         given()
             .auth().basic("postman", "password")
         .when()
             .get("https://postman-echo.com/basic-auth")
         .then()
             .statusCode(200)
             .body("authenticated",equalTo(true))
             .log().all();
}
   

   @Test (priority = 2)
   void  testDigestAuthentication() 
   {

         given()
             .auth().digest("postman","password")                              
         .when()
             .get("https://postman-echo.com/digest-auth")
         .then()
             .statusCode(200)
             .body("authenticated",equalTo(true))
             .log().all();
}

   @Test (priority = 3)
   void  PreemptiveAuthentication () 
   {

         given()
             .auth().preemptive().basic("postman", "password")
             
          .when()
             .get("https://postman-echo.com/basic-auth")
         .then()
             .statusCode(200)
             .body("authenticated",equalTo(true))
             .log().all();
}
   
   @Test (priority = 4)
   void testBearerTokanAuthentication() {    
	   
	  String BearerTokan ="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"; 
	   

	   given()
           .headers("Authorization","Bearer "+ BearerTokan)
 
      .when()
         .get("https://api.github.com/user/repos")
         
     .then()
         .statusCode(200)
         .log().all();
	   
     }
   
   @Test (priority = 5)
   void testOAuth1Authentication() {   
   
	    given()
          .auth().oauth("ConsumerKey", "ConsumerSecret", "AccessToken","tokenSecret")  // this is for Auth1.0 authetication
          		
          .when()
            .get("url")
     
              .then()
               .statusCode(200)
               .log().all();
   }
	   @Test (priority = 6)
	   void testOAuth2Authentication() {    //not working
	   
		   given()
	          .auth().oauth2( "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") //AccessToken only
	          // this is for Auth1.0 authetication
	          	
	  .when()
	     .get("https://api.github.com/user/repos")
	     
	  .then()
	     .statusCode(200)
	     .log().all();
		   
}
	   
	   //Api Key
	   
	    
	   @Test (priority = 7)
	   void testAPI_key_Authentication() {   //not failed
	   //method1
		/*   given()
	               .queryParam("appid","6ad80bf0aae28ebc6000d8a4045ea75f") //appid is Api Key 
	      .when()
	 	     .get("http://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7")
	 	  .then()
	 	     .statusCode(200)
	 	     .log().all();          */
		  
	   
	   //Methdo 2
	   
	           given()
		         .queryParam("{API key}","6ad80bf0aae28ebc6000d8a4045ea75f") //appid is Api Key 
		         .pathParam("{API key}", "{API key}")
		       // .queryParam("q", "Delhi")
		       // .queryParam("units","metric")
		      //  .queryParam("cnt","7")
		        .when()
		 	     .get("api.openweathermap.org/data/2.5/weather?q=London&appid={API key}")
		 	  .then()
		 	     .statusCode(200)
		 	     .log().all();
	   
	   
	   }







}