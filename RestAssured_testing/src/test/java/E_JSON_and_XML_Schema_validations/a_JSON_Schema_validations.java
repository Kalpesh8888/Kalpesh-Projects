package E_JSON_and_XML_Schema_validations;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

 /*     Json ---> to jsonschema converter
     
     1)  https://jsonformatter.org/json-to-jsonschema      
     2) https://www.convertsimple.com/convert-json-to-json-schema  */

public class a_JSON_Schema_validations {

      @Test
      void JsonSchemaValidation() {
    	  
    	  given()
    	   	 
    	   	 .when()
    	   	     .get("https://reqres.in/api/users?page=2")  
    	   	 .then()
    	         .assertThat().body(matchesJsonSchemaInClasspath("storeJsonschema.json"));
      
      
      
      }















}
