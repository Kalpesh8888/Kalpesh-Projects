package b_PathAndQuary_Parameters;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;



public class c_HeaderDemo {
	
	 @Test (priority = 1)
	   void test_Header() {                   //validation done only in this test
	    
	       given()
		
		  .when()
		 	.get("https://www.google.com/")
			
		   .then()
		      .header("Content-Type", "text/html; charset=ISO-8859-1")
		      .and()
		      .header("Content-Encoding", "gzip")
		      .and()
	          .header("Server", "gws");
	  }
	    
	 		
	 	
	  @Test (priority = 2)
	   void get_Header() {
	    
		  Response res= given()
			
		  .when()
		 	.get("https://www.google.com/");
			
	        // Get Single Header Info 
	       
	    //  String   Header_value =res.getHeader("Content-Type"); // or  res.header(Header_value)
		       
	//  System.out.println("value of Header is ===>"+ Header_value );
	     
	            //get all Header Info 
	     
		    Headers  MYHeaders =  res.getHeaders();
	       
	         for (Header hd:MYHeaders)           // Both key value Hard
	        
	      {
	        System.out.println( hd.getName()+" "+hd.getValue());
	        	 
	      }
	         // log().all()  // we used necsearry print all information;
	         
	         
	         
	  }
	  }








