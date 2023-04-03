package I_API_Chaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser {
	

		@Test
		void test_UpdateUser(ITestContext context)
		{
			 Object id =  context.getAttribute("user_id"); // id this is from Create user request
			
			Faker faker = new Faker();

		     JSONObject data=new JSONObject();
	
			data.put("email",faker.internet().emailAddress());
			data.put("Status", "active");
		  
			
			String bearerToken = "ef9f4460a5647651c411cd2ae14f1a8d85c4e3514ec5cdc5dd3c5d38ff5392af";
	                  
			           given()
		                   .header("Authorization","Bearer "+ bearerToken)
		                   .contentType("application/json")
	                       .body(data.toString())
	                       .param("id", id)
		               .when()
		                     .put("https://reqres.in/api/users/")      //web site changed
		               .then()
		                    .statusCode(200)
		                   .log().all();
		   
			
		
	 
}
}