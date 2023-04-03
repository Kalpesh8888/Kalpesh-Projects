package E_JSON_and_XML_Schema_validations;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;

 /*     XML ---> to-xsd-xml-schema/converter
    1)https://www.liquid-technologies.com/online-xml-to-xsd-converter
    2) https://www.convertsimple.com/convert-xml-to-xsd-xml-schema/   */

public class b_XML_Schema_Validation {

	
	 @Test
     void XMLSchemaValidation() 
	 {
   	  
   	        given()
   	   	 
   	   	   .when()
   	   	     .get("http://restapi.adequateshop.com/api/Traveler")  
   	   	   .then()
   	           .assertThat().body(matchesXsdInClasspath("storeXMLschema.xsd"));
   	         
	
}
	 

}
