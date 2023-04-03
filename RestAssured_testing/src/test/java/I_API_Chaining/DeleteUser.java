package I_API_Chaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DeleteUser {
	
	@Test
	void test_DeleteUser(ITestContext context)
	{            
		
		String bearerToken ="ef9f4460a5647651c411cd2ae14f1a8d85c4e3514ec5cdc5dd3c5d38ff5392af";
		
		 Object id = context.getAttribute("user_id"); // id this is from Create user request
		
		        given()
		         .header("Authorization","Bearer "+bearerToken)
		         .param("id", id)
	           .when()
	                 .delete("https://reqres.in/api/users")     //website changed  
	           .then()
	             .statusCode(204)
	             .log().all() ;
	                
}
}