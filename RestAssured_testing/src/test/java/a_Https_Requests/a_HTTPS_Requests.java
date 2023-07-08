package a_Https_Requests;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;
/*
 *Given() - Prerequisite required
 *   content Type,set cookies,add Path,add Parameter ,set headers info etc.....
 *   Given’ keyword, lets you set a background, here, you pass the request headers, query and path param, body, cookies. 
 *   This is optional if these items are not needed in the request
 * 
 * When()-  Https Request Sent
 *        Get,post,put.patch ,Delete,Head etc...‘when’ keyword marks the premise of your scenario. 
 *        For example, ‘when’ you get/post/put something, do something else.
 *       a  Method()	- Substitute this with any of the CRUD operations(get/post/put/delete)
 *        
 * Then() - Valiadations 
 *    validate Status code,extract response, extract headers cookies & response body....   
 *    Your assert and matcher conditions go here.
 * 
*/

public class a_HTTPS_Requests {

	
	
	
	
	
	
	@Test (priority = 1)
	void getUsers() 
    {
   	 given()
   	 
   	 .when()
   	     .get("https://reqres.in/api/users?page=2")   //Get Reuest
   	 .then()
          .statusCode(200)
   	    .body("page",equalTo(2))
   	    .log().all();
   }
	
 
	// @Test
	void createUser() {
	  
	 HashMap data= new HashMap();
	   data.put("name", "Kalpesh");
	   data.put("Job", "QA");

	given()
	    .contentType("application/json")
	    .body(data)
	 
	    .when()
	    .post("https://reqres.in/api/users")       //Post  Request
	   
	    .then()
	    .statusCode(201)
	    .log().all();
	
	}
	
	
	 int id;
		
	    @Test  (priority = 2)    
		void createUser1() {
		  
		 HashMap data= new HashMap();
		  
		   data.put("name", "Kalpesh");
		   data.put("Job", "QA");

		id= given()
		    .contentType("application/json")
		    .body(data)
		 
		    .when()
		    .post("https://reqres.in/api/users")
		    .jsonPath().getInt("id");
		 
		//.then()
		 //  .statusCode(201)
		 //  .log().all();
		
		}
	    
	@Test (priority =3 ,dependsOnMethods = {"createUser1"})   // depending on post request
	void UpdateUser() {
		
	       HashMap data= new HashMap();
	     data.put("name", "Kalpesh Patil");
	     data.put("Job", "Automation Test Engineer");

	     given()
	       .contentType("application/json")
	        .body(data)
	  
	     .when()
	        .put("https://reqres.in/api/users/"+id)              // Put Reuest
	        
	    .then()
	      .statusCode(200)
	      .log().all();

	}
	
	@Test ( priority = 4)
   	void DeleteUser() {                                     //Depending on post
   		
   		given()
   		
   		.when()
   		    .delete("https://reqres.in/api/users/"+ id)        //Delete Request
   		.then()
   		   .statusCode(204)
   		   .log().all();
   	}
   
	    
	    
	
   	 
   	 
   		
   	
   
    
    
	
	
}
