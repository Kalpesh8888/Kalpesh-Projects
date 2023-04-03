package b_PathAndQuary_Parameters;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;


/*Parameters
     1) Path Parameters
     2)Query parameters    */

public class a_Path_and_Quary_paramerter {
	
	  //  url  - https://reqres.in/api/users?page=2&id=7,
	
 @Test	
 void Test_Path_and_Quary_paramerter() {
	
	given()
		.pathParam("Mypath","users")      //path Parameter
	    .queryParam("page", 2)             //Quary Parameter
	    .queryParam("id", 7)               //Quary Parameter
	.when()
		.get("https://reqres.in/api/{Mypath}")
		
	 .then()
	     .statusCode(200)
	     .log().all();
	
}
	










}
