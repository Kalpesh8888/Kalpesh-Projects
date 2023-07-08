package b_PathAndQuary_Parameters;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class D_loggingDemo { 
	                                 // Logging 
     @Test (priority = 1)
     void test_logs () {

    	 given()
       	 
       	 .when()
       	     .get("https://reqres.in/api/users?page=2")   
       	 .then()
       	  
              //.log().body();      //only printout body
          //     .log().cookies();   // only printout cookies
             // .log().headers();  // only response headers    
    	         .log().all(); //all response printout
     
     }
     
}
