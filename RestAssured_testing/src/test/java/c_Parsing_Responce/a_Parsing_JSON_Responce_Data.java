package c_Parsing_Responce;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/*   Parsing Response
        1) Parsing JSON response using Json path
        2) Parsing XML response using XML Path           */

public class a_Parsing_JSON_Responce_Data {

	 //1) Parsing JSON response using Json path
	
	//@Test (priority = 1)
	void testJSON_response_data () 
	{
	       // Approch 1
	      
		 given()
      	     .contentType(ContentType.JSON)
      	 .when()
      	     .get("https://reqres.in/api/users?page=2")   
      	 .then()
      	  .statusCode(200)
      	  .header("Content-Type","application/json; charset=utf-8")
      	  .body("data[5].avatar",equalTo("https://reqres.in/img/faces/12-image.jpg"));  
		//data[5].avatar findout from jsonpathfiner website
	}


       // @Test (priority = 2)
		void testJSON_response_data1 () 
		{
		      // Approch 2
		     
    Response res= given()
	      	     .contentType(ContentType.JSON)
	      	    .when()
	      	       .get("https://reqres.in/api/users?page=2");  
	      
	   
    
	    Assert.assertEquals(res.getStatusCode(),200);          // validation1
	    Assert.assertEquals(res.header("Content-Type"), "application/json; charset=utf-8");   // validation2
         
	    String bookname = res.jsonPath().get("data[5].avatar").toString();
       
	    Assert.assertEquals( bookname , "https://reqres.in/img/faces/12-image.jpg");  //validation 3
		
		}
		
             // Apporch 2 More example
	     
		    @Test (priority = 1)
			void testJSON_response_body_data () 
			{
			      
	     Response res= given()
		      	          .contentType(ContentType.JSON)
		      	      .when()
		      	          .get("https://reqres.in/api/users?page=2");  
		      
		      	  
	       Assert.assertEquals(res.getStatusCode(),200);          // validation1
		   Assert.assertEquals(res.header("Content-Type"), "application/json; charset=utf-8");   // validation2
	         
		   String bookname = res.jsonPath().get("data[5].avatar").toString();
	       
	     	Assert.assertEquals( bookname , "https://reqres.in/img/faces/12-image.jpg");  //validation
			
			//JSON Object class    
			
	JSONObject jo=new JSONObject(res.asString()); // converting responce in json objcet  type

   for( int i=0; i<jo.length();i++)
     {                //json object-> jsonarray -> jjson Object convert
    	String  emails=  jo.getJSONArray("data").getJSONObject(i).get("email").toString();
           System.out.println(emails);
     }   
			
         boolean status= false;
		 
          for( int i=0; i<jo.length();i++)
		 {
		    String  emails=  jo.getJSONArray("data").getJSONObject(i).get("email").toString();
		         
		    if (emails.equals("rachel.howell@reqres.in"))
		            { status = true;
		               break ;}
		        } 
	      
         Assert.assertEquals(status, true);
			
			}








}