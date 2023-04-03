package I_API_Chaining;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class CreateUser {
	
	
	@Test
	void test_createUser(ITestContext context)
	{
		   Faker faker = new Faker();

	     JSONObject data=new JSONObject();
	
	    data.put("name", faker.name().fullName());
		data.put("gender","male");
		data.put("email",faker.internet().emailAddress());
		data.put("Status", "inactive");
	  
		
		String bearerToken = "ef9f4460a5647651c411cd2ae14f1a8d85c4e3514ec5cdc5dd3c5d38ff5392af";
         
	        int  id = given()
	                   .header("Authorization","Bearer "+bearerToken)
	                   .contentType("application/json")
                       .body(data.toString())
	                .when()
	                     .post("https://reqres.in/api/users")       // website changed
	                     .jsonPath().getInt("id");
	          
	               
	                   
	    
	   System.out.println("Generating Id is ===>"+ id);     // 599 we got  
		
       context.setAttribute("user_id", id);
	}
	

}
