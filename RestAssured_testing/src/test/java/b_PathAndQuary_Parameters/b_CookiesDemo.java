package b_PathAndQuary_Parameters;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

//Headers and cookies


public class b_CookiesDemo {



   // @Test (priority = 1)
   void testCookies() {
    
       given()
		
	  .when()
	 	.get("https://www.google.com/")
		
	 .then()
	    .cookie("AEC","ARSKqsLLaAZrOajiHKkyy8qn7q9e9hYvooYiHcQWV_ftqiZuZ5JESRS__w")
	    .log().all();
}
    
    @Test (priority = 2 )
    void getCookiesInfo() {
     
       Response res=given()
 		
 	  .when()
 	 	.get("https://www.google.com/");
 		
 	 // Get Single Cookies Inf0
       
   // String  Cookie_value=res.cookie("AEC");
       
   // System.out.println("value of cookie is ===>"+ Cookie_value );
 
    //get all Cookies Info
    Map <String,String>   Cookies_value = res.cookies(); 
   
    //System.out.println( Cookies_value.keySet());  //keys= [1P_JAR, AEC, NID]
     // System.out.println(Cookies_value.entrySet()); // Both key value simple
    
    for (String k:Cookies_value.keySet())           // Both key value Hard
    
    {
    	String Cookie_value = res.getCookie(k);    
    	System.out.println(k +" "+ Cookie_value);
    }

}
}