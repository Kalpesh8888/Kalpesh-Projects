package I_API_Chaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Get_Usersdata {

	@Test
	void test_GetUser( ITestContext context) {

		String bearerToken = "ef9f4460a5647651c411cd2ae14f1a8d85c4e3514ec5cdc5dd3c5d38ff5392af";
		
		 Object id = context.getAttribute("user_id"); // id this is from create user request
      // int  id = 109;
		  given()
	         .header("Authorization","Bearer "+ bearerToken)
	         .param("id", id)
	     .when()
            .get("https://gorest.co.in/public/v2/users")
		  .then()
            .statusCode(200)
           .log().all() ;
}}
